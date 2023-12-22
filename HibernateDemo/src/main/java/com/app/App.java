package com.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App 
{
    public static void main( String[] args )
    {
       
    	//1. create SessionFactory
    	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
    			addAnnotatedClass(Student.class).buildSessionFactory();
    	//2. Create Session
    	Session session = factory.openSession();
    	//3. begin the transaction
    	session.beginTransaction();
    	//4. perform Operations
    	//a. Create Student Object
		
		/*
		 * Student s = new Student(); s.setFirstName("Santhosh");
		 * s.setLastName("Kumar"); s.setAge(31);
		 * 
		 * session.save(s);
		 */
		 
  
    	//b. get Student - id
		/*
		 * int id = 1; Student s = session.get(Student.class, id);
		 * System.out.println(s);
		 */
    	
    	
    	//c. Update Student
		/*
		 * int id = 2; Student s = session.get(Student.class, id); s.setLastName("abc");
		 */
    	
    	//d. delete Student
		/*
		 * Student s = session.get(Student.class, 1); session.delete(s);
		 */
    	
    	//e. List of Students
    	Query query = session.createQuery("from Student");
    	List<Student> l = query.list();
    	for(Student s:l)
    	{
    		System.out.println(s);
    	}
    	
    	
    	//5. commit the transaction
    	session.getTransaction().commit();
    	
    	session.close();
    	factory.close();
    	
    	
    	
    }
}
