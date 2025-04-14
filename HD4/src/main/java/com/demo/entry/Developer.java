package com.demo.entry;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Dev")
public class Developer extends Employee{

	private int bonus;

	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Developer(String name, int salary, int bonus) {
		super(name, salary);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Develeper [bonus=" + bonus + "]";
	}
	
	
}
