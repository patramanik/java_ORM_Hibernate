package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.entity.Oders;
import com.demo.entity.OdersItem;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "wellcom to Hibernate" );
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session s = sf.openSession();
        
        Transaction t = s.beginTransaction();
        
        Oders od1 = new Oders();
        od1.setName("mobile");
        
        Oders od2 = new Oders();
        od2.setName("TV");
        
        OdersItem odi1 = new OdersItem();
        odi1.setItemCount(3);
        
        OdersItem odi2 = new OdersItem();
        odi2.setItemCount(2);
        
        
        
        od1.getItems().add(odi1);
        od1.getItems().add(odi2);
        
        od2.getItems().add(odi1);
        od2.getItems().add(odi2);
        
        s.save(od1);
        s.save(od2);
        
        t.commit();
    }
}
