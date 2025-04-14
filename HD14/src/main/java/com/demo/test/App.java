package com.demo.test;

import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        
//        Random r = new Random();
//        
//        for(int i = 1;i<100;i++) {
//        	
//        	Student s1 =new Student();
//        	s1.setRollno(i);
//        	s1.setName("Name"+i);
//        	s1.setMarks(r.nextInt(100));
//        	
//        	session.save(s1);
//        }
        
//        //Multy pool 
//        Query query = session.createQuery("from  Student");
//        
//        List<Student> students = query.list();
//        
//        
//        for(Student s : students) {
//        	
//        	System.out.println(s);
//        }
        
        
        //Single row query
//        
//        Query query = session.createQuery("from Student where rollNo=40");
//        Student student = (Student) query.uniqueResult();
//        
//        System.out.println(student);
         
        
//        // partial row quary
//          //Query query=session.createQuery("select rollno, name from Student where marks>50 and marks<70");
//	      Query query=session.createQuery("select rollno, name from Student");
//	      List<Object []>obj = query.list();
//	      
//	      for(Object [] ob : obj) 
//	      {
//	    	  
//	    	  System.out.println(ob[0]+" "+ob[1]);
//	      }
        
        
        // aggregate Function
//        Query query  = session.createQuery("select max(marks) from Student");
// 
//        int marks = (int) query.uniqueResult();
//        System.out.println("maxMark "+marks);  
        
//        Query query  = session.createQuery("select min(marks) from Student");
//        
//        int marks = (int) query.uniqueResult();
//        System.out.println("minMark "+marks); 
        
//        Query query  = session.createQuery("select avg(marks) from Student");
//        
//        double marks = (double) query.uniqueResult();
//        System.out.println("avgMark "+marks); 
        
//        Query query  = session.createQuery("select sum(marks) from Student");
//        long marks = (long) query.uniqueResult();
//        System.out.println("avgMark "+marks); 
//        
//        Query query = session.createQuery("update Student set name =:n where rollno=:r");
//        query.setString("n", "Ram");
//        query.setInteger("r", 20);
//        query.executeUpdate();
        
        Query query = session.createQuery("delete from Student where rollno=:r");
        query.setInteger("r", 10);
        //or 
//        query.setParameter("r", 7);
        query.executeUpdate();
        
        t.commit();
        
    }
}
