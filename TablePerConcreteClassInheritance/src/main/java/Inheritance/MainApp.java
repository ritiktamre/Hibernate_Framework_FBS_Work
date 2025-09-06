package Inheritance;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session ses = new Configuration().configure("Config.xml").buildSessionFactory().openSession();
		Transaction tr = ses.beginTransaction();
		
		Employee e1 = new SalesManager(12,"Ritik",40000,4000,40);
		Employee e2 = new HR(15,"Shweta",30000,3000);
		
		ses.persist(e1);
		ses.persist(e2);
		
		tr.commit();
		ses.close();
	}

}
