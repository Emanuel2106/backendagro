package org.usco.agro.espacio_actividad;


import java.util.List;

public interface Espacio_actividadRepository {
	
	public int create (Espacio_actividad espacio_actividad);
	
	public List<Espacio_actividad> read ();
	
	public int update (long esa_id, Espacio_actividad espacio_actividad);
	
	public int delete (long esa_id);

}
