package com.demo.entity.dao;

import java.util.List;

import com.demo.entity.Course;
import com.demo.entity.Student;

public interface StudentDao {

	public void insertStudent(Student s,Course c);
	
	public List<Course> displayAllCourses();
	
	public List<Student> displayAllStudent();
}
