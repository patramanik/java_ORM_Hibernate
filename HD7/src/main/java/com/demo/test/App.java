package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.entity.Laptop;
import com.demo.entity.Student;

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
        
        
        Laptop lap = new Laptop("hp",50000);
        Student stu = new Student("kunal",lap);
        
        s.save(lap);
        s.save(stu);
        
        t.commit();

    }
}
