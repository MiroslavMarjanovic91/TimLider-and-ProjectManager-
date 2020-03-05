package service;
import dao.DodajListuProjekataDao;
import model.Projekti;
public class DodajListuProjekata {
	DodajListuProjekataDao dao = new DodajListuProjekataDao();
	public boolean dodajListuProjekata(Projekti projekti) {
		return dao.dodajListu(projekti);
	}
}