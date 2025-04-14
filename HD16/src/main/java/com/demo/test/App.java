package com.demo.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.entity.Category;
import com.demo.entity.Products;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        
        Configuration cfg = new Configuration();
        
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session s =sf.openSession();
        
        Transaction t = s.beginTransaction();
        
        Category c1 = new Category();
        c1.setcName("phone");
        
        Products p1=new Products();
        p1.setpName("iqoo");
        p1.setPrice(35000);
        p1.setCategory(c1);
        
        Products p2=new Products();
        p2.setpName("vivo");
        p2.setPrice(45000);
        p2.setCategory(c1);
        
        List<Products> products = new ArrayList<Products>();
        products.add(p1);
        products.add(p2);
        
        c1.setProducts(products);
        s.save(c1);
        
        t.commit();
    }
}
