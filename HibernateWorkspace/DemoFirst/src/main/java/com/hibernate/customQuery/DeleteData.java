package com.hibernate.customQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DeleteData {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/hibernate/customQuery/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		//****************start*****************************
		
		String hql="delete from Passenger where pid=:pid";
		Query query=session.createQuery(hql);
		//query.setParameter("city", "Pune");
		query.setParameter("pid", 100);
		query.executeUpdate();
		session.close();
		
		//o/p  delete p1_0 from Passenger p1_0 where p1_0.pid=? 
		

	}

}
