package com.demo.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@DiscriminatorValue(value = "Product")
@DiscriminatorColumn(name = "Type",discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Product {
	
	@Id
	@GeneratedValue
	private int pid;
	private String pname;
	private int pprice;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(int pid, String pname, int pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
	}
	
	public Product(String pname, int pprice) {
		super();
		this.pname = pname;
		this.pprice = pprice;
	}
	
	public int getPid() {
		return pid;
	}
	
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public String getPname() {
		return pname;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public int getPprice() {
		return pprice;
	}
	
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
	}
	
	
}
