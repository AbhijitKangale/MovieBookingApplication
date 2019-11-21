/**
 * 
 */
package com.sapient.payment.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.payment.model.BookingDetail;
import com.sapient.payment.model.PaymentOutput;

/**
 * @author bardas1
 *
 */
@RestController
public class PaymentController {

	@PostMapping("/payment")
	public String makePayment(@RequestBody BookingDetail bookingDetail) {
		PaymentOutput output = new PaymentOutput();
		output.setBookingDetail(bookingDetail);
		output.setSuccess(true);
		output.setMessage("Payment successful for booking id " + bookingDetail.getBookingId());
		// return output;
		return "Success";
	}
}
