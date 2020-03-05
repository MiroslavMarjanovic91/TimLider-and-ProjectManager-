package service;
import java.util.List;
import dao.ListaProjekataDao;
import model.Projekti;
import model.Zaposleni;
import razno.Common;
public class ListaProjekata {
	ListaProjekataDao dao = new ListaProjekataDao();
	Common common = new Common();
	public List<controllor.ListaProjekata> vratiSveProjekte() {
		return dao.vratiSveProjekte();
}
	public void vratiPozicijaNaPoslu(Zaposleni zaposleni, String PozicijaNaPoslu) {
		vratiPozicijaNaPoslu(zaposleni, PozicijaNaPoslu);
	}
	
	public Projekti vratiPozicijaNaPosluPoID(String idPozicijaNaPoslu) {
		return dao.vratiPozicijaNaPosluPoID(idPozicijaNaPoslu);
	}
}