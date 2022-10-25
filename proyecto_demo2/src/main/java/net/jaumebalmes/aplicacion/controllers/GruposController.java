package net.jaumebalmes.aplicacion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.jaumebalmes.aplicacion.entidad.Grupos;
import net.jaumebalmes.aplicacion.repositoris.GruposRepository;

@RestController
@RequestMapping("api")
public class GruposController {

	@Autowired     //diu a Spring que crei ell l'objecte
	GruposRepository gruposRep; //no cal fer new ja que ho fa Spring
	
	@GetMapping("grupos/{id}")
	public Grupos getGrupos(@PathVariable long id) {
		Grupos Grupos = gruposRep.findById(id).get();

		return Grupos;
	}
	//Metodo para eliminar por Id
	  @DeleteMapping("grupos/delete/{id}")
	  public ResponseEntity<?> borrarProducto(@PathVariable long id){
		 gruposRep.deleteById(id);
		 return ResponseEntity.noContent().build();
	  }
	  
	  @GetMapping("grupos/edit/{id}")
	  public Grupos editarGrupos(@RequestBody Grupos editar, @PathVariable long id) {
		  if (gruposRep.existsById(id)) {
			  editar.setId(id);
			  return gruposRep.save(editar);
		  }else {
			  return null;
		  }
	  }
	  
}