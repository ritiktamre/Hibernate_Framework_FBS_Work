package com.ash.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
	
	public static void main(String[] args) {
		
		Session s1 = new Configuration().configure("Config.xml").buildSessionFactory().openSession();
		Transaction tr = s1.beginTransaction();
		
		Employee e1 = new SalesManager(12,"Ritik",30000,3000,30);
		Employee e2 = new Admin(11,"Shyam",40000,4000);
		Employee e3 = new HR(13,"Tamre",50000,5000);
		
		s1.persist(e1);
		s1.persist(e2);
		s1.persist(e3);
		
		tr.commit();
		s1.close();
	}
}