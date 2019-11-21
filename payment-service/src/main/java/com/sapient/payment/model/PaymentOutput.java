/**
 * 
 */
package com.sapient.payment.model;

/**
 * @author bardas1
 *
 */
public class PaymentOutput {

	private BookingDetail bookingDetail;

	private boolean success;

	private String message;

	/**
	 * @return the bookingDetail
	 */
	public BookingDetail getBookingDetail() {
		return bookingDetail;
	}

	/**
	 * @param bookingDetail the bookingDetail to set
	 */
	public void setBookingDetail(BookingDetail bookingDetail) {
		this.bookingDetail = bookingDetail;
	}

	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
