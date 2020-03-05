package service;
import java.util.List;
import dao.KorisnikDao;
import model.Projekti;
public class ServisKorisnika {
	KorisnikDao dao = new KorisnikDao();
	public List<Projekti> dajSveProjekte() {
		return dao.dajSveProjekte();
	}
}