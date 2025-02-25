package com.hibernate.customQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class UpdateData {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/hibernate/customQuery/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		//****************start*****************************
		
		String hql="update Passenger set city=:city where name=:name";
		Query query=session.createQuery(hql);
		query.setParameter("city", "nanded");
		query.setParameter("name", "madhuri");
		query.executeUpdate();
		session.close();
		//o/p    Hibernate: update Passenger p1_0 set city=? where p1_0.name=?
		

	}

}
