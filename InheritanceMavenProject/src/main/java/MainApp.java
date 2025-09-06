import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Session ses= new Configuration().configure("Config.xml").buildSessionFactory().openSession();
      Transaction tr = ses.beginTransaction();
      
      Employee e1 = new SalesManager(50,"Ritik",40000,34,6);
      Employee e2 = new Developer(60,"Rahul",30000,"Java");
      Employee e3 = new SalesPerson(70,"Ram",25000,1200);
      
      ses.persist(e1);
      ses.persist(e2);
      ses.persist(e3);
      
      tr.commit();
      ses.close();
	}

}
