package com.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sno;
	private String name;
	
	@OneToMany(mappedBy = "school",cascade = CascadeType.ALL)
	List<Student> student;

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	public School(int sno, String name, List<Student> student) {
		super();
		this.sno = sno;
		this.name = name;
		this.student = student;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "School [sno=" + sno + ", name=" + name + ", student=" + student + "]";
	}
	
	
}
