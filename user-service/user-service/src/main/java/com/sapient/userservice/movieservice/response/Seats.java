package com.sapient.userservice.movieservice.response;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Seats {

	private int seatId;

	private static int totalSeats = 30;

	private int availableSeats = 30;

	private double price = 250;

	private Movie movie;

}
