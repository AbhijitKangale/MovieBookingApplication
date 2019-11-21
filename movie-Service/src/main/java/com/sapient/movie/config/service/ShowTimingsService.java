
package com.sapient.movie.config.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sapient.movie.config.model.Showtimings;

@Service
public interface ShowTimingsService {

	public void addShowTiming(Showtimings showtimig);

	public List<Showtimings> getShowTimings();

	public Showtimings getShowTimingsByStarttime(Date startTime);

}
