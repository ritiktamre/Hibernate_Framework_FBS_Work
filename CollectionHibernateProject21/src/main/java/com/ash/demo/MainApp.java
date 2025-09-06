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
       
       List<Course> cr = new ArrayList<Course>();
       Student st = new Student(11,"Radhe",78,cr);
       Course c1 = new Course("Java Full Stack","6 Month",st);
       Course c2 = new Course("Python Full Stack","6 Month",st);
       Course c3 = new Course("C Programming","2 Month",st);
       Course c4 = new Course("C++ Programming","4 Month",st);
       
       cr.add(c1);
       cr.add(c2);
       cr.add(c3);
       cr.add(c4);
       
       s1.persist(st);       
       tr.commit();
       s1.close();
       
	}

}
