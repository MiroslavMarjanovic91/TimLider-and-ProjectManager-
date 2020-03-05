package service;
import dao.LoginDAO;
import model.ProjectManager;
import model.TimLider;
import model.Zaposleni;
import validacija.ValidacijaLogin;
public class LoginService {
	LoginDAO dao = new LoginDAO();
	ValidacijaLogin validacija = new ValidacijaLogin();
	public Zaposleni sviZaposleni(String userName, String password) {
		return dao.sviZaposleni(userName,password);
	}
	public boolean daLiJeTimLider(Zaposleni loginProjectManager) {
		return validacija.daLiJeTimLider(loginProjectManager);
	}
}