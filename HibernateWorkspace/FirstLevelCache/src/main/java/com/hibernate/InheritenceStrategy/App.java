package com.hibernate.InheritenceStrategy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entityClass.EmployeeFLCache;

public class App {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/hibernate/InheritenceStrategy/hibernate.cfg.xml");
		 SessionFactory sf= cfg.buildSessionFactory();
		 Session session1=sf.openSession();
		 Session session2=sf.openSession();
		 Transaction tx1=session1.beginTransaction();
		 Transaction tx2=session2.beginTransaction();
		 //insert data
//		 EmployeeFLCache employee1=new EmployeeFLCache(101,"madhuri","pune",20000);
//		 session.save(employee1);
//		 EmployeeFLCache employee2=new EmployeeFLCache(102,"madhu","nashik",25000);
//		 session.save(employee2);
		 
		 //*****************First Level Cache**************
		 EmployeeFLCache emp1 = session1.get(EmployeeFLCache.class, 101);
		System.out.println(emp1);
         EmployeeFLCache emp2 = session2.get(EmployeeFLCache.class, 101);
		  System.out.println(emp2);
	
		 tx1.commit();
		 session1.close();
		 tx2.commit();
		 session2.close();
		 

			//2 above Ex   o/p
//			 Hibernate: select ef1_0.id,ef1_0.city,ef1_0.name,ef1_0.salary from EmployeeFLCache ef1_0 where ef1_0.id=?
//					 Employee [id=101, name=madhuri, city=pune, salary=20000]
//					 Hibernate: select ef1_0.id,ef1_0.city,ef1_0.name,ef1_0.salary from EmployeeFLCache ef1_0 where ef1_0.id=?
//					 Employee [id=101, name=madhuri, city=pune, salary=20000]
		 
		 
		 
		 //1  o/p
		 
		 
//		 Session session=sf.openSession();
//		 Transaction tx=session.beginTransaction();
//		                EmployeeFLCache emp1 = session.get(EmployeeFLCache.class, 101);
//			              System.out.println(emp1);
//	                     EmployeeFLCache emp2 = session.get(EmployeeFLCache.class, 101);
//			                    System.out.println(emp2);
//			  
//			     tx.commit();
//				 session.close();
//		 Hibernate: select ef1_0.id,ef1_0.city,ef1_0.name,ef1_0.salary from EmployeeFLCache ef1_0 where ef1_0.id=?
//				 Employee [id=101, name=madhuri, city=pune, salary=20000]
//				 Employee [id=101, name=madhuri, city=pune, salary=20000]
		 

		 
	}

}
