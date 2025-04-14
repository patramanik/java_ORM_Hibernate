package com.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	private int id;
	private String name;
	private String paddress;
	
	public Person() {
		super();
	}
	
	public Person(int id, String name, String paddress) {
		super();
		this.id = id;
		this.name = name;
		this.paddress = paddress;
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

	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", paddress=" + paddress + "]";
	}
	

}
