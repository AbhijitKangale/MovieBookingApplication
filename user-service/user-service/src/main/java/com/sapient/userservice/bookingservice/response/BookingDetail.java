package com.sapient.userservice.bookingservice.response;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
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
