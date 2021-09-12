package com.example.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bean.Rating;


@Repository
public interface RatingDao extends JpaRepository<Rating, String> {

	public List<Rating> findByUserId(String userId);
	
}
