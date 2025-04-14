package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pId;
	private String pName;
	private int price;
	
	@ManyToOne
	private Category category;

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(String pName, int price, Category category) {
		super();
		this.pName = pName;
		this.price = price;
		this.category = category;
	}

	public Products(int pId, String pName, int price, Category category) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.category = category;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Products [pId=" + pId + ", pName=" + pName + ", price=" + price + ", category=" + category + "]";
	}
	

}
