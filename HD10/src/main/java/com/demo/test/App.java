package com.demo.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.entity.School;
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
        
        
        School s1 = new School();
        s1.setName("HIT");
        
        Student st1 = new Student();
        st1.setName("manik");
        st1.setSchool(s1);
        
        Student st2 = new Student();
        st2.setName("suman");
        st2.setSchool(s1);
        
        List<Student> students = new ArrayList<Student>();
        
        students.add(st1);
        students.add(st2);
        
        s1.setStudent(students);
        
        s.save(s1);
        
        t.commit();
        
        
    }
}
