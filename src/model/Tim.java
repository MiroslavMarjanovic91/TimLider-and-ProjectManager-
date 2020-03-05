package model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Tim {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	private String imeTima;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImeTima() {
		return imeTima;
	}
	public void setImeTima(String imeTima) {
		this.imeTima = imeTima;

	}
}