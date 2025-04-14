package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.entity.Courses;
import com.demo.entity.Student;

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
        
        Student stu = new Student();
        stu.setName("Ram");
        
        Student stu2 = new Student();
        stu2.setName("Kumar");
        
        Courses c1 = new Courses();
        c1.setName("Testing");

        Courses c2 = new Courses();
        c2.setName("FSD");

        stu.getCourses().add(c1);
        stu.getCourses().add(c2);

        stu2.getCourses().add(c1);
        stu2.getCourses().add(c2);
        
        
        s.save(stu);
        s.save(stu2);
        
        
        
        t.commit();
        
    }
}
