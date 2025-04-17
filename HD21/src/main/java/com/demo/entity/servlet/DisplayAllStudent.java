package com.demo.entity.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.demo.entity.Student;
import com.demo.entity.dao.StudentDaoImpl;

/**
 * Servlet implementation class DisplayAllStudent
 */
@WebServlet("/DisplayAllStudent")
public class DisplayAllStudent extends HttpServlet {

	StudentDaoImpl simpl;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		simpl = new StudentDaoImpl();
		List<Student> StudentList = simpl.displayAllStudent();
		
		req.setAttribute("StudentList", StudentList);
		
		RequestDispatcher rd = req.getRequestDispatcher("displayStudent.jsp");
		
		rd.forward(req, resp);
	}

}
