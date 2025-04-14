package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.entity.BillingAddress;
import com.demo.entity.Customer;

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
        
        Transaction t =s.beginTransaction();
        
        
        BillingAddress address = new BillingAddress("pune",411014);
        Customer c1 =new Customer("manik", address);
        
        s.save(address);
        s.save(c1);
       
        
        t.commit();
    }
}
