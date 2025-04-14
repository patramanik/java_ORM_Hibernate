package com.demo.entity;

public class Employee {
	
	private int empid;
	private String name;
	private int sal;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String name, int sla) {
		super();
		this.empid = empid;
		this.name = name;
		this.sal = sla;
	}
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sla) {
		this.sal = sla;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", sla=" + sal + "]";
	}

}
