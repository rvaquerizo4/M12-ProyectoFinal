package net.jaumebalmes.aplicacion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.jaumebalmes.aplicacion.entidad.Alumnos;
import net.jaumebalmes.aplicacion.repositoris.AlumnosRepository;

@RestController
@RequestMapping("api")
public class AlumnosController {
	
	@Autowired     //diu a Spring que crei ell l'objecte
	AlumnosRepository alumnoRep; //no cal fer new ja que ho fa Spring
	
	@GetMapping("alumnos/{id}")
	public Alumnos getClient(@PathVariable long id) {
		Alumnos alumno = alumnoRep.findById(id).get();

		return alumno;
	}
	//Metodo para eliminar por Id
	  @DeleteMapping("alumnos/delete/{id}")
	  public void delete(@PathVariable Long id) {
		alumnoRep.deleteById(id);
	  }
}
