package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Address;
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
        
        Address add = new Address("belda","wb",721424);
        
        Person person = new Person(101,"Manik",add);
        
        s.save(person);
        
        t.commit();
        
//        	Person p1= (Person) s.get(Person.class, 1);
//        	
//        	p1.setName("kumar");
//        	
//        	s.update(p1);
//        	
//        	t.commit();
        
//        	Person p2= (Person) s.get(Person.class, 1);
//        	s.delete(p2);
//   
//        	t.commit();
//        	
//        	s.close();
        	
    	
    }
}
