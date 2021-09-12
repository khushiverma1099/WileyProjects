package com.example.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.bean.RatingList;
import com.example.service.RatingService;


@RestController
public class RatingResource {

	@Autowired
	private RatingService ratingService;
	
	@GetMapping(value = "/rating/{id}",produces = "application/json")
	public RatingList getRatingById(@PathVariable("id") String id) {
		RatingList ratingList = new RatingList();
		ratingList.setRatings(ratingService.findRatingById(id));
		return ratingList;
	}
}
