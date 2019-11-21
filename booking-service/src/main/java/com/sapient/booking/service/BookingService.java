package com.sapient.booking.service;

import com.sapient.booking.model.BookingDetail;

public interface BookingService {

	public void Booking(BookingDetail booking);
	
	public BookingDetail getBookingDetail(int bookingId);
}
