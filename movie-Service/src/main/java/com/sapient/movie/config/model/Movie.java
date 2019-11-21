package com.sapient.movie.config.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	private long movieId;

	@Column(nullable = false)
	private String movieName;

	@Column(nullable = false)
	private String language;

	@Column(nullable = false)
	private Date releaseDate;

	private int imdbRating;

	private String movieLen;

	@OneToOne
	private Theatre theatre;

	@OneToOne
	private Showtimings showtimings;

	public Movie(String movieName, String language, Date releaseDate, int imdbRating, String movieLen,
			Theatre theatreList, Showtimings showTimingsList) {
		super();
		this.movieName = movieName;
		this.language = language;
		this.releaseDate = releaseDate;
		this.imdbRating = imdbRating;
		this.movieLen = movieLen;
		this.theatre = theatreList;
		this.showtimings = showTimingsList;
	}

	public Movie() {
	}

	public Movie(long movieId, String movieName, String language, Date releaseDate, int imdbRating, String movieLen) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.language = language;
		this.releaseDate = releaseDate;
		this.imdbRating = imdbRating;
		this.movieLen = movieLen;
	}

	public Theatre getTheatre() {
		return theatre;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}

	public Showtimings getShowtimings() {
		return showtimings;
	}

	public void setShowtimings(Showtimings showtimings) {
		this.showtimings = showtimings;
	}

	public long getMovieId() {
		return movieId;
	}

	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(int imdbRating) {
		this.imdbRating = imdbRating;
	}

	public String getMovieLen() {
		return movieLen;
	}

	public void setMovieLen(String movieLen) {
		this.movieLen = movieLen;
	}

	/*
	 * public int getShowtimingid() { return showtimingid; }
	 * 
	 * public void setShowtimingid(int showtimingid) { this.showtimingid =
	 * showtimingid; }
	 */

}
