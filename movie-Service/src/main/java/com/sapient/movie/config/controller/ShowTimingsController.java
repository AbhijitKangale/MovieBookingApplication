
package com.sapient.movie.config.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.movie.config.model.Showtimings;
import com.sapient.movie.config.service.ShowTimingsService;

@RestController
@RequestMapping("/showtimings")
public class ShowTimingsController {

	@Autowired
	ShowTimingsService showtimingsservice;

	@RequestMapping("/showtimings")
	public String displayShowTimingInfo() {
		return "Showtime Entity";
	}

	@GetMapping(path = "/getShowtimings")
	public List<Showtimings> getShowTimings() {
		return showtimingsservice.getShowTimings();

	}

	@PostMapping()
	public String createShowTimings(@RequestBody Showtimings showtimings) {
		showtimingsservice.addShowTiming(showtimings);
		return "Showtimings added";

	}

}
