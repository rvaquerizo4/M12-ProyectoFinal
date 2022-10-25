package net.jaumebalmes.aplicacion.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	  public ResponseEntity<?> borrarProducto(@PathVariable long id){
		 cicloRep.deleteById(id);
		 return ResponseEntity.noContent().build();
	  }
	  
	  @GetMapping("ciclo/edit/{id}")
	  public Ciclo editarCiclo(@RequestBody Ciclo editar, @PathVariable long id) {
		  if (cicloRep.existsById(id)) {
			  editar.setId(id);
			  return cicloRep.save(editar);
		  }else {
			  return null;
		  }
	  }
	  
}
