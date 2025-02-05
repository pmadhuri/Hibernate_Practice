package com.hibernate.InheritenceStrategy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import org.hibernate.cfg.Configuration;

import com.entityClass.EmployeeSLCache;

public class App {

	public static void main(String[] args) {
		//EhcacheRegionFactory
		// for package name
		Configuration cfg=new Configuration();
		cfg.configure("com/hibernate/InheritenceStrategy/hibernate.cfg.xml");
		 SessionFactory sf= cfg.buildSessionFactory();
		 //insert Data
//		 Session session=sf.openSession();
//		 Transaction tx = session.beginTransaction();
		 
		 Session session1=sf.openSession();
		 Session session2=sf.openSession();
		 Session session3=sf.openSession();
		 Transaction tx1=session1.beginTransaction();
		 Transaction tx2=session2.beginTransaction();
		 Transaction tx3=session3.beginTransaction();
		 
		 
		 //insert data
//		 EmployeeSLCache employee1=new EmployeeSLCache(101,"madhuri","pune",20000);
//		 session.save(employee1);
//		 EmployeeSLCache employee2=new EmployeeSLCache(102,"madhu","nashik",25000);
//		 session.save(employee2);
//		 tx.commit();
//		 session.clear();
		 
		 //*****************First Level Cache**************
		 EmployeeSLCache emp1 = session1.get(EmployeeSLCache.class, 101);
		System.out.println(emp1);
         EmployeeSLCache emp2 = session2.get(EmployeeSLCache.class, 101);
		  System.out.println(emp2);
		  EmployeeSLCache emp3 = session3.get(EmployeeSLCache.class, 101);
		  System.out.println(emp3);
	
		 tx1.commit();
		 session1.close();
		 tx2.commit();
		 session2.close();
		 tx3.commit();
		 session3.close();
		 
		 //1  o/p
		 
//		 
//		 Hibernate: select employeesl0_.id as id1_0_0_, employeesl0_.city as city2_0_0_, employeesl0_.name as name3_0_0_, employeesl0_.salary as salary4_0_0_ from EmployeeSLCache employeesl0_ where employeesl0_.id=?
//				 Employee [id=101, name=madhuri, city=pune, salary=20000]
//				 Employee [id=101, name=madhuri, city=pune, salary=20000]
//				 Employee [id=101, name=madhuri, city=pune, salary=20000]
	}

}
