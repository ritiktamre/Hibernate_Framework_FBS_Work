package com.ash.demo;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainApp {

	public static void main(String[] args) {
	    Session s1 = new Configuration().configure("Config.xml").buildSessionFactory().openSession();
	    Transaction tr = s1.beginTransaction();
	    
	    Department d1 = new Department(1,"IT","Pune",null);
	    
	    Employee e1 = new Employee(12,"Ritik",30000,d1);
	    Employee e2 = new Employee(15,"Shweta",25000,d1);
	    Employee e3 = new Employee(13,"Aadarsh",20000,d1);
	    Employee e4 = new Employee(17,"Anmol",10000,d1);
	    
	    d1.setEmp(Arrays.asList(e1,e2,e3,e4));
	    s1.persist(d1);
	    
	    tr.commit();
	    s1.close();
	    

	}

}
