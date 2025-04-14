package com.demo.entity.dao;

import java.util.List;

import com.demo.entity.Product;

public interface ProductDao {
	
	public void insertProduct(Product p);
	
	public List<Product> desplayAllProduct();
	
	public void editProduct(Product p);
	
	public void deleteProduct(int id);

}
