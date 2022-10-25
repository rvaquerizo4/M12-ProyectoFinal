package net.jaumebalmes.aplicacion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.jaumebalmes.aplicacion.entidad.hEntradahSalida;
import net.jaumebalmes.aplicacion.repositoris.HorasRepository;

@RestController
@RequestMapping("api")
public class HorasControllers {
	
	@Autowired     //diu a Spring que crei ell l'objecte
	HorasRepository horaRep; //no cal fer new ja que ho fa Spring
	
	@GetMapping("horas/{id}")
	public hEntradahSalida getHEntradahSalida(@PathVariable long id) {
		hEntradahSalida hora = horaRep.findById(id).get();

		return hora;
	}
	//Metodo para eliminar por Id
	  @DeleteMapping("horas/delete/{id}")
	  public void delete(@PathVariable Long id) {
		horaRep.deleteById(id);
	 }
	  
	 //Metodo para actualizar con el PUT
	  @PutMapping("horas/actualizar/{id}")
	  public ResponseEntity<hEntradahSalida> updateHoras(@PathVariable Long id,@RequestBody hEntradahSalida horasDetails){
		  hEntradahSalida updateHoras = horaRep.findById(id).get();
		  
		  updateHoras.setNom(horasDetails.getNom());
		  updateHoras.setCognoms(horasDetails.getCognoms());
		  updateHoras.setModulo(horasDetails.getModulo());
		  updateHoras.setUf(horasDetails.getUf());
		  updateHoras.sethEntrada(horasDetails.gethEntrada());
		  updateHoras.sethSalida(horasDetails.gethSalida());
		  
		  horaRep.save(updateHoras);

	      return ResponseEntity.ok(updateHoras);
	  }	  
}