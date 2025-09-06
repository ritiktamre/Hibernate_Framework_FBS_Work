package com.ash.demo;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
	
	public static void main(String[] args) {
		
		Session s1 = new Configuration().configure("Config.xml").buildSessionFactory().openSession();
		Transaction tr = s1.beginTransaction();
		
		Department d1 = new Department (1,"IT","Pune",null);
		Department d2 = new Department(2,"Sales","Indore",null);
		
		Employee e1 = new Employee(12,"Radhe",40000,d1);
		Employee e2 = new Employee(1,"Shyam",50000,d1);
		Employee e3 = new Employee(10,"Kahna",45000,d1);
		Employee e4 = new Employee(8,"Bappa",35000,d2);
		Employee e5 = new Employee(6,"MahaMai",30000,d2);
		
		
		d1.setEmp(Arrays.asList(e1,e2,e3));
		d2.setEmp(Arrays.asList(e4,e5));
		
		s1.persist(d1);
		s1.persist(d2);
		
		tr.commit();
		s1.close();
	}
}