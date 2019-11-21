
package com.sapient.movie.config.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.movie.config.model.Showtimings;
import com.sapient.movie.config.repository.ShowTimingRepository;
import com.sapient.movie.config.service.ShowTimingsService;

@Service
public class ShowTimingsServiceImpl implements ShowTimingsService {

	@Autowired
	ShowTimingRepository showtimingrepository;

	@Override
	public void addShowTiming(Showtimings showtimig) {
		showtimingrepository.save(showtimig);

	}

	@Override
	public List<Showtimings> getShowTimings() {
		return (List<Showtimings>) showtimingrepository.findAll();
	}

	@Override
	public Showtimings getShowTimingsByStarttime(Date startTime) {
		return showtimingrepository.findByStarttime(startTime);
	}

}
