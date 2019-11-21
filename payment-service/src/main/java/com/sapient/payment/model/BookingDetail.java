/**
 * 
 */
package com.sapient.payment.model;

/**
 * @author bardas1
 *
 */
public class BookingDetail {

	private int bookingId;

	private int movieId;

	private int theatreId;

	private int userId;

	private int showTimingId;

	/**
	 * @return the bookingId
	 */
	public int getBookingId() {
		return bookingId;
	}

	/**
	 * @param bookingId the bookingId to set
	 */
	public void setBookingId(final int bookingId) {
		this.bookingId = bookingId;
	}

	/**
	 * @return the movieId
	 */
	public int getMovieId() {
		return movieId;
	}

	/**
	 * @param movieId the movieId to set
	 */
	public void setMovieId(final int movieId) {
		this.movieId = movieId;
	}

	/**
	 * @return the theatreId
	 */
	public int getTheatreId() {
		return theatreId;
	}

	/**
	 * @param theatreId the theatreId to set
	 */
	public void setTheatreId(final int theatreId) {
		this.theatreId = theatreId;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(final int userId) {
		this.userId = userId;
	}

	/**
	 * @return the showTimingId
	 */
	public int getShowTimingId() {
		return showTimingId;
	}

	/**
	 * @param showTimingId the showTimingId to set
	 */
	public void setShowTimingId(final int showTimingId) {
		this.showTimingId = showTimingId;
	}

}
