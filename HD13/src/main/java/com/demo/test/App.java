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
        System.out.println( "Hello World!" );
        
        Configuration cfg = new Configuration();
        
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session s = sf.openSession();
        
        Transaction t = s.beginTransaction();
        
        Employee e1 = new Employee("manik",30000);
        Manager m1 = new Manager("subham",35000,2000);
        
        
        s.save(e1);
        s.save(m1);
        
        t.commit();
        
    }
}
