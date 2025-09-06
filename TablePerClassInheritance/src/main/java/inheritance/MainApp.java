package inheritance;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
    
		Session ses = new Configuration().configure("Config.xml").buildSessionFactory().openSession();
		Transaction tr = ses.beginTransaction();
		
		Employee e1 = new SalesManager(12,"Shweta",30000,3000,3);
		Employee e2 = new Admin(15,"Laddu",25000,5000);
		
		ses.persist(e1);
        ses.persist(e2);
        
        tr.commit();
        ses.close();
	}

}
