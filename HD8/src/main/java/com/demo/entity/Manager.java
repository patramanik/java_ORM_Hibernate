package com.demo.entity;

import javax.persistence.Entity;

@Entity
public class Manager  extends Employee{
	
	private int insentiv;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int insentiv) {
		super();
		this.insentiv = insentiv;
	}
	
	public Manager( String name, int salary, int insentiv) {
		super( name, salary);
		this.insentiv = insentiv;
	}

	public int getInsentiv() {
		return insentiv;
	}

	public void setInsentiv(int insentiv) {
		this.insentiv = insentiv;
	}
	

	@Override
	public String toString() {
		return "Manager [insentiv=" + insentiv + "]";
	}

	
	

	
}
