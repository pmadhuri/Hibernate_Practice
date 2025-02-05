package com.hibernate.DemoSecond;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.entityClass.Employee;
import com.hibernate.cfg.HibernateUtil;


public class Pagination { 
	
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSF();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		//get all data at time 
		String hql="from Employee";
		Query query=session.createQuery(hql);
		query.setFirstResult(0);
		query.setMaxResults(2);
		List<Employee> list =query.list();
		for(Employee emp:list) {
				System.out.println(emp);
		}
//		output for 0-2 -> we get 1 & 2 record 
//		Hibernate: select e1_0.id,e1_0.age,e1_0.city,e1_0.name,e1_0.salary from empTableForSecond e1_0 limit ?,?
//				Employee [id=111, name=madhuri1, city=pune1, age=21, salary=25000]
//				Employee [id=112, name=madhuri2, city=pune2, age=22, salary=26000]
		tx.commit();
		session.close();
	}
	
	

}
