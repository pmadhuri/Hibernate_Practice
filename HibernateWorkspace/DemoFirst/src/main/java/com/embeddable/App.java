package com.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entityClass.Employee;
import com.entityClass.Student;
import com.entityClass.Student_Address;

public class App {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/embeddable/hibernate.cfg.xml");
		 SessionFactory sf= cfg.buildSessionFactory();
		 Session session=sf.openSession();
		 Transaction tx=session.beginTransaction();
		 //
		 // Student_Address
		 Student_Address s_add=new Student_Address();
		 s_add.setCity("pune");
		 s_add.setState("maharashtra");
		 s_add.setZip("422303");
		 // Student
		 
		 Student student=new Student();
		 student.setSid(100);
		 student.setName("madhuri");
		 student.setEmail("guravmadhuri93@gmail.com");
		 student.setAddress(s_add);
		 //
		 session.save(student);
		 tx.commit();
		 
		 session.close();
	}

}
