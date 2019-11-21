package com.sapient.booking.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sapient.booking.model.BookingDetail;

@Repository
public interface BookingDao extends MongoRepository<BookingDetail, Long>  {
     
	BookingDetail findByBookingId(int bookingId);

	/* Booking findByBookingAndDisplayAds(String domain, boolean displayAds); */	
}
