package com.demo.entity.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.demo.entity.dao.StudentDaoImpl;

/**
 * Servlet implementation class DeleteCourseServlet
 */
@WebServlet("/DeleteStudentServlet")
public class DeleteStudentServlet extends HttpServlet {
	
	private StudentDaoImpl simpl;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int rollno = Integer.parseInt(req.getParameter("rollno"));
		int cid = Integer.parseInt(req.getParameter("cid"));
		
		System.out.println(rollno);
		System.out.println(cid);
		
		simpl = new StudentDaoImpl();
		simpl.deleteStudent(rollno, cid);
		
		System.out.println("Student Delete");
		
		resp.sendRedirect("DisplayAllStudent");
	
	}

	

}
