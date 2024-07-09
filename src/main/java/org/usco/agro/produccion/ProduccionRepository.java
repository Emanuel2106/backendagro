package org.usco.agro.produccion;


import java.util.List;

public interface ProduccionRepository {
	
	public int create (Produccion produccion);
	
	public List<Produccion> read ();
	
	public int update (long pro_id, Produccion produccion);
	
	public int delete (long pro_id);

}
