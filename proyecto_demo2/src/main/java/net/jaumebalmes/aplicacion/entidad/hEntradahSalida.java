package net.jaumebalmes.aplicacion.entidad;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class hEntradahSalida {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nom;
	private String cognoms;
	private String modulo;
	private String uf;
	private LocalDateTime hEntrada;
	private LocalDateTime hSalida;
	
	//Constructores
	public hEntradahSalida(String nom, String cognoms, String modulo, String uf,LocalDateTime hEntrada, LocalDateTime hSalida) {
		super();
		this.nom = nom;
		this.cognoms = cognoms;
		this.modulo=modulo;
		this.uf=uf;
		this.hEntrada = hEntrada;
		this.hSalida = hSalida;
	}
	
	public hEntradahSalida() {
	
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

	public String getCognoms() {
		return cognoms;
	}

	public void setCognoms(String cognoms) {
		this.cognoms = cognoms;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}
	
	public String getUf() {
		return modulo;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public LocalDateTime gethEntrada() {
		return hEntrada;
	}

	public void sethEntrada(LocalDateTime hEntrada) {
		this.hEntrada = hEntrada;
	}

	public LocalDateTime gethSalida() {
		return hSalida;
	}

	public void sethSalida(LocalDateTime hSalida) {
		this.hSalida = hSalida;
	}
	
//toString
	@Override
	public String toString() {
		return "hEntradaHsalida [nom=" + nom + ", cognoms=" + cognoms + ", modulo=" + modulo + ", uf=" + uf + ", hEntrada=" + hEntrada
				+ ", hSalida=" + hSalida + "]";
	}

	
	
}

