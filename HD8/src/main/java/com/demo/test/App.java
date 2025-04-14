package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.entity.Employee;
import com.demo.entity.Manager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "welcom to Hibernate" );
        
        Configuration cfg = new Configuration();
        
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session s = sf.openSession();
        
        Transaction t = s.beginTransaction();
        
        Employee emp = new Employee("manik",20000);
        
        Manager manager = new Manager("kunal",30000,3300);
        
        s.save(emp);
        s.save(manager);
        
        t.commit();
        
        
       
    }
}
