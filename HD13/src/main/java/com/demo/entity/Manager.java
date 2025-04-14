package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Manager extends Employee{
	
	private int insentave;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Manager(String eName, int salary, int insentave) {
		super(eName, salary);
		this.insentave = insentave;
	}

	public int getInsentave() {
		return insentave;
	}

	public void setInsentave(int insentave) {
		this.insentave = insentave;
	}

	@Override
	public String toString() {
		return "Manager [insentave=" + insentave + "]";
	}
	

}
