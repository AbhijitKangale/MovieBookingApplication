package com.sapient.movie.config.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.movie.config.model.Seats;
import com.sapient.movie.config.repository.SeatsRepository;
import com.sapient.movie.config.service.SeatsService;

@Service
public class SeatsServiceImpl implements SeatsService {

	@Autowired
	SeatsRepository seatsRepository;

	@Override
	public void addSeats(Seats seats) {
		seatsRepository.save(seats);
	}

}
