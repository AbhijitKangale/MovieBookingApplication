package com.sapient.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.userservice.bookingservice.response.BookingDetail;
import com.sapient.userservice.movieservice.response.Movie;
import com.sapient.userservice.service.IUserService;

@RestController
@RequestMapping("/user-service")
public class UserServiceController {
	@Autowired
	private IUserService userService;
	
	@GetMapping("/movie/{movie}")
	public Movie searchMovie(@PathVariable String movie) {
		
		return this.userService.searchMovie(movie);
		
		
	}
	
	@PostMapping("/movie/book-ticket")
	public BookingDetail bookMovie(@RequestBody BookingDetail bookingDetail) {
		
		return this.userService.bookMovie(bookingDetail);
		
	}

}
