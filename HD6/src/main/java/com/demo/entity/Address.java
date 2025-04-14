package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id
	@GeneratedValue
	private int locationId;
	private String street;
	private String city;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int locationId, String street, String city) {
		super();
		this.locationId = locationId;
		this.street = street;
		this.city = city;
	}

	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [locationId=" + locationId + ", street=" + street + ", city=" + city + "]";
	}
	
	
	
	

}
