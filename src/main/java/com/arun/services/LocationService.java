package com.arun.services;

import java.util.List;

import com.arun.entity.Location;

public interface LocationService {
	
	public List<Location> getAllLocation(Long userId);
	public Boolean createLocation( Location locationModel);
	public Boolean updateLocation(Location locationModel, Long userId);
	public void deleteLocation( long locationId);
}
