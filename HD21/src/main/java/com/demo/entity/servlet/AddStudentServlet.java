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

@WebServlet("/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {
	
	StudentDaoImpl simpl;
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String courseName = req.getParameter("course");
		
		
		Course cours = new Course(courseName);
		
		Student student = new Student(name,email,cours);
		
		simpl = new StudentDaoImpl();
		
		simpl.insertStudent(student,cours);
		
		System.out.println("Student Add");
		
		resp.sendRedirect("DisplayAllStudent");
		
	}

}
