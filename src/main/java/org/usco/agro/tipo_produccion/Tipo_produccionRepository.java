package org.usco.agro.tipo_produccion;


import java.util.List;

public interface Tipo_produccionRepository {
	
	public int create (Tipo_produccion tipo_produccion);
	
	public List<Tipo_produccion> read ();
	
	public int update (long tip_id, Tipo_produccion tipo_produccion);
	
	public int delete (long tip_id);

}
