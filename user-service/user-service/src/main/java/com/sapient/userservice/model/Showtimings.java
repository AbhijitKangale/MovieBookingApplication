package com.sapient.userservice.model;

import java.util.Date;

import lombok.Data;

@Data
public class Showtimings {

	private int showtimingid;

	private Date starttime;

	private Date endtime;

}
