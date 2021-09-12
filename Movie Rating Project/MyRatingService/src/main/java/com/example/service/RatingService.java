package com.example.service;

import java.util.List;

import com.example.bean.Rating;


public interface RatingService {

	List<Rating> findRatingById(String id);
}
