package com.sapient.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sapient.booking.model.BookingDetail;
import com.sapient.booking.model.PaymentOutput;
import com.sapient.booking.serviceImpl.BookingServiceImpl;

@RestController
public class BookingController {

	@Autowired
	private BookingServiceImpl bookingServiceImpl;

	@Autowired
	RestTemplate resttemplate;

	@PostMapping("/book-ticket")
	public BookingDetail bookingTicket(@RequestBody BookingDetail booking) {
		PaymentOutput payment = resttemplate.postForObject("http://payment-api/payment", booking, PaymentOutput.class);
		booking.setConfirmation(payment.isSuccess());
		booking.setMessage(payment.getMessage());
		return booking;
	}

	@GetMapping("/booking-detail/{bookingId}")
	public BookingDetail getBookingInfo(@PathVariable("bookingId") int boookingId) {
		return bookingServiceImpl.getBookingDetail(boookingId);
	}
}
