package org.usco.agro.variable_agroclimatica;


import java.util.List;

public interface Variable_agroclimaticaRepository {
	
	public int create (Variable_agroclimatica variable_agroclimatica);
	
	public List<Variable_agroclimatica> read ();
	
	public int update (long vaa_id, Variable_agroclimatica variable_agroclimatica);
	
	public int delete (long vaa_id);

}
