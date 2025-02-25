package com.hibernate.customQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class InsertData {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/hibernate/customQuery/hibernate.cfg.xml");
		 SessionFactory sf= cfg.buildSessionFactory();
		 Session session=sf.openSession();
		 Transaction tx=session.beginTransaction();
		 
		//****************start*****************************
		String hql= "insert into Passenger (pid,name,city,age) "
		 + "values (:pid,:name,:city,:age)";
		
	    Query query=session.createQuery(hql);
		query.setParameter("pid", 100);
		query.setParameter( "name", "madhuri");
		query.setParameter("city", "pune");
		query.setParameter("age", 30);
		int executeUpdate=query.executeUpdate();//1
		System.out.println(executeUpdate);

		tx.commit();
		session.close();
			//output************IMP sequence of the field plz check with Entity class eg. (Passenger class)
           //	Hibernate: insert into Passenger(psID,age,city,name) values (?,?,?,?)
          //	1

	}

}
