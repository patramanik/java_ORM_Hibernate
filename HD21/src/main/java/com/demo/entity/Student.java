package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name = "roll_no")
	private int rollNO;
	private String name;
	private String email;
	
	@OneToOne
	Course course;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNO, String name, String email, Course course) {
		super();
		this.rollNO = rollNO;
		this.name = name;
		this.email = email;
		this.course = course;
	}

	public Student(String name, String email, Course course) {
		super();
		this.name = name;
		this.email = email;
		this.course = course;
	}

	public int getRollNO() {
		return rollNO;
	}

	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [rollNO=" + rollNO + ", name=" + name + ", email=" + email + ", course=" + course + "]";
	}

	
	
}
