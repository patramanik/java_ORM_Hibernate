package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.entity.Address;
import com.demo.entity.Employee;

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
         
         Address add = new Address("abc","pune");
         
         Employee emp = new Employee("kumar",25000,add);
         
         s.save(add);
         s.save(emp);
         
         
         t.commit();
         
         
         
    }
}
