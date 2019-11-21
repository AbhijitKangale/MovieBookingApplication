package com.sapient.userservice.model;

import lombok.Data;

@Data
public class Seats {

	private int seatId;

	private static int totalSeats = 30;

	private int availableSeats = 30;

	private double price = 250;

	private Movie movie;

}
