package org.usco.agro.condicion_agroclimatica;


import java.util.List;

public interface Condicion_agroclimaticaRepository {
	
	public int create (Condicion_agroclimatica condicion_agroclimatica);
	
	public List<Condicion_agroclimatica> read ();
	
	public int update (long coa_id, Condicion_agroclimatica condicion_agroclimatica);
	
	public int delete (long coa_id);

}
