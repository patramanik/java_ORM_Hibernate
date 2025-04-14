package com.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	Set<Courses> courses = new HashSet<Courses>();

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String name, Set<Courses> courses) {
		super();
		this.sid = sid;
		this.name = name;
		this.courses = courses;
	}

	public Student(String name, Set<Courses> courses) {
		super();
		this.name = name;
		this.courses = courses;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Courses> getCourses() {
		return courses;
	}

	public void setCourses(Set<Courses> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", courses=" + courses + "]";
	}
	

}
