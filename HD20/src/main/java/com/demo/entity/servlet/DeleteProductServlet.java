package com.demo.entity.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.demo.entity.dao.ProductDaoImpl;


@WebServlet("/DeleteProductServlet")
public class DeleteProductServlet extends HttpServlet {
	
	ProductDaoImpl pimpl;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		pimpl = new ProductDaoImpl();
		
		pimpl.deleteProduct(id);
		
		
	}

}
