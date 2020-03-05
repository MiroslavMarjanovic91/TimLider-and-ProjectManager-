package validacija;
import model.TimLider;
import model.Zaposleni;
import model.Rola;
public class ValidacijaLogin {
public boolean daLiJeTimLider(Zaposleni loginZaposleni) {
		
		if(loginZaposleni.getRola()==Rola.TimLider) {
			return true;
		}else {
			return false;
		}	
	}
}