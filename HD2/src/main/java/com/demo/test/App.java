package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Person;

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
        
        Person person = new Person(101,"Manik","WB");
        
        s.save(person);
        
        t.commit();
        
        s.close();
        
    }
}
