package com.sapient.movie.config.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.movie.config.model.Theatre;
import com.sapient.movie.config.service.TheatreService;

@RestController
@RequestMapping("/theatres")
public class TheatreController {

	@Autowired
	TheatreService theatreservice;

	/*
	 * @RequestMapping("/theatres") public String displayTheatreInfo() { return
	 * "Theatre Entity"; }
	 */

	@GetMapping(path = "/getAllTheatres")
	public List<Theatre> getTheatres() {
		return theatreservice.getTheatres();

	}

	@GetMapping(path = "/getTheatreByName/{name}")
	public Theatre getTheatreByName(@PathVariable String name) {
		return theatreservice.getTheatreByName(name);

	}

	@GetMapping(path = "/getTheatreByLocation/{location}")
	public Theatre getTheatreByLocation(@PathVariable String location) {
		return theatreservice.getTheatreByLoaction(location);

	}

	@PostMapping()
	public String createTheatre(@RequestBody Theatre theatre) {
		theatreservice.addTheatre(theatre);
		return "Theatre added";

	}

}
