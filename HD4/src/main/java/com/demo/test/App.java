package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.entry.Developer;
import com.demo.entry.Employee;
import com.demo.entry.Manager;

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
        
        Session s =sf.openSession();
        
        Transaction t = s.beginTransaction();
        
        Employee emp = new Employee("manik",25000);
        Developer dev = new Developer("kumar",50000,4000);
        Manager mag = new Manager("alak",42000,3000);
        
        s.save(emp);
        s.save(dev);
        s.save(mag);
        
        
        t.commit();
        
    }
}
