package net.jaumebalmes.aplicacion.entidad;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Ciclo {//Plain Old Java Object (POJO)

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String curso;
	private int grupo;
	private int aula;
	
	public Ciclo() { //constructor sense arguments
		
	}

	public Ciclo(String curso, int grupo, int aula) {
		super();
		this.curso = curso;
		this.grupo = grupo;
		this.aula = aula;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getGrupo() {
		return grupo;
	}

	public void setGrupo(int grupo) {
		this.grupo = grupo;
	}

	public int getAula() {
		return aula;
	}

	public void setAula(int aula) {
		this.aula = aula;
	}

	@Override
	public String toString() {
		return "Ciclo [id=" + id + ", curso=" + curso + ", grupo=" + grupo + ", aula=" + aula + "]";
	}
	
	
	
}
