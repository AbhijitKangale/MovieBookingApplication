package com.sapient.userservice.feignserviceclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sapient.userservice.bookingservice.response.BookingDetail;
import com.sapient.userservice.feignserviceclient.fallback.BookingServiceClientFallback;

@FeignClient(name="booking-service", fallback = BookingServiceClientFallback.class)
public interface BookingServiceClient {
	
	@PostMapping("/book-ticket")
	public BookingDetail bookTicket(@RequestBody BookingDetail booking);

	@GetMapping("/booking-detail/{bookingId}")
	public BookingDetail getBookingInfo(@PathVariable("bookingId") int boookingId);

}
