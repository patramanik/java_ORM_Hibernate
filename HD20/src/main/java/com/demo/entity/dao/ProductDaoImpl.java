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
		t.commit();
		return list;
	}

	@Override
	public void editProduct(Product p) {
		Transaction t = s.beginTransaction();
		
//		s.update(p);
		
		 Query query = s.createQuery("UPDATE Product p SET p.name=:newName,p.category=:newCategory,p.price=:newPrice,p.quantity=:newQuantity WHERE p.id=:id");
		
		query.setInteger("id", p.getId());
		query.setParameter("newName", p.getName());
		query.setParameter("newCategory", p.getCategory());
//		System.out.println(p.getCategory());
		query.setInteger("newPrice", p.getPrice());
		query.setInteger("newQuantity", p.getQuantity());
		
		int result = query.executeUpdate();
		
		System.out.println("Product Updated"+result);
		t.commit();
		s.close();
	}

	@Override
	public void deleteProduct(int id) {
		
		Transaction t = s.beginTransaction();
		
		Query query = s.createQuery("delete from Product  WHERE id =:p_id");
        query.setInteger("p_id", id);
				
		int result = query.executeUpdate();
		System.out.println("Rows affected: " + result);
		t.commit();
		
	}

}
