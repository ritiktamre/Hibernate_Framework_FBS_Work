package com.ash.ritik;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {

		Session s1 = new Configuration().configure("Config.xml").buildSessionFactory().openSession();
		Transaction tr = s1.beginTransaction();
		
		List<Car> l1 = new ArrayList<Car>();
		List<Car> l2 = new ArrayList<Car>();
		
		Person p1 = new Person(1,"Radhe",40000,null);
		Person p2 = new Person(2,"Shyam",30000,null);
		
		Car c1 = new Car(2003,"Swift",p2);
		Car c2 = new Car(2004,"Wagnor",p1);
		Car c3 = new Car(2005,"BMW",p2);
		Car c4 = new Car(2006,"Auddi",p1);
		Car c5 = new Car(2010,"Creta",p2);
		
		l2.add(c1);
		l1.add(c2);
		l2.add(c3);
		l1.add(c4);
		l2.add(c5);
		
		s1.persist(p1);
		s1.persist(p2);
		
		p1.setC1(l1);
		p2.setC1(l2);
		
		tr.commit();
		s1.close();
	}

}
