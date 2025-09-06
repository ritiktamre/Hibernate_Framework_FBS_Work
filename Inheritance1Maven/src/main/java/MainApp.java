import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
	
		Session ses = new Configuration().configure("Config.xml").buildSessionFactory().openSession();
		Transaction tr = ses.beginTransaction();
		
		Employee e1 = new SalesManager(12,"Radhe",30000,3000,30);
		Employee e2 = new Admin(15,"Shyam",40000,4000);
		Employee e3 = new HR(20,"Kahna",25000,5000);
		
		ses.persist(e1);
        ses.persist(e2);
        ses.persist(e3);
        
        tr.commit();
        ses.close();
	}

}
