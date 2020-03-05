package model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Projekti {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	private String imeProjekta; 
	private String imeKlijenta;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImeProjekta() {
		return imeProjekta;
	}
	public void setImeProjekta(String imeProjekta) {
		this.imeProjekta = imeProjekta;
	}
	public String getImeKlijenta() {
		return imeKlijenta;
	}
	public void setImeKlijenta(String imeKlijenta) {
		this.imeKlijenta = imeKlijenta;
	} 
}
