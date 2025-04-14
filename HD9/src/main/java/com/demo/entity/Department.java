package com.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  dno;
	private String dept_name;
	
	@OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
	List<Employee> employees;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int dno, String dept_name, List<Employee> employees) {
		super();
		this.dno = dno;
		this.dept_name = dept_name;
		this.employees = employees;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [dno=" + dno + ", dept_name=" + dept_name + ", employees=" + employees + "]";
	}
	
	
}
