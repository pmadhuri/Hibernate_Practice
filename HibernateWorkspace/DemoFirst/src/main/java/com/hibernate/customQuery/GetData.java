package com.hibernate.customQuery;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entityClass.Passenger;

public class GetData {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/hibernate/customQuery/hibernate.cfg.xml");
		 SessionFactory sf= cfg.buildSessionFactory();
		 Session session=sf.openSession();
		 Transaction tx=session.beginTransaction();
		 
		//****************start*****************************
		String hql="from Passenger";
	      Query query=session.createQuery(hql);
	          List<Passenger> list=query.list();
	          for(Passenger passenger:list) {
	        	  System.out.println(passenger);
	        	  
	        	  //o/p
//	        	  Hibernate: select p1_0.pid,p1_0.age,p1_0.city,p1_0.name from Passenger p1_0
//	        	  Passenger [pid=100, name=madhuri, city=pune, age=30]
//	        	  Passenger [pid=112, name=madhuri, city=Pune, age=32]
//	        	  Passenger [pid=113, name=madhu, city=Mumbai, age=52]
//	        	  Passenger [pid=114, name=raju, city=Mumbai, age=55]
	        	  
	          }
	}

}
