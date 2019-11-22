package com.sapient.movie.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sapient.movie.config.model.BookingDetail;
import com.sapient.movie.config.model.MovieInputObject;

@RestController
@RequestMapping("/Details")
public class SendMovieUserDeatilsController {
	@Autowired
	RestTemplate resttemplate;
	
	@PostMapping(path="/sendDetails")
	public String sendDetailstoBooking(@RequestBody BookingDetail BookingDetail) {
		resttemplate.postForObject("http://booking-service/book-ticket", BookingDetail, BookingDetail.class);
		return "Booking details sent";
		
	}
	
	@GetMapping(path="/getBookingDetails/{id}")
	public String getBookingDetails(@PathVariable int id) {
		BookingDetail bookingdetail=resttemplate.getForObject("http://booking-service//booking-detail/"+id, BookingDetail.class);
		if(bookingdetail.isConfirmation()) {
			return bookingdetail.toString();
		}else {
		return "Booking Failed!!";
		}
		
	}

}
