package org.usco.agro.actividad_ocupacion;


import java.util.List;

public interface Actividad_ocupacionRepository {
	
	public int create (Actividad_ocupacion actividad_ocupacion);
	
	public List<Actividad_ocupacion> read ();
	
	public int update (long aco_id, Actividad_ocupacion actividad_ocupacion);
	
	public int delete (long aco_id);

}
