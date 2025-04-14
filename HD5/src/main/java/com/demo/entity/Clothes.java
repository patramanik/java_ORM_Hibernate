package com.demo.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Clothes")
public class Clothes extends Product{
	
	private String colour;
	private String size;
	
	public Clothes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Clothes( String pname, int pprice, String colour, String size) {
		super(pname, pprice);
		this.colour = colour;
		this.size = size;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Clothes [colour=" + colour + ", size=" + size + "]";
	}
	
	
	
	
}
