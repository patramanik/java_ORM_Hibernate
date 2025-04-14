package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BillingAddress {
	
	@Id
	@GeneratedValue
	private int id;
	private String city;
	private int pin;
	
	public BillingAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BillingAddress(String city, int pin) {
		super();
		this.city = city;
		this.pin = pin;
	}

	public BillingAddress(int id, String city, int pin) {
		super();
		this.id = id;
		this.city = city;
		this.pin = pin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "BillingAddress [id=" + id + ", city=" + city + ", pin=" + pin + "]";
	}
	
	

}
