package com.sapient.movie.config.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sapient.movie.config.model.Seats;

@Repository
public interface SeatsRepository extends CrudRepository<Seats, Integer> {

}
