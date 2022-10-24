package net.jaumebalmes.aplicacion.repositoris;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.jaumebalmes.aplicacion.entidad.Ciclo;


public interface CicloRepository extends CrudRepository<Ciclo, Long>{
	
	public List<Ciclo> findAll();
}
