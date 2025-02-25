package com.oneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entityClass.Passport;
import com.entityClass.Person;

public class App {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/oneToOneMapping/hibernate.cfg.xml");
		 SessionFactory sf= cfg.buildSessionFactory();
		 Session session=sf.openSession();
		 Transaction tx=session.beginTransaction();
		 //*************start**************************
		 
		 Person p1=new Person();
		 p1.setpId(1); 
		 p1.setpName("Person1");
		 //
		 Person p2=new Person();
		 p2.setpId(2); 
		 p2.setpName("Person2");
		 //
		 Person p3=new Person();
		 p3.setpId(3); 
		 p3.setpName("Person3");
		 //**********************Passport**********************************
		 Passport pp1=new Passport();
		 pp1.setPpId(7222);
		 pp1.setPpName("Person2pp");
		 //
		 Passport pp2=new Passport();
		 pp2.setPpId(8333);
		 pp2.setPpName("Person3pp");
		 //
		 Passport pp3=new Passport();
		 pp3.setPpId(9111);
		 pp3.setPpName("Person1pp");
		 //******************************************
		 
		 
		 p1.setPassport(pp3);//person 1 is Kaka & pp- KakaPP
		 p2.setPassport(pp1);//person 2 is Mama  & PP-  MamaPP
		 p3.setPassport(pp2);//person 3 is Sasa  & pp-SS
		//******************************************
		 
		 pp1.setPerson(p2);
		 pp2.setPerson(p3);
		 pp3.setPerson(p1);
		 
		 
		 // save then data stored/ insert in database
		 session.save(p1);
		 session.save(p2);
		 session.save(p3);
		 session.save(pp1);
		 session.save(pp2);
		 session.save(pp3);
		 
		 tx.commit();
		 session.close();

	}

}
