package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ename;
	
	@ManyToOne
	private Department department;


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int id, String ename) {
		super();
		this.id = id;
		this.ename = ename;
	}


	public Employee(int id, String ename, Department department) {
		super();
		this.id = id;
		this.ename = ename;
		this.department = department;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", department=" + department + "]";
	}
	
	
	
	

}
