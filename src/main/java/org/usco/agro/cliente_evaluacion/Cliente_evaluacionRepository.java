package org.usco.agro.cliente_evaluacion;


import java.util.List;

public interface Cliente_evaluacionRepository {
	
	public int create (Cliente_evaluacion cliente_evaluacion);
	
	public List<Cliente_evaluacion> read ();
	
	public int update (long cle_id, Cliente_evaluacion cliente_evaluacion);
	
	public int delete (long cle_id);

}
