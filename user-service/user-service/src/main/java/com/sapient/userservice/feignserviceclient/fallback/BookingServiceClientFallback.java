package com.sapient.userservice.feignserviceclient.fallback;

import org.springframework.stereotype.Component;

import com.sapient.userservice.bookingservice.response.BookingDetail;
import com.sapient.userservice.feignserviceclient.BookingServiceClient;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class BookingServiceClientFallback implements BookingServiceClient{

	@Override
	public BookingDetail bookTicket(BookingDetail booking) {
		log.error("BookingServiceClientFallback.bookTicket::booking-service is not availabe");
		BookingDetail bookingDetail = BookingDetail.builder().bookingId(0).movieId(0).showTimingId(0).theatreId(0).build();
		return bookingDetail;
		
	}

	@Override
	public BookingDetail getBookingInfo(int boookingId) {
		log.error("booking-service is not available");
		return null;
	}

}
