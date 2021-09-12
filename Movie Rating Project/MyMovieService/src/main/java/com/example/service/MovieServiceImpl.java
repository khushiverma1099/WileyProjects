package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Movie;
import com.example.persistence.MovieDao;


@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao movieDao;
	
	@Override
	public Movie findMovieById(int id) {
		return movieDao.getById(id);
		
	}

}
