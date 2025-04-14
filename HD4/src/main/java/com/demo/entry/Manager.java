package com.demo.entry;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Mag")
public class Manager extends Employee{
	
	private int incentive;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager( String name, int salary, int incentive) {
		super(name, salary);
		this.incentive = incentive;
	}

	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}

	@Override
	public String toString() {
		return "Manager [incentive=" + incentive + "]";
	}
	
	

}
