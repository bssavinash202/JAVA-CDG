package com.avinash.hibernateapp.HbbApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateClient {
	
	public static void main(String[] args) {
		Transaction txn = null;
		Session session = null;
		SessionFactory sf = null;
//		step1: Load configuration and buid session factory
		try {
		Configuration config =  new Configuration();
		config.configure("hibernate.cfg.xml");
		
		sf = config.buildSessionFactory();
		
//		Step2: Open the session to perform DB operations
		
		session = sf.openSession();
		
//		step3: Begin the transaction
		
		txn = session.beginTransaction();
//		step4: create employee object which needs to be saved in the database
//		employee table
		Employee emp = new Employee();
		emp.setEid(1);
		emp.setEname("Avinash");
		emp.setEsal(50000);
		emp.setEaddr("Ameerpet, HYD");
		
//		step5: save the object, to store the data in database
		session.saveOrUpdate(emp);
		System.out.println("data inserted successfully..!");
//		step6: commit transaction
		//handle the exception to rollback the transaction
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
//		step7: close the session and sessionFactory objects
		
		
	}
}
