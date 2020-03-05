package service;
import java.util.List;
import dao.SviZaposleniDao;
import model.Zaposleni;
public class SviZaposleniServis {
	SviZaposleniDao dao = new SviZaposleniDao();
	public List<Zaposleni> vratiSveZaposlene() {
		return dao.vratiSveZaposlene();
	}
}