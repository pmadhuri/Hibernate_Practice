package com.annoatations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entityClass.Employee;

public class App {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/annoatations/hibernate.cfg.xml");
		 SessionFactory sf= cfg.buildSessionFactory();
		 Session session=sf.openSession();
		 Transaction tx=session.beginTransaction();
		 Employee employee=new Employee();
		 employee.setName("madhuri");
		 employee.setEmail("guravmadhu@gmail.com");
		 employee.setSalary(30000.00);
		 employee.setAddress("Pune,Moshi");
		 session.save(employee);
		 tx.commit();
		 
		 session.close();

	}

}
