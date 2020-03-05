package dao;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import model.Zaposleni;
public class LoginDao {
SessionFactory factory = new Configuration().configure().buildSessionFactory();
	public Zaposleni vratiZaposlenogLogIn(String userName, String password) {
		Session sesija = factory.openSession();
		sesija.beginTransaction();
			try {
				Query query = sesija.createQuery("FROM User WHERE userName = :x AND password = :y");
					query.setParameter("x", userName);
					query.setParameter("y", password);	
		
			List<Zaposleni> zaposleni = query.getResultList();
				
				if(zaposleni.isEmpty()) {
					sesija.getTransaction().rollback();
					return null;
				}else if(zaposleni.size() == 1) {
					sesija.getTransaction().commit();
					return zaposleni.get(0);
				}else {
					sesija.getTransaction().rollback();
					return null;
				}
			} catch (Exception e) {
				sesija.getTransaction().rollback();
				return null;
			}finally {
				sesija.close();
		}	
	}
}
