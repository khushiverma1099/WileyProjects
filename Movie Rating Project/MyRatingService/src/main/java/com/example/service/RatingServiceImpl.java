package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bean.Rating;
import com.example.persistence.RatingDao;


@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingDao ratingDao;
	
	@Override
	public List<Rating> findRatingById(String id) {
		return ratingDao.findByUserId(id);
		
	}

}

