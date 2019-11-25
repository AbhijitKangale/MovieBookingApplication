package com.sapient.userservice.movieservice.response;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Showtimings {
	
	private int showtimingid;
	private Date starttime;
	private Date endtime;
	
}
