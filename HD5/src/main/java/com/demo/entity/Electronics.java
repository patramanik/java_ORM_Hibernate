package com.demo.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "lectronics")
public class Electronics extends Product {
	
	private String garrenty;
	private String mobile;
	
	
	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Electronics( String pname, int pprice, String garrenty, String mobile) {
		super(pname, pprice);
		this.garrenty = garrenty;
		this.mobile = mobile;
	}

	public String getGarrenty() {
		return garrenty;
	}
	public void setGarrenty(String garrenty) {
		this.garrenty = garrenty;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Electronics [garrenty=" + garrenty + ", mobile=" + mobile + "]";
	}
	
	

}
