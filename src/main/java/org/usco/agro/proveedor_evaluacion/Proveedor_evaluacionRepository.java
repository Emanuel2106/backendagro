package org.usco.agro.proveedor_evaluacion;


import java.util.List;

public interface Proveedor_evaluacionRepository {
	
	public int create (Proveedor_evaluacion proveedor_evaluacion);
	
	public List<Proveedor_evaluacion> read ();
	
	public int update (long pre_id, Proveedor_evaluacion proveedor_evaluacion);
	
	public int delete (long pre_id);

}
