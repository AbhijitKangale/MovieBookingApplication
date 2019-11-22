package com.sapient.booking.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class BookingDetail {

	@Id
	private int bookingId;

	private int movieId;

	private int theatreId;

	private int userId;

	private int showTimingId;

	private boolean confirmation;

	private Date bookingTime;

	private String message;

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(final int bookingId) {
		this.bookingId = bookingId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(final int movieId) {
		this.movieId = movieId;
	}

	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(final int theatreId) {
		this.theatreId = theatreId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(final int userId) {
		this.userId = userId;
	}

	public int getShowTimingId() {
		return showTimingId;
	}

	public void setShowTimingId(final int showTimingId) {
		this.showTimingId = showTimingId;
	}

	public boolean isConfirmation() {
		return confirmation;
	}

	public void setConfirmation(final boolean confirmation) {
		this.confirmation = confirmation;
	}

	public Date getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(final Date bookingTime) {
		this.bookingTime = bookingTime;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(final String message) {
		this.message = message;
	}

}
