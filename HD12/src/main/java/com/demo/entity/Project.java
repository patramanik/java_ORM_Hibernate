package com.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pId;
	private String pName;
	
	@ManyToMany(mappedBy = "projects")
	Set<Employee> employees = new HashSet<Employee>();

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int pId, String pName, Set<Employee> employees) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.employees = employees;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Project [pId=" + pId + ", pName=" + pName + ", employees=" + employees + "]";
	}
	
	
	

}
