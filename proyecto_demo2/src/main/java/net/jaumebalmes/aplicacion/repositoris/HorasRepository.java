package net.jaumebalmes.aplicacion.repositoris;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import net.jaumebalmes.aplicacion.entidad.hEntradahSalida;

public interface HorasRepository extends CrudRepository<hEntradahSalida, Long>{
	
	public List<hEntradahSalida> findAll();
}
