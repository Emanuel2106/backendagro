package org.usco.agro.actividad_programacion;


import java.util.List;

public interface Actividad_programacionRepository {
	
	public int create (Actividad_programacion actividad_programacion);
	
	public List<Actividad_programacion> read ();
	
	public int update (long acp_id, Actividad_programacion actividad_programacion);
	
	public int delete (long acp_id);

}
