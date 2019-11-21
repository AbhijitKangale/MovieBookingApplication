package com.sapient.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.userservice.service.IUserService;

@RestController
@RequestMapping("/user-service")
public class UserServiceController {
	@Autowired
	private IUserService userService;
	
	@GetMapping("/movie/{movie}")
	public void searchMovie(@PathVariable String movie) {
		
		this.userService.searchMovie(movie);
		
	}

}
