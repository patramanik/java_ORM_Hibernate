package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Laptop {
	
	@Id
	@GeneratedValue
	private int laptopId;
	private String laptop_name;
	private int price;
	

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Laptop(String laptop_name, int price) {
		super();
		this.laptop_name = laptop_name;
		this.price = price;
	}

	public Laptop(int laptopId, String laptop_name, int price) {
		super();
		this.laptopId = laptopId;
		this.laptop_name = laptop_name;
		this.price = price;
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptop_name() {
		return laptop_name;
	}

	public void setLaptop_name(String laptop_name) {
		this.laptop_name = laptop_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptop_name=" + laptop_name + ", price=" + price + "]";
	}
	
	
	

}
