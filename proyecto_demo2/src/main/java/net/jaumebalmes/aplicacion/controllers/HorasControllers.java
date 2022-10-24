package net.jaumebalmes.aplicacion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
}