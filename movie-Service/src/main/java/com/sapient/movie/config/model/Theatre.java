package com.sapient.movie.config.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Theatre {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	private int theatreid;
	@Column
	private String theatrename;
	@Column
	private String theatrelocation;
	@Column
	private int theatrecapacity;

	/*
	 * @ManyToMany(mappedBy = "theatreList", cascade = CascadeType.PERSIST, fetch =
	 * FetchType.EAGER) private Set<Movie> movieSet = new HashSet<>();
	 */

	/*
	 * public Set<Movie> getMovieSet() { return movieSet; }
	 * 
	 * public void setMovieSet(Set<Movie> movieSet) { this.movieSet = movieSet; }
	 */

	public void setTheatreid(int theatreid) {
		this.theatreid = theatreid;
	}

	public Theatre(String theatrename, String theatrelocation, int theatrecapacity) {
		super();
		this.theatrename = theatrename;
		this.theatrelocation = theatrelocation;
		this.theatrecapacity = theatrecapacity;
	}

	public Theatre() {

	}

	public int getTheatreid() {
		return theatreid;
	}

	public void setTheatreid(Integer theatreid) {
		this.theatreid = theatreid;
	}

	public String getTheatrename() {
		return theatrename;
	}

	public void setTheatrename(String theatrename) {
		this.theatrename = theatrename;
	}

	public String getTheatrelocation() {
		return theatrelocation;
	}

	public void setTheatrelocation(String theatrelocation) {
		this.theatrelocation = theatrelocation;
	}

	public int getTheatrecapacity() {
		return theatrecapacity;
	}

	public void setTheatrecapacity(int theatrecapacity) {
		this.theatrecapacity = theatrecapacity;
	}

	@Override
	public String toString() {
		return "Theatre [theatreid=" + theatreid + ", theatrename=" + theatrename + ", theatrelocation="
				+ theatrelocation + ", theatrecapacity=" + theatrecapacity + "]";
	}

}
