package com.hibernate.DemoSecond;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entityClass.Employee;
import com.hibernate.cfg.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       SessionFactory sf=HibernateUtil.getSF();
       Session session =sf.openSession();
       Transaction tx=session.beginTransaction();
       
       
       Employee e6=new Employee(116,"madhuri1","pune1",21,23000);
       Employee e7=new Employee(117,"madhuri2","pune2",22,22000);
       Employee e8=new Employee(118,"madhuri3","pune3",23,22000);
       Employee e9=new Employee(119,"madhuri4","pune4",24,24000);
       Employee e10=new Employee(120,"madhuri5","pune5",25,21000);
       
       session.save(e6);
       session.save(e7);
       session.save(e8);
       session.save(e9);
       session.save(e10);
       
       tx.commit();
       session.close();
      
       //insert data into table  use dependency
       
       
       
//       <dependency>
//       <groupId>org.hibernate.orm</groupId>
//       <artifactId>hibernate-core</artifactId>
//       <version>6.6.5.Final</version>
//   </dependency>
       
       
    }
}
