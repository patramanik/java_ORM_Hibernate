package com.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Oders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "product_name")
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	List<OdersItem> items = new ArrayList<OdersItem>();


	public Oders() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Oders(String name, List<OdersItem> items) {
		super();
		this.name = name;
		this.items = items;
	}


	public Oders(int id, String name, List<OdersItem> items) {
		super();
		this.id = id;
		this.name = name;
		this.items = items;
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


	public List<OdersItem> getItems() {
		return items;
	}


	public void setItems(List<OdersItem> items) {
		this.items = items;
	}


	@Override
	public String toString() {
		return "Oders [id=" + id + ", name=" + name + ", items=" + items + "]";
	}

}
