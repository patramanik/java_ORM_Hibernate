package com.demo.entity.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.demo.entity.Course;
import com.demo.entity.Student;
import com.demo.entity.dao.StudentDaoImpl;


@WebServlet("/EditStudentServlet")
public class EditStudentServlet extends HttpServlet {
	
	StudentDaoImpl simpl;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		int rollNo = Integer.parseInt(req.getParameter("rollNo"));
    	String name = req.getParameter("name");
    	String email = req.getParameter("email");
  		String course = req.getParameter("course");
  		int cid = Integer.parseInt(req.getParameter("cid"));
  		
//  		System.out.println(rollNo);
//  		System.out.println(name);
//  		System.out.println(email);
//  		System.out.println(course);
  		Course c1 =new Course(cid,course);
  		Student s = new Student(rollNo,name,email,c1);
  		
  		simpl = new StudentDaoImpl();
  		
  		simpl.updateStudent(s, c1);
  		
  		System.out.println("Student Updated");
  		
  		resp.sendRedirect("DisplayAllStudent");
		
	}
	


}
