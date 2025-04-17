package com.demo.entity.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.entity.Course;
import com.demo.entity.Student;

public class StudentDaoImpl implements StudentDao{
	
	Session sess;

	public StudentDaoImpl() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf =cfg.buildSessionFactory();
		sess = sf.openSession();
		
	}

	@Override
	public void insertStudent(Student s,Course c) {
		
		Transaction t = sess.beginTransaction();
		
		sess.save(c);
		sess.save(s);
		
		t.commit();
		
	}

	@Override
	public List<Course> displayAllCourses() {
		
		Transaction t =sess.beginTransaction();
		
		Query query = sess.createQuery("from Course");
		
		List<Course> list = query.list();
		
		
		return list;
	}

	@Override
	public List<Student> displayAllStudent() {
		
		Transaction t = sess.beginTransaction();
		
		Query query = sess.createQuery("from Student");
		
		List<Student> list = query.list();
		
		return list;
	}
	
	

}
