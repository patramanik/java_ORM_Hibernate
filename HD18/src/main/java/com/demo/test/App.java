package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.entity.Employee;
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
        
        	
//        Employee e1 = new Employee(1, "kumar","pune");
//        Employee e2 = new Employee(2, "kunal","pune");
//        
//        s.save(e1);
//        s.save(e2);
        
        
//        Student s1 = new Student(1, "Ram", "wb");
//        Student s2 = new Student(2, "Sham", "wb");
//        s.save(s1);
//        s.save(s2);
//        
        
        
       
//       singal level cacheing
//        
//        Student stu1 = (Student) s.get(Student.class, 1);
//        System.out.println(stu1);
//        Student stu2 = (Student) s.get(Student.class, 1);
//        System.out.println(stu2);
//        
//        t.commit();
        
//        Employee emp1 = (Employee) s.get(Employee.class, 1);
//        System.out.println(emp1);
//        Employee emp2 = (Employee) s.get(Employee.class, 1);
//        System.out.println(emp2);
 
//        t.commit();
        
        //secand level cacheing
        
        Student stu = (Student) s.get(Student.class, 1);
        System.out.println(stu);
        t.commit();
        s.close();
        
        Session s2 = sf.openSession();
        Transaction t2 = s2.beginTransaction();
         
        Student st = (Student) s2.get(Student.class, 1);
        System.out.println(st);
        t2.commit();
        s2.close();
        
        
//        Employee emp3 = (Employee) s.get(Employee.class, 1);
//        System.out.println(emp3);
//        t.commit();
//        s.close();
//        
//        Session s2 = sf.openSession();
//        Transaction t2 = s2.beginTransaction();
//        Employee emp4 = (Employee) s2.get(Employee.class, 1);
//        System.out.println(emp4);
//        t2.commit();
//        s2.close();
        
        
        
        

        
    }
}
