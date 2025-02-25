package com.hibernate.DemoFirst;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entityClass.Passenger;


/**
 * Hello world!
 *
 */
public class InsertData 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
		cfg.configure("com/hibernate/DemoFirst/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Passenger passenger=new Passenger(112,"madhuri","Pune", 32);
		session.save(passenger);
		tx.commit();
		session.close();
    }
}
