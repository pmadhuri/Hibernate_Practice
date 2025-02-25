package com.hibernate.DemoFirst;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entityClass.Passenger;

public class GetData {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/hibernate/DemoFirst/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		//get and load method all same 
		//Passenger p=session.load(Passenger.class, 101);
		//load method reurns Object not found Exception and get  returns Null
		 Passenger passenger= session.get(Passenger.class, 114);//primary key send for getting data from passenger class.
		  System.out.println(passenger);
		  session.close();

	}

}
