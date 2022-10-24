package net.jaumebalmes.aplicacion.repositoris;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.jaumebalmes.aplicacion.entidad.Alumnos;

public interface AlumnosRepository extends CrudRepository<Alumnos, Long>{

	public List<Alumnos> findAll();
}

