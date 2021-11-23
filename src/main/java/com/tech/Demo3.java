package com.tech;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tech.entity.Student;


public class Demo3 {

	public static void main(String[] args) 
	{
		Student s = new Student();
		s.setId(1003);
		s.setFirstName("Sandeep");
		s.setSecondName("Kumar");
		
       Configuration cfg = new Configuration().configure();
       cfg.addAnnotatedClass(Student.class);
       
       SessionFactory sf = cfg.buildSessionFactory();
       Session session = sf.openSession();
       
       Transaction ts = session.beginTransaction();
        // Saving data
       //session.save(s);
       //Update
//       Student std = (Student) session.get(Student.class,1001);
//       std.setFirstName("Candy");
//       session.update(std);
       
       // Fetch all records
       List sl = session.createQuery("Select firstName FROM Student").list();
       for (Object object : sl) 
       {
		  String name =  (String)object;
		  System.out.println(name);
	   }
       
       List<Student> studentList  = session.createQuery("FROM Student").list();    		   
       for (Student st : studentList) 
       {   
		   System.out.println("First Name :"+st.getFirstName());
	   }
       
       
       ts.commit();
       session.close();
       sf.close();
	}

}
