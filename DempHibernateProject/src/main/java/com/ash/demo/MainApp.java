package com.ash.demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
	
		Session s1 = new Configuration().configure("Config.xml").buildSessionFactory().openSession();
		Transaction tr = s1.beginTransaction();
		
		Department d1 = new Department(12,"IT","Pune",null);
		Department d2 = new Department(13,"Sales","Indore",null);
		
		List<Employee> e = new ArrayList<Employee>();
		List<Employee>ee = new ArrayList<Employee>();
		
	 	Employee e1 = new Employee(11,"Radhe",40000,d1);
	 	Employee e2 = new Employee(12,"Shyam",30000,d1);
	 	Employee e3 = new Employee(13,"Kahna",35000,d2);
		
		e.add(e1);
		e.add(e2);
		ee.add(e3);
		
		s1.persist(d1);
		s1.persist(d2);
		
	    d1.setE1(e);
	    d2.setE1(ee);
		
		tr.commit();
		s1.close();
		
		


	}

}
