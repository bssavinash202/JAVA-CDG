package com.avinash.hibernateapp.Hibwoxml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Client {
	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		config.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost/company");
		config.setProperty("hibernate.connection.username", "root");
		config.setProperty("hibernate.connection.password", "root");
		config.setProperty("hiberate.show_sql", "true");
		
		config.addAnnotatedClass(Employee.class);
		
		Transaction txn = null;
		Session session = null;
		SessionFactory sf = null;
		try {
		
		
		sf = config.buildSessionFactory();
		
		
		session = sf.openSession();
		
		
		txn = session.beginTransaction();
		Employee emp = new Employee();
		emp.setEid(2);
		emp.setEname("Shivasai");
		emp.setEsal(55000);
		emp.setEaddr("JNTUH, HYD");
		
		session.saveOrUpdate(emp);
		System.out.println("data inserted successfully..!");
		txn.commit();
		}catch(Exception e) {
			if (txn!=null) {
				txn.rollback();
			}
			e.printStackTrace();
		}
		finally {
			if(session!=null) {
				session.close();
			}
			if(sf!=null) {
				sf.close();
			}
		}
		
		
	}
}
