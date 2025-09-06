package com.ash.practice;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
	
	public static void main(String[] args) {
		
		Session s1 = new Configuration().configure("Config.xml").buildSessionFactory().openSession();
		Transaction tr = s1.beginTransaction();
		
		Employee e1 = new SalesManager(12,"Radhe",40000,4000,40);
		Employee e2 = new Admin(11,"Shyam",50000,5000);
		Employee e3 = new HR(10,"Kahna",30000,3000);
		
		s1.persist(e1);
		s1.persist(e2);
		s1.persist(e3);
		
		tr.commit();
		s1.close();
	}
}