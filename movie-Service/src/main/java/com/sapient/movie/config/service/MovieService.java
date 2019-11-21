package com.sapient.movie.config.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sapient.movie.config.model.Movie;

@Service
public interface MovieService {

	public List<Movie> getAllMovies();

	public Movie getMovieByName(String name);

	public List<Movie> getMovieByLanguage(String language);

	public void addMovie(Movie movie);

}
