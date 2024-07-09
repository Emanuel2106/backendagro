package org.usco.agro.evaluacion;


import java.util.List;

public interface EvaluacionRepository {
	
	public int create (Evaluacion evaluacion);
	
	public List<Evaluacion> read ();
	
	public int update (long eva_id, Evaluacion evaluacion);
	
	public int delete (long eva_id);

}
