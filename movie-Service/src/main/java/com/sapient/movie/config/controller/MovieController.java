package com.sapient.movie.config.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.movie.config.model.Movie;
import com.sapient.movie.config.model.MovieInputObject;
import com.sapient.movie.config.model.Seats;
import com.sapient.movie.config.model.Showtimings;
import com.sapient.movie.config.model.Theatre;
import com.sapient.movie.config.service.MovieService;
import com.sapient.movie.config.service.SeatsService;
import com.sapient.movie.config.service.ShowTimingsService;
import com.sapient.movie.config.service.TheatreService;

@RestController
@RequestMapping("/Movies")
public class MovieController {

	@Autowired
	MovieService movieService;

	@Autowired
	SeatsService seatsService;

	@Autowired
	TheatreService theatreService;

	@Autowired
	ShowTimingsService showTimingsService;

	@GetMapping("/getAllMovies")
	public List<Movie> getAllMovies() {
		return movieService.getAllMovies();
	}

	@GetMapping("/getMovieByName/{name}")
	public Movie getMovieByName(@PathVariable String name) {
		return movieService.getMovieByName(name);
	}

	@GetMapping("/getMoviesByLanguage/{lang}")
	public List<Movie> getMovieByLanguage(@PathVariable String lang) {
		return movieService.getMovieByLanguage(lang);
	}

	@PostMapping("/AddMovie")
	public String addMovie(@RequestBody MovieInputObject MovieInputObject) {

		List<Theatre> theatreList = new ArrayList<Theatre>();
		Theatre theatre = theatreService.getTheatreByName(MovieInputObject.getTheatreName());
		theatreList.add(theatre);

		List<Showtimings> ShowtimingsList = new ArrayList<Showtimings>();
		Showtimings Showtimings = showTimingsService.getShowTimingsByStarttime(MovieInputObject.getStartTime());
		ShowtimingsList.add(Showtimings);

		Movie movie = new Movie(MovieInputObject.getMovieName(), MovieInputObject.getLanguage(),
				MovieInputObject.getReleaseDate(), MovieInputObject.getImdbRating(), MovieInputObject.getMovieLen(),
				theatre, Showtimings);

		movieService.addMovie(movie);
		Seats seats = new Seats(movie);
		seatsService.addSeats(seats);
		return "Movie added successfully";
	}

}
