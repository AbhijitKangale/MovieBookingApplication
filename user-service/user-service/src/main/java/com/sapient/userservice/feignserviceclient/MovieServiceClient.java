package com.sapient.userservice.feignserviceclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sapient.userservice.movieservice.response.Movie;

@FeignClient("movie-service")
public interface MovieServiceClient {
	
	@GetMapping("/Movies/getAllMovies")
	public List<Movie> getAllMovies() ;

	@GetMapping("/Movies/getMovieByName/{name}")
	public Movie getMovieByName(@PathVariable String name);
	
	@GetMapping("/Movies/getMoviesByLanguage/{lang}")
	public List<Movie> getMovieByLanguage(@PathVariable String lang);

}
