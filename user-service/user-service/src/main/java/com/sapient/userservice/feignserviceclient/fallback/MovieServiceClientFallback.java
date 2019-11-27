package com.sapient.userservice.feignserviceclient.fallback;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sapient.userservice.feignserviceclient.MovieServiceClient;
import com.sapient.userservice.movieservice.response.Movie;

import lombok.extern.slf4j.Slf4j;
@Component
@Slf4j
public class MovieServiceClientFallback implements MovieServiceClient {

	@Override
	public List<Movie> getAllMovies() {
		log.error("movie-service is not available");
		return null;
	}

	@Override
	public Movie getMovieByName(String name) {
		// TODO Auto-generated method stub
		log.error("movie-service is not available");
		return new Movie();
		
	}

	@Override
	public List<Movie> getMovieByLanguage(String lang) {
		// TODO Auto-generated method stub
		return null;
	}

}
