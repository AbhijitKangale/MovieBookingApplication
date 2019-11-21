package com.sapient.movie.config.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.movie.config.model.Theatre;
import com.sapient.movie.config.repository.TheatreRepository;
import com.sapient.movie.config.service.TheatreService;

@Service
public class TheatreServiceImpl implements TheatreService {
	@Autowired
	TheatreRepository theatrerepository;

	public void addTheatre(Theatre theatre) {
		theatrerepository.save(theatre);
	}

	public Theatre getTheatreByName(String name) {
		return theatrerepository.findByTheatrename(name);

	}

	public List<Theatre> getTheatres() {
		return (List<Theatre>) theatrerepository.findAll();

	}

	@Override
	public Theatre getTheatreByLoaction(String location) {
		return theatrerepository.findByTheatrelocation(location);
	}
}
