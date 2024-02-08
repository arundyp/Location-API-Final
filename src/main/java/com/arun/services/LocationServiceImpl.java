package com.arun.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arun.entity.Location;
import com.arun.repository.LocationRepository;
@Service
public class LocationServiceImpl implements LocationService {
	@Autowired
	private LocationRepository locationRepository;

	@Override
	public List<Location> getAllLocation(Long userId) {
		return this.locationRepository.findByUserId(userId);
	}

	@Override
	public Boolean createLocation(Location location) {
		Location save = this.locationRepository.save(location);
		if(save!=null)
		{
			return true;
		}
		return false;
		
		
	}

	@Override
	public Boolean updateLocation(Location location, Long userId) {
		
		return false;
	}

	@Override
	public void deleteLocation(long locationId) {
	
		
	}

}
