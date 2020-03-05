package model;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Zaposleni {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 private String ime; 
	 private String password; 
	 @Enumerated
	 private Rola rola;
	 @Enumerated
	 private PozicijaNaPoslu pozicija;
	 @ElementCollection(fetch = FetchType.EAGER)
	 private List<Zaposleni> sviZaposleni = new ArrayList<>();
	 
	 public PozicijaNaPoslu getPozicija() {
		return pozicija;
	}
	public List<Zaposleni> getSviZaposleni() {
		return sviZaposleni;
	}
	public void setSviZaposleni(List<Zaposleni> sviZaposleni) {
		this.sviZaposleni = sviZaposleni;
	}
	public void setPozicija(PozicijaNaPoslu pozicija) {
		this.pozicija = pozicija;
	}
	public Projekti getProjekti() {
		return projekti;
	}
	public void setProjekti(Projekti projekti) {
		this.projekti = projekti;
	}
	
	@OneToOne
	 private Projekti projekti;
	 
	 public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String JMBG;
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String getJMBG() {
		return JMBG;
	}
	public void setJMBG(String jMBG) {
		JMBG = jMBG;
	}
	public Rola getRola() {
		// TODO Auto-generated method stub
		return null;
	}	 
}