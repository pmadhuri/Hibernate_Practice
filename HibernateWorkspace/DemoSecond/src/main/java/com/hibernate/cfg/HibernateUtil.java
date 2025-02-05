package com.hibernate.cfg;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.entityClass.Employee;

public class HibernateUtil {
	
	public static SessionFactory  sf;
	
	//method <property name="hibernate.connection.autocommit">false</property>
	public static SessionFactory getSF() {
		Configuration cfg=new Configuration();
		Properties p=new Properties();
		 p.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		 p.put(Environment.URL, "jdbc:mysql://localhost:3306/b18");
		 p.put(Environment.USER, "root");
		 p.put(Environment.PASS, "root");
		 p.put(Environment.HBM2DDL_AUTO, "update");
		 p.put(Environment.SHOW_SQL, "true");
		
	
		 cfg.setProperties(p);
		 
		 cfg.addAnnotatedClass(Employee.class);
	StandardServiceRegistry sr = new StandardServiceRegistryBuilder()
			.applySettings(cfg.getProperties()).build();
	
	sf = cfg.buildSessionFactory();
	
		return sf;
		
	}

}
