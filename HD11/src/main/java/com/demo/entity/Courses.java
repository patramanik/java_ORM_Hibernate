package com.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Courses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String name;
	
	@ManyToMany(mappedBy = "courses")
	Set<Student> students = new HashSet<Student>();

	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Courses(int cid, String name, Set<Student> students) {
		super();
		this.cid = cid;
		this.name = name;
		this.students = students;
	}

	public Courses(String name, Set<Student> students) {
		super();
		this.name = name;
		this.students = students;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Courses [cid=" + cid + ", name=" + name + ", students=" + students + "]";
	}
	
	

}
