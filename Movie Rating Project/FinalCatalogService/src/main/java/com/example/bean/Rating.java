package com.example.bean;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Rating {
	
	private String ratingId;
	private String userId;
	private int movieId;
	private int rating;
}
