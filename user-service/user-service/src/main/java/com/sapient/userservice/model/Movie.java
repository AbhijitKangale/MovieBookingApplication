package com.sapient.userservice.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Movie {

	private long movieId;

	private String movieName;

	private String language;

	private Date releaseDate;

	private int imdbRating;

	private String movieLen;

	private Theatre theatre;

	private Showtimings showtimings;

}
