package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.entity.Employee;
import com.demo.entity.Project;

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
        
        Employee emp = new Employee();
        emp.seteName("ram");
        
        Employee emp2 = new Employee();
        emp2.seteName("mohan");
        
        Project p1 = new Project();
        p1.setpName("To-Do");
        
        Project p2 = new Project();
        p2.setpName("Blog App");
        
        emp.getProjects().add(p1);
        emp.getProjects().add(p2);
        
        emp2.getProjects().add(p1);
        emp2.getProjects().add(p2);
        
        s.save(emp);
        s.save(emp2);
        
        t.commit();
        
        
    }
}
