package com.arun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arun.entity.Location;
import com.arun.model.LocationModel;
import com.arun.services.LocationService;

@RestController
public class LocationController {
	@Autowired
	private LocationService locationService;

	@GetMapping("/location/users/{userId}")
	public List<Location> getAllLocation(@PathVariable Long userId) {
		
		return this.locationService.getAllLocation(userId);

	}

	@PostMapping("/location/users")
	public void createLocation(@RequestBody Location location) {
		
		this.locationService.createLocation(location);

	}

	@PutMapping("/location/users/{userid}")
	public void updateLocation(@RequestBody LocationModel locationModel, @PathVariable Long userId) {

	}

	@DeleteMapping("/location/{locationId}")
	public void deleteLocation(@PathVariable long locationId) {

	}

}
