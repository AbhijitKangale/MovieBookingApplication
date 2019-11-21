package com.sapient.movie.config.model;

import java.util.Date;

import javax.persistence.Column;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class MovieInputObject {

	private String movieName;

	private String language;

	private Date releaseDate;

	private int imdbRating;

	private String movieLen;

	private String theatreName;

	@DateTimeFormat(style = "hh:mm")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "hh:mm")
	private Date startTime;

	public MovieInputObject() {
	}

	public MovieInputObject(String movieName, String language, Date releaseDate, int imdbRating, String movieLen,
			String theatreName, Date startTime) {
		super();
		this.movieName = movieName;
		this.language = language;
		this.releaseDate = releaseDate;
		this.imdbRating = imdbRating;
		this.movieLen = movieLen;
		this.theatreName = theatreName;
		this.startTime = startTime;
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

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
