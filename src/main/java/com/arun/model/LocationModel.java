package com.arun.model;

import com.arun.constant.LocationType;

import lombok.Data;

@Data
public class LocationModel {
	private LocationType locationType;
	private String plotNo;
	private String street;
	private String pincode;
	private String city;
	private String state;
	private String country;
	private Long userId;
	private Long openCloseTimeId;
	private String latitude;
	private String longitude;

}
