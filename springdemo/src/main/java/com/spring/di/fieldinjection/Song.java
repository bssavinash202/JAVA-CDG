package com.spring.di.fieldinjection;

public class Song {
	private String title;
	private String genre;

	public void displaySongDetails() {
		System.out.println("Title: " + getTitle() + ", Genre: " + getGenre());
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Song(String title, String genre) {

		this.title = title;
		this.genre = genre;
	}

}
