package net.jaumebalmes.aplicacion.repositoris;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.jaumebalmes.aplicacion.entidad.Grupos;

public interface GruposRepository extends CrudRepository<Grupos, Long>{
	
	public List<Grupos> findAll();
}
