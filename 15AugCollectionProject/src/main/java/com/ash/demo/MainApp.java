package com.ash.demo;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {

		Session s1 = new Configuration().configure("Config.xml").buildSessionFactory().openSession();
		Transaction tr = s1.beginTransaction();
		
		ArrayList<Employee> a1 = new ArrayList<Employee>();
		ArrayList<Employee> a2 = new ArrayList<Employee>();
		
		Department d1 = new Department(1,"Sales","Indore",null);
		Department d2 = new Department(2,"IT","Bhopal",null);
		
		Employee e1 = new Employee(12,"Radhe",40000,d1);
		Employee e2 = new Employee(13,"Shyam",15000,d1);
		Employee e3 = new Employee(15,"Kahna",20000,d1);
		Employee e4 = new Employee(20,"MahaMai",35000,d2);
		Employee e5 = new Employee(18,"Shivjii",30000,d2);
		
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		a2.add(e4);
		a2.add(e5);
		
		s1.persist(d1);
		s1.persist(d2);
		
		d1.setEmp(a1);
		d2.setEmp(a2);
	    
		tr.commit();
		s1.close();
		
		
	}

}
