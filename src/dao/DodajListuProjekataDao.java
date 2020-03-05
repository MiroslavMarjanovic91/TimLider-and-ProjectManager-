package dao;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import model.Projekti;

public class DodajListuProjekataDao {
	
	SessionFactory factory = (SessionFactory) new Configuration().configure().buildSessionFactory();

	 public boolean dodajListu(Projekti projekti) {
	 
	 Session session = factory.openSession(); session.beginTransaction();
	 
	 try { session.save(projekti); 
	 session.getTransaction().commit(); 
	 return true; } 
	 catch (Exception e) { 
		 session.getTransaction().rollback(); 
		 return false; } 
	 finally { session.close(); }
	 
	  }

}
