package org.usco.agro.tipo_actividad;


import java.util.List;

public interface Tipo_actividadRepository {
	
	public int create (Tipo_actividad tipo_actividad);
	
	public List<Tipo_actividad> read ();
	
	public int update (long tia_id, Tipo_actividad tipo_actividad);
	
	public int delete (long tia_id);

}
