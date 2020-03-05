package dao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import model.Projekti;
import model.Zaposleni;

public class KorisnikDao {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();

	public List<Projekti> dajSveProjekte() {
		List<Projekti> projekti = new ArrayList<Projekti>();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		try {
			final String sql = "FROM Projekti";
			Query query = session.createQuery(sql);
			projekti = (List<Projekti>)query.getResultList();
			session.getTransaction().commit();
			return projekti;
		} catch (Exception e) {
			session.getTransaction().rollback();
			return null;
		}
	}
}
