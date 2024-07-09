package org.usco.agro.espacio_ocupacion;


import java.util.List;

public interface Espacio_ocupacionRepository {
	
	public int create (Espacio_ocupacion espacio_ocupacion);
	
	public List<Espacio_ocupacion> read ();
	
	public int update (long eso_id, Espacio_ocupacion espacio_ocupacion);
	
	public int delete (long eso_id);

}
