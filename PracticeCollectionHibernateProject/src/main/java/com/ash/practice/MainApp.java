package com.ash.practice;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		
		Session s1 = new Configuration().configure("Config.xml").buildSessionFactory().openSession();
		Transaction tr = s1.beginTransaction();
		
		List<Laptop> lap = new ArrayList<Laptop>();
		
		Department d1 = new Department(1,"IT","Pune",null);
		
		Laptop l1 = new Laptop("HP",40000,2020,d1);
		Laptop l2 = new Laptop("Dell",45000,2024,d1);
		Laptop l3 = new Laptop("Apple",50000,2025,d1);
		Laptop l4 = new Laptop("Lenavo",35000,2023,d1);
		
//		s1.persist(l1);
//		s1.persist(l2);
//		s1.persist(l3);
//		s1.persist(l4);
		
		lap.add(l1);
		lap.add(l2);
		lap.add(l3);
		lap.add(l4);
		
		s1.persist(d1);
		
		d1.setLap(lap);
		
		tr.commit();
		s1.close();
		

	}

}
