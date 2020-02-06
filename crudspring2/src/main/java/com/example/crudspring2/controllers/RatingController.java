package com.example.crudspring2.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudspring2.models.Rating;

@RestController
@RequestMapping("/ratingdata")
public class RatingController {
	@RequestMapping(value="/{userId}")
 public Rating getRating(@PathVariable("userId") String userId) {
	 return new Rating(userId,4);
	}
	 
		@RequestMapping(value="/hello",method = RequestMethod.GET)
		 public String getRatings() {
			 return "hello";
	 
	 
 }
	

	
	
}
