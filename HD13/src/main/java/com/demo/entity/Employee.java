package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eId;
	private String eName;
	private int salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Employee(String eName, int salary) {
		super();
		this.eName = eName;
		this.salary = salary;
	}



	public Employee(int eId, String eName, int salary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
	}



	public int geteId() {
		return eId;
	}



	public void seteId(int eId) {
		this.eId = eId;
	}



	public String geteName() {
		return eName;
	}



	public void seteName(String eName) {
		this.eName = eName;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", salary=" + salary + "]";
	}
	
	
	

}
