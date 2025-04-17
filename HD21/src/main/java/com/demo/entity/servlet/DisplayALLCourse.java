package com.demo.entity.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.demo.entity.Course;
import com.demo.entity.dao.StudentDaoImpl;

/**
 * Servlet implementation class DisplayALLCourse
 */
@WebServlet("/DisplayALLCourse")
public class DisplayALLCourse extends HttpServlet {

	StudentDaoImpl simpl;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		simpl = new StudentDaoImpl();
		
		List<Course> courseList = simpl.displayAllCourses();
		
		req.setAttribute("courseList", courseList);
		
		RequestDispatcher rd = req.getRequestDispatcher("displayCourse.jsp");
		
		rd.forward(req, resp);
	}

}
