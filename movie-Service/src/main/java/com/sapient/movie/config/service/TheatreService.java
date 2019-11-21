package com.sapient.movie.config.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sapient.movie.config.model.Theatre;

@Service
public interface TheatreService {
	public void addTheatre(Theatre theatre);

	public Theatre getTheatreByName(String name);

	public List<Theatre> getTheatres();

	public Theatre getTheatreByLoaction(String location);

}
