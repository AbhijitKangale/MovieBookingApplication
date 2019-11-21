package com.sapient.movie.config.model;

import java.util.Date;

public class MovieOutputObject {

	private String movie_name;

	private String theatrename;

	private String language;

	private Date release_date;

	private int imdb_rating;

	private String movie_len;

	private String theatrelocation;

	private int available_seats;

	private double price;

	/*
	 * @DateTimeFormat(style = "hh:mm")
	 * 
	 * @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "hh:mm") private Date
	 * starttime;
	 * 
	 * @DateTimeFormat(style = "hh:mm")
	 * 
	 * @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "hh:mm") private Date
	 * endtime;
	 */

	public String getTheatrename() {
		return theatrename;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public Date getRelease_date() {
		return release_date;
	}

	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}

	public int getImdb_rating() {
		return imdb_rating;
	}

	public void setImdb_rating(int imdb_rating) {
		this.imdb_rating = imdb_rating;
	}

	public String getMovie_len() {
		return movie_len;
	}

	public void setMovie_len(String movie_len) {
		this.movie_len = movie_len;
	}

	public int getAvailable_seats() {
		return available_seats;
	}

	public void setAvailable_seats(int available_seats) {
		this.available_seats = available_seats;
	}

	public void setTheatrename(String theatrename) {
		this.theatrename = theatrename;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getTheatrelocation() {
		return theatrelocation;
	}

	public void setTheatrelocation(String theatrelocation) {
		this.theatrelocation = theatrelocation;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
