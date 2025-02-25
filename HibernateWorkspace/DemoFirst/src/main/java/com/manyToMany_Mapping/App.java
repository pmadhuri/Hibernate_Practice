package com.manyToMany_Mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entityClass.Bank;
import com.entityClass.Customer;
import com.entityClass.Passport;
import com.entityClass.Person;

public class App {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/manyToMany_Mapping/hibernate.cfg.xml");
		 SessionFactory sf= cfg.buildSessionFactory();
		 Session session=sf.openSession();
		 Transaction tx=session.beginTransaction();
		 //*************start***************************
		 Bank b1=new Bank();
		 b1.setBid(22222);
		 b1.setBname("HDFC");
		 
		 Bank b2=new Bank();
		 b2.setBid(44444);
		 b2.setBname("ICICI");
		 
		 Bank b3=new Bank();
		 b3.setBid(88888);
		 b3.setBname("SBI");
		 
		 //***************customer
		 Customer c1=new Customer();
		 c1.setCid(1);
		 c1.setCname("Maduri");
		 
		 Customer c2=new Customer();
		 c2.setCid(2);
		 c2.setCname("Sandip");
		 //*******************
		 
		 List<Bank> bank=new ArrayList<Bank>();
		 bank.add(b3);
		 bank.add(b2);
		 bank.add(b1);
		 List<Customer> customer=new ArrayList<Customer>();
		 customer.add(c2);
		 customer.add(c1);
		 //******************************
		 b1.setCustomer(customer);
		 b2.setCustomer(customer);
		 b3.setCustomer(customer);
		 //
		 c1.setBank(bank);
		 c2.setBank(bank);
		 // session save.
		 session.save(b1);
		 session.save(b2);
		 session.save(b3);
		 
		 tx.commit();
		 session.close();

	}

}
