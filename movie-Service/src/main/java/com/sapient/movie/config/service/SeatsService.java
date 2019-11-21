package com.sapient.movie.config.service;

import org.springframework.stereotype.Service;

import com.sapient.movie.config.model.Seats;

@Service
public interface SeatsService {

	public void addSeats(Seats seats);

}
