package com.hibernate.CriteriaAPIApplication;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.entityClass.Employee;
import com.hibernate.cfg.HibernateUtil;





public class CriteriaAPIApp {

	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSF();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Employee.class);
		//1
	  //criteria.add(Restrictions.between("salary", 20000, 25000));
		//2
	  //criteria.add(Restrictions.in("city", "Pune"));
	  //3
	  //criteria.add(Restrictions.in("city", "Pune","mumbai"));
		//4
	 // criteria.add(Restrictions.like("name", "madhuri5"));
	  //5
	  //criteria.add(Restrictions.like("name", "m%"));
		//6
	 // criteria.add(Restrictions.gt("salary", 25000));
	  //7 le,lt,ge,gt
		// criteria.add(Restrictions.ge("salary", 25000));
		//8
	   criteria.add(Restrictions.eq("name", "madhuri5"));
	  List<Employee> list = criteria.list();
	     for(Employee emp:list) {
	    	System.out.println(emp);
	    }
		
//		
		

	}

}
