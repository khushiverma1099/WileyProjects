package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Rating {
	@Id
	private String ratingId;
	private String userId;
	private int movieId;
	private int rating;
}
