package com.sapient.booking.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sapient.booking.model.BookingDetail;
import com.sapient.booking.serviceImpl.BookingServiceImpl;

@RestController
public class BookingController {

	
	@Autowired
	private BookingServiceImpl bookingServiceImpl;
	
	@Autowired
	RestTemplate resttemplate;

	@PostMapping("/book-ticket")
	public String bookingTicket(@RequestBody BookingDetail booking) {
		
		if(resttemplate.postForObject("http://payment-api/payment", booking,Boolean.class )) {
				bookingServiceImpl.Booking(booking);
			return "Booking has done";
		}
		 
		 return "Booking has not done please try again";
	  
		
	}

	@GetMapping("/booking-detail/{bookingId}")
	public BookingDetail getBookingInfo(@PathVariable("bookingId") int boookingId) {     
		return bookingServiceImpl.getBookingDetail(boookingId);
	}
}
