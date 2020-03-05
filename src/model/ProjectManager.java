package model;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
@Entity
public class ProjectManager {
	private String userName;
	private String password;
	@Enumerated
	private Rola rola;
	@ElementCollection(fetch = FetchType.EAGER)
	private List<Zaposleni> sviZaposleni = new ArrayList<>();
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Rola getRola() {
		return rola;
	}
	public void setRola(Rola rola) {
		this.rola = rola;
	}
	public List<Zaposleni> getSviZaposleni() {
		return sviZaposleni;
	}
	public void setSviZaposleni(List<Zaposleni> sviZaposleni) {
		this.sviZaposleni = sviZaposleni;
	} 
}
