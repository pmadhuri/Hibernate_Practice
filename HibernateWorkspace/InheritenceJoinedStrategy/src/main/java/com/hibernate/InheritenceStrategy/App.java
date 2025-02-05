package com.hibernate.InheritenceStrategy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entityClass.EmployeeInheritenceEx;
import com.entityClass.StudentInheritenceEx;
import com.entityClass.UserInheitenceEx;



public class App {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/hibernate/InheritenceStrategy/hibernate.cfg.xml");
		 SessionFactory sf= cfg.buildSessionFactory();
		 Session session=sf.openSession();
		 Transaction tx=session.beginTransaction();
		 //
		 UserInheitenceEx user=new UserInheitenceEx();
		 user.setCity("Pune");
		 user.setAge(23);
		 user.setName("madhuri");
		 
		 //
		 StudentInheritenceEx student=new StudentInheritenceEx();
		 student.setAge(20);
		 student.setCity("mumbal");
		 student.setDept("IT");
		 student.setMarks(88);
		 student.setSchool("SSI");
		 student.setName("sandip");
		 //
		 EmployeeInheritenceEx emp=new EmployeeInheritenceEx();
		 emp.setEmail("gurav@gamil.com");
		 emp.setRole("dev");
		 emp.setSalary(4500);
		 emp.setCity("Nashik");
		 emp.setName("tanvi");
		 emp.setAge(25);
		 //
		 session.save(user);
		 session.save(student);
		 session.save(emp);
		 
		 tx.commit();
		 session.close();
	}

}
