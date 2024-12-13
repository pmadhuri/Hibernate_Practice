package com.hibernate.DemoFirst;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entityClass.Passenger;

public class UpdateData {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/hibernate/DemoFirst/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		Passenger passenger=session.get(Passenger.class, 115);
		System.out.println(passenger);
		passenger.setCity("Nanded");
		session.saveOrUpdate(passenger);
		
		tx.commit();
		session.close();

	}

}
