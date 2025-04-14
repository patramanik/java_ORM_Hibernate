package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue
	private int cId;
	private String cName;
	
	@OneToOne
	BillingAddress address;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String cName, BillingAddress address) {
		super();
		this.cName = cName;
		this.address = address;
	}

	public Customer(int cId, String cName, BillingAddress address) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.address = address;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public BillingAddress getAddress() {
		return address;
	}

	public void setAddress(BillingAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", address=" + address + "]";
	}
	
	

}
