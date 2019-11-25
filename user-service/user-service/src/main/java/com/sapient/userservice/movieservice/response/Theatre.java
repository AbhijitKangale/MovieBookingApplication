package com.sapient.userservice.movieservice.response;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Theatre {
	
	private int theatreid;
	private String theatrename;
	private String theatrelocation;
	private int theatrecapacity;
}
