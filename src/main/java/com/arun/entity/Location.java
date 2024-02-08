package com.arun.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.arun.constant.LocationType;

import lombok.Data;

@Entity
@Data
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long locationId;
	@Enumerated(EnumType.STRING)
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
