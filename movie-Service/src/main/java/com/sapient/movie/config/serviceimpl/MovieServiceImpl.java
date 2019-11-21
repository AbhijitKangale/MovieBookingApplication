package com.sapient.movie.config.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.movie.config.model.Movie;
import com.sapient.movie.config.repository.MovieRepository;
import com.sapient.movie.config.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieRepository MovieRepository;

	@Override
	public List<Movie> getAllMovies() {
		return (List<Movie>) MovieRepository.findAll();
	}

	@Override
	public Movie getMovieByName(String name) {
		return MovieRepository.findByMovieName(name);
	}

	@Override
	public List<Movie> getMovieByLanguage(String language) {
		return (List<Movie>) MovieRepository.findByLanguage(language);
	}

	@Override
	public void addMovie(Movie movie) {
		MovieRepository.save(movie);
	}

}
