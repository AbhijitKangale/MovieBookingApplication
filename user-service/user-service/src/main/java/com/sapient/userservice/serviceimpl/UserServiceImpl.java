package com.sapient.userservice.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.sapient.userservice.model.Movie;
import com.sapient.userservice.service.IUserService;

public class UserServiceImpl implements IUserService {
	
	@Autowired
	private RestTemplate movieSearchRestTemplate;
	
	private String movieServiceUrl="movie-service/sapient/getMovieByName/";

	@Override
	public Movie searchMovie(String movie) {
		
		Movie movieObj = this.movieSearchRestTemplate.getForObject(movieServiceUrl+movie, Movie.class);
		return movieObj;
		
	}

}