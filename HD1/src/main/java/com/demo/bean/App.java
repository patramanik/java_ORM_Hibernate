package com.demo.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.entity.Employee;


public class App 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "welcom to Hibernate" );
        
        Configuration cfg = new Configuration();
        
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session s =sf.openSession();
        
        Transaction t = s.beginTransaction();
        
        Employee e1 = new Employee();
        
        e1.setEmpid(101);
        
        e1.setName("abc");
        
        e1.setSal(10000);        
        
        s.save(e1);
        
        t.commit();
        
        s.close();
        
        
        
    }
}
