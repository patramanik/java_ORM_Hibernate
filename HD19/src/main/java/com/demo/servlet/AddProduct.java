package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.demo.dao.ProductDaoImp;
import com.demo.entity.Product;


@WebServlet("/AddProduct")
public class AddProduct extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		String name = req.getParameter("name");
		String category = req.getParameter("category");
		int price =Integer.parseInt(req.getParameter("price"));
		
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
		out.println("<h3>"+name+"</h3>");
		out.println("<h3>"+category+"</h3>");
		out.println("<h3>"+price+"</h3>");
		
		Product product = new Product();
		
		product.setName(name);
		product.setCategory(category);
		product.setPrice(price);
		
	//	ProductDaoImp proImp = new ProductDaoImp();
		
	//	proImp.addProduct();
		
	}

}
