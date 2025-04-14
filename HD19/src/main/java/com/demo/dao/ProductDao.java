package com.demo.dao;

import java.util.List;

import com.demo.entity.Product;

public interface ProductDao {
	
	void addProduct();
	
	List<Product> getAllProduct();

}
