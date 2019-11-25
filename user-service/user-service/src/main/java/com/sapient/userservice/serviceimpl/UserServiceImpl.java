package com.sapient.userservice.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.userservice.bookingservice.response.BookingDetail;
import com.sapient.userservice.feignserviceclient.BookingServiceClient;
import com.sapient.userservice.feignserviceclient.MovieServiceClient;
import com.sapient.userservice.movieservice.response.Movie;
import com.sapient.userservice.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private MovieServiceClient movieServiceClient;
	
	@Autowired
	private BookingServiceClient bookingServiceClient;
	
	
	@Override
	public Movie searchMovie(String movieName) {
	
		Movie movie =  this.movieServiceClient.getMovieByName(movieName);
//		MovieServiceResponse movieServiceResponse = new MovieServiceResponse();
//		movieServiceResponse.setMovie(movie);
		return movie;
	}


	@Override
	public BookingDetail bookMovie(BookingDetail bookingDetail) {
		return this.bookingServiceClient.bookTicket(bookingDetail);
	}
	

}
