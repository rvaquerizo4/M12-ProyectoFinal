package net.jaumebalmes.aplicacion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.jaumebalmes.aplicacion.entidad.Ciclo;
import net.jaumebalmes.aplicacion.repositoris.CicloRepository;

@RestController
@RequestMapping("api")
public class ControladorCiclo {

	@Autowired     //diu a Spring que crei ell l'objecte
	CicloRepository cicloRep; //no cal fer new ja que ho fa Spring
	
	@GetMapping("ciclo/{id}")
	public Ciclo getCiclo(@PathVariable long id) {
		Ciclo ciclo = cicloRep.findById(id).get();

		return ciclo;
	}
	//Metodo para eliminar por Id
	  @DeleteMapping("ciclo/delete/{id}")
	  public void delete(@PathVariable Long id) {
		cicloRep.deleteById(id);
	  }
}
