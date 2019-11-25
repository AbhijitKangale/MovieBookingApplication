package com.sapient.userservice.service;

import com.sapient.userservice.bookingservice.response.BookingDetail;
import com.sapient.userservice.movieservice.response.Movie;

public interface IUserService {
	
	public Movie searchMovie(String movie);
	public BookingDetail bookMovie(BookingDetail bookingDetail);

}
