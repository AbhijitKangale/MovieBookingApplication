package com.sapient.movie.config.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table
public class Showtimings {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	private int showtimingid;
	@Column
	@DateTimeFormat(style = "hh:mm")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "hh:mm")
	private Date starttime;
	@Column
	@DateTimeFormat(style = "hh:mm")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "hh:mm")
	private Date endtime;

	/*
	 * @ManyToMany(mappedBy = "showTimingsList", cascade = CascadeType.PERSIST,
	 * fetch = FetchType.EAGER) private Set<Movie> movieSet = new HashSet<>();
	 * 
	 * 
	 * public Set<Movie> getMovieSet() { return movieSet; }
	 * 
	 * public void setMovieSet(Set<Movie> movieSet) { this.movieSet = movieSet; }
	 */

	public void setShowtimingid(int showtimingid) {
		this.showtimingid = showtimingid;
	}

	public Showtimings(Date starttime, Date endtime) {
		super();
		this.starttime = starttime;
		this.endtime = endtime;
	}

	public Showtimings() {

	}

	public int getShowtimingid() {
		return showtimingid;
	}

	public void setShowtimingid(Integer showtimingid) {
		this.showtimingid = showtimingid;
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	@Override
	public String toString() {
		return "Showtimings [showtimingid=" + showtimingid + ", starttime=" + starttime + ", endtime=" + endtime + "]";
	}

}
