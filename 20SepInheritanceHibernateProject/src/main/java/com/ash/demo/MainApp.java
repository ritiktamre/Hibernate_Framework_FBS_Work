package com.ash.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
	
	public static void main(String[] args) {
		Session s1 = new Configuration().configure("Config.xml").buildSessionFactory().openSession();
		Transaction tr = s1.beginTransaction();
		
		Employee e1 = new SalesManager(12,"Ritik",30000,3000,30);
		Employee e2 = new Admin(15,"Sudeep",20000,2000);
		
	     s1.persist(e1);
	     s1.persist(e2);
	     
	     tr.commit();
	     s1.close();
		
	}
	
	

}
