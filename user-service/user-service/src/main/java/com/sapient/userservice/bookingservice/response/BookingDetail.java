package com.sapient.userservice.bookingservice.response;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BookingDetail {

	private int bookingId;

	private int movieId;

	private int theatreId;

	private int userId;

	private int showTimingId;

	private boolean confirmation;

	private Date bookingTime;

	private String message;

}
