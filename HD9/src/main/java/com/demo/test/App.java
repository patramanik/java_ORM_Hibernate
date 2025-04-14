package com.demo.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.entity.Department;
import com.demo.entity.Employee;

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
        
        Department dept = new Department();
        dept.setDept_name("FSD");
        
        Employee e1 = new Employee();
        e1.setEname("manik");
        e1.setDepartment(dept);
        
        Employee e2 = new Employee();
        e2.setEname("kunal");
        e2.setDepartment(dept);
        
        List<Employee> employees = new ArrayList<Employee>();
        
        employees.add(e1);
        employees.add(e2);
        
        dept.setEmployees(employees);
        
        s.save(dept);
        
        t.commit();        
        
        
    }
}
