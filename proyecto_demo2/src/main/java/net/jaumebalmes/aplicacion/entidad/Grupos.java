package net.jaumebalmes.aplicacion.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Grupos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nom;
	private String cognom;
	private String grup;
	
	public Grupos() { //constructor sense arguments
		
	}

	public Grupos(String nom, String cognom, String grup) {
		super();
		this.nom = nom;
		this.cognom = cognom;
		this.grup = grup;
	}
	
	//Setters y Getters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public String getGrup() {
		return grup;
	}

	public void setGrup(String grup) {
		this.grup = grup;
	}

	@Override
	public String toString() {
		return "Grupos [id=" + id + ", nom=" + nom + ", cognom=" + cognom + ", grup=" + grup + "]";
	}
	
	
	
}
