package dao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import controllor.ListaProjekata;
import model.Projekti;

public class ListaProjekataDao {
	SessionFactory factory = (SessionFactory) new Configuration().configure().buildSessionFactory();

	public List<ListaProjekata> vratiSveProjekte() {
		
		List<Projekti> projekti = new ArrayList<Projekti>();
		
		Session session = factory.getCurrentSession();
			session.beginTransaction();
		try {
			
			projekti = session.createQuery("FROM ProjektiS").getResultList();
			
			session.getTransaction().commit();
			return vratiSveProjekte();
		} catch (Exception e) {
			session.getTransaction().rollback();
			return null;
		}

	}

	public Projekti vratiPozicijaNaPosluPoID(String idPozicijaNaPoslu) {
		// TODO Auto-generated method stub
		return null;
	}

	
}	
