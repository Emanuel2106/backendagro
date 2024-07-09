package org.usco.agro.unidad;


import java.util.List;

public interface UnidadRepository {
	
	public int create (Unidad unidad);
	
	public List<Unidad> read ();
	
	public int update (long uni_id, Unidad unidad);
	
	public int delete (long uni_id);

}
