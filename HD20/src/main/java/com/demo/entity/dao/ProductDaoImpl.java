package com.demo.entity.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.entity.Product;

public class ProductDaoImpl implements ProductDao{
	
	Session s;

	public ProductDaoImpl() {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		s = sf.openSession();
		
	}

	@Override
	public void insertProduct(Product p) {
		
		Transaction t = s.beginTransaction();
		
		s.save(p);
		
		t.commit();
	
		
	}

	@Override
	public List<Product> desplayAllProduct() {
		
		Transaction t =s.beginTransaction();
		
		Query query = s.createQuery("from Product");
		List<Product> list = query.list();
		
		return list;
	}

	@Override
	public void editProduct(Product p) {
		Transaction t = s.beginTransaction();
		
		s.update(p);
		
//		 Query query = s.createQuery("UPDATE Product p SET p.name=:newName,p.category=:newCategory,p.price=:newPrice,p.quantity=:newQuantity WHERE p.id=:id");
//		
//		query.setParameter("id", p.getId());
//		query.setParameter("newName", p.getName());
//		query.setParameter("newCategory", p.getCategory());
//		query.setParameter("newPrice", p.getPrice());
//		query.setParameter("newQuantity", p.getQuantity());
//		
//		int result = query.executeUpdate();
		System.out.println("Product Updated");
	}

	@Override
	public void deleteProduct(int id) {
		Transaction t = s.beginTransaction();
		
		Query query = s.createQuery("DELETE FROM Product p WHERE p.id =:id");
		
		query.setParameter("id", id);
		
		int result = query.executeUpdate();
		System.out.println("Rows affected: " + result);
		
	}

}
