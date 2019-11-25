package com.sapient.userservice.movieservice.response;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
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
