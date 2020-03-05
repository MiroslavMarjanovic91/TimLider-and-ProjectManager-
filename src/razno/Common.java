package razno;
import model.ProjectManager;
import model.Rola;
import model.TimLider;
import model.Zaposleni;
import model.PozicijaNaPoslu;
public class Common {
	private static final Zaposleni ProjectManager = null;
	private static final CharSequence JUNIOR = null;

	public Zaposleni vratiZapolseniModel(String userName, String password) {

		TimLider timLider = new TimLider();
		ProjectManager projectManager = new ProjectManager();
		projectManager.setUserName(userName);
		projectManager.setPassword(password);
		if (userName.equals(timLider.getTimLiderUserName()) && password.equals(timLider.getTimLiderPassword())) {
			projectManager.setRola(Rola.TimLider);
		} else {
			projectManager.setRola(Rola.ProjectManager);
		}
		return ProjectManager;
	}
	public void pozicija(Zaposleni zaposleni,String pozicijaNaPoslu) {
		  if(pozicijaNaPoslu.equals("Junior")) {
			  zaposleni.setPozicija(PozicijaNaPoslu.JUNIOR);
		  }
		  else if(pozicijaNaPoslu.equals("Senior")) {
			  zaposleni.setPozicija(PozicijaNaPoslu.SENIOR);
		  }
		  else if(pozicijaNaPoslu.equals("TimLider")) { 
			  zaposleni.setPozicija(PozicijaNaPoslu.TIMLIDER);
		  }else{ 
			  zaposleni.setPozicija(PozicijaNaPoslu.PROJECTMANAGER);
		} 
	}
}