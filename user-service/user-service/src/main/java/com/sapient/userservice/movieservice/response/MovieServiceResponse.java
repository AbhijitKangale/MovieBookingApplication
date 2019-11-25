package com.sapient.userservice.movieservice.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MovieServiceResponse {
	
	private Movie movie;
	private MovieInputObject movieInputObject;
	private MovieOutputObject movieOutputObject;
	private Seats seats;
	private Showtimings showtimings;
	private Theatre theatre;
	

}
