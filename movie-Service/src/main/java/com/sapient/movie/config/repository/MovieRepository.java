package com.sapient.movie.config.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sapient.movie.config.model.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {

	public Movie findByMovieName(String name);

	public List<Movie> findByLanguage(String language);

}
