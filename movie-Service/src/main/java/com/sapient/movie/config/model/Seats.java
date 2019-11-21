package com.sapient.movie.config.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Seats {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	private int seatId;

	@Column(nullable = false)
	private static int totalSeats = 30;

	@Column(nullable = false)
	private int availableSeats = 30;

	@Column(nullable = false)
	private double price = 250;

	@OneToOne
	private Movie movie;

	public Seats() {

		this.availableSeats = 30;
		this.price = 150;
		this.totalSeats = 30;

	}

	public Seats(Movie movie) {
		this.movie = movie;
		this.availableSeats = 30;
		this.price = 150;
		this.totalSeats = 30;

	}

	public Seats(int availableSeats, double price, Movie movie) {
		super();
		this.availableSeats = availableSeats;
		this.price = price;
		this.movie = movie;
	}

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	public static int getTotalSeats() {
		return totalSeats;
	}

	public static void setTotalSeats(int totalSeats) {
		Seats.totalSeats = totalSeats;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
