package org.usco.agro.categoria_actividad;


import java.util.List;

public interface Categoria_actividadRepository {
	
	public int create (Categoria_actividad categoria_actividad);
	
	public List<Categoria_actividad> read ();
	
	public int update (long caa_id, Categoria_actividad categoria_actividad);
	
	public int delete (long caa_id);

}
