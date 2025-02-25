package com.oneToManyAndManyToOne;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entityClass.City;
import com.entityClass.Country;


public class App {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/oneToManyAndManyToOne/hibernate.cfg.xml");
		 SessionFactory sf= cfg.buildSessionFactory();
		 Session session=sf.openSession();
		 Transaction tx=session.beginTransaction();
		 //*************start**************************
		 Country c1=new Country();
		 c1.setCountryId(11);
		 c1.setCountryName("India");
		 //
		 Country c2=new Country();
		 c2.setCountryId(22);
		 c2.setCountryName("USA");
		 //
		 City cc1=new City();
		 cc1.setCityId(111);
		 cc1.setCityName("Mumbai");
		 
		 City cc2=new City();
		cc2.setCityId(222);
		 cc2.setCityName("New York");
		 
		 City cc3=new City();
		 cc3.setCityId(2222);
		 cc3.setCityName("WDC");
		 
		 City cc4=new City();
		 cc4.setCityId(1111);
		 cc4.setCityName("Banglore");
		 
		 ArrayList<City> al1=new ArrayList<City>();//al1 for India
		 al1.add(cc4);
		 al1.add(cc1);
		 
		 ArrayList<City> al2=new ArrayList<City>();//al1 for USA
		 al2.add(cc2);
		 al2.add(cc3);
		 
		 c1.setCity(al1);
		 c2.setCity(al2);
		 
		 cc1.setCountry(c1);
		 cc4.setCountry(c1);
		 cc2.setCountry(c2);
		 cc3.setCountry(c2);
		 
		
		session.save(c1);
		session.save(c2);
//		session.save(cc4);
//		session.save(cc3);
//		session.save(cc2);
//		session.save(cc1);
		 
		 tx.commit();
		 session.close();

	}

}
