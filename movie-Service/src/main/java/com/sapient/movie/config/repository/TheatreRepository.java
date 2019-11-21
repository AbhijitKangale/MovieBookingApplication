package com.sapient.movie.config.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sapient.movie.config.model.Theatre;

@Repository
public interface TheatreRepository extends CrudRepository<Theatre, Integer> {
	public Theatre findByTheatrename(String theatrename);

	public Theatre findByTheatrelocation(String location);
}
