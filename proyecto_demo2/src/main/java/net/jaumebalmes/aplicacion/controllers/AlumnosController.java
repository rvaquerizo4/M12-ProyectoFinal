package net.jaumebalmes.aplicacion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.jaumebalmes.aplicacion.entidad.Alumnos;
import net.jaumebalmes.aplicacion.entidad.Ciclo;
import net.jaumebalmes.aplicacion.repositoris.AlumnosRepository;

@RestController
@RequestMapping("api")
public class AlumnosController {
	
	@Autowired     //diu a Spring que crei ell l'objecte
	AlumnosRepository alumnoRep; //no cal fer new ja que ho fa Spring
	
	@GetMapping("alumnos/{id}")
	public Alumnos getAlumnos(@PathVariable long id) {
		Alumnos alumno = alumnoRep.findById(id).get();

		return alumno;
	}
	//Metodo para eliminar por Id
	  @DeleteMapping("alumnos/delete/{id}")
	  public void delete(@PathVariable Long id) {
		alumnoRep.deleteById(id);
	  }
	  
	  @PutMapping("alumnos/edit/{id}")
	  public Alumnos editarAlumno(@RequestBody Alumnos editar, @PathVariable long id) {
		  if (alumnoRep.existsById(id)) {
			  editar.setId(id);
			  return alumnoRep.save(editar);
		  }else {
			  return null;
		  }
	  }
}

