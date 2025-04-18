package com.demo.entity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


//for secand level
//@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
//@Cacheable
@Entity
public class Employee {

	@Id
	private int eId;
	private String eName;
	private String city;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eId, String eName, String city) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.city = city;
	}
	public Employee(String eName, String city) {
		super();
		this.eName = eName;
		this.city = city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", city=" + city + "]";
	}
	
}
