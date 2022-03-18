//Ananthakrishnan V S
package com.capg.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="location")
public class Location {
	private int locationId;
	private String name;
	private String code;
	private String country;
	private String airportName;
	
	
	
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Location(int locationId, String name, String code, String country, String airportName) {
		super();
		this.locationId = locationId;
		this.name = name;
		this.code = code;
		this.country = country;
		this.airportName = airportName;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	
	

}