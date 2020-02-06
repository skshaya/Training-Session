package com.example.crudspring2.models;

public class Rating {
	private String product_id;
	private int rating;
	
	public Rating(String product_id, int rating) {
		this.product_id=product_id;
		this.rating=rating;
		
	}
	
	
	
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

}
