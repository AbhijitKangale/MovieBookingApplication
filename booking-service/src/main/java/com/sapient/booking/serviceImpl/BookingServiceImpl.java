package com.sapient.booking.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.booking.service.BookingService;
import com.sapient.booking.dao.BookingDao;
import com.sapient.booking.model.BookingDetail;

@Service
public class BookingServiceImpl implements BookingService {
	
	@Autowired 
	BookingDao bookingDao;

	@Override
	public void Booking( BookingDetail booking) {
         bookingDao.save(booking);   
		
	}
	
	public BookingDetail getBookingDetail(int bookingId) {
		  return bookingDao.findByBookingId(bookingId);
	}

	
	
	

}
