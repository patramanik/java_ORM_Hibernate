package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Emp")
public class Employee {
	
	@Id
	@GeneratedValue
	private int id;
	@Column(length = 20, name = "empName")
	private String name;
	@Column(length = 7)
	private int salary;
	
	@OneToOne
	Address address;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Employee(String name, int salary, Address address) {
		super();
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	

	public Employee(int id, String name, int salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}

	
	
	
	
	
}
