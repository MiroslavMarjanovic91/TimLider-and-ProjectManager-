package dao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import model.Zaposleni;
public class SviZaposleniDao<Zaposleni> {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();

	public List<Zaposleni> vratiSveZaposlene() {
		
		List<Zaposleni> listaZaposlenih = new ArrayList<Zaposleni>();
		
		Session session = factory.openSession();
			session.beginTransaction();
		try {
			String sql = "FROM Zaposleni";
			
			Query query = session.createQuery(sql);
			
			listaZaposlenih = query.getResultList();
			
			session.getTransaction().commit();
			return listaZaposlenih;
		} catch (Exception e) {
			session.getTransaction().rollback();
			return null;
		} finally {
			session.close();
		}
	}
}