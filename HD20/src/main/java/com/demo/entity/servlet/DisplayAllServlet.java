package com.demo.entity.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.demo.entity.Product;
import com.demo.entity.dao.ProductDaoImpl;


@WebServlet("/DisplayAllServlet")
public class DisplayAllServlet extends HttpServlet {
	
	ProductDaoImpl pimpl;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		pimpl = new ProductDaoImpl();
		
		List<Product> list = pimpl.desplayAllProduct();
		
		request.setAttribute("list", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("displayAll.jsp");
		rd.forward(request, response);
		
	}

}
