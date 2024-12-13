package com.oneToManyAndManyToOne_Fetch;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entityClassFetch.City;
import com.entityClassFetch.Country;




public class App {

	public static void main(String[] args) {
		//import only fetch related country & city class
//		import com.entityClassFetch.City;
//		import com.entityClassFetch.Country;
		Configuration cfg=new Configuration();
		cfg.configure("com/oneToManyAndManyToOne_Fetch/hibernate.cfg.xml");
		 SessionFactory sf= cfg.buildSessionFactory();
		 Session session=sf.openSession();
		 Transaction tx=session.beginTransaction();
		 //*************start**************************
		Country country=session.get(Country.class, 11);
		/*System.out.println(country.getCountryId());
		System.out.println(country.getCountryName());
		
		List<City> city=country.getCity();
		for(City c:city) {
			
			
			System.out.println(c);
		}
		 */
		 tx.commit();
		 session.close();
		 //LASY************ By Default with print shows associated table data
		 //EAGER***********Without print shows associated table data o/p
		 //Hibernate: select c1_0.countryId,c1_0.countryName,c2_0.country_countryId,c2_0.cityId,c2_0.cityName from Country c1_0 lef
		 //t join City c2_0 on c1_0.countryId=c2_0.country_countryId where c1_0.countryId=?

	}

}
