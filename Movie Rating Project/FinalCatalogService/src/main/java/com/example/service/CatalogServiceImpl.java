package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.bean.Movie;
import com.example.bean.MovieCatalog;
import com.example.bean.MovieCatalogList;
import com.example.bean.Rating;
import com.example.bean.RatingList;


@Service
public class CatalogServiceImpl implements CatalogService {

	@Autowired
	private RestTemplate restTemplate;
	
	
	@Override
	public MovieCatalogList findMovieCatalogByUserId(String id) {
		
		List<MovieCatalog> movieCatalog = new ArrayList<MovieCatalog>();
		
		RatingList ratingList = restTemplate.getForObject("http://localhost:8082/rating/"+id, RatingList.class);
	
		for(Rating rating : ratingList.getRatings()) {
			
			Movie movie = restTemplate.getForObject("http://localhost:8084/movie/"+rating.getMovieId(), Movie.class);
			
			MovieCatalog movieCatalogs = new MovieCatalog(rating.getUserId(), movie.getMovieName(),rating.getRating());
		
			movieCatalog.add(movieCatalogs);
		}
		
		MovieCatalogList movieCatalogList = new MovieCatalogList(movieCatalog);
		
		return movieCatalogList;
	}

}
