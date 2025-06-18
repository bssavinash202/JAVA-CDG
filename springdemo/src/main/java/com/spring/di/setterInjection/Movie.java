package com.spring.di.setterInjection;

public class Movie {

	private String title;
	private double rating;
	private Director director;
	
	public void showMovieInfo() {
		System.out.println("Title: "+getTitle()+", Rating: "+getRating());
		getDirector().showInfo();
	}

	public String getTitle() {
		return title;
	}

	public double getRating() {
		return rating;
	}

	public Director getDirector() {
		return director;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public void setDirector(Director director) {
		this.director = director;
	}
	
}
