package com.sapient.userservice.movieservice.response;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
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
}
