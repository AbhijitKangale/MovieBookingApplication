package com.sapient.movie.config.repository;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sapient.movie.config.model.Showtimings;

@Repository
public interface ShowTimingRepository extends CrudRepository<Showtimings, Integer> {

	Showtimings findByStarttime(Date startTime);

}
