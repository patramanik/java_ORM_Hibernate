package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.entity.Clothes;
import com.demo.entity.Electronics;
import com.demo.entity.Product;

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
        
        Product ob1 = new Product("watch",3500);
        Clothes ob2 = new Clothes("shart",1200,"black","M");
        Electronics ob3 = new Electronics("moble",45000,"2Y","iqoo z9");
        
        s.save(ob1);
        s.save(ob2);
        s.save(ob3);
        
        t.commit();
        
    }
}
