package org.usco.agro.modulo_metodo;


import java.util.List;

public interface Modulo_metodoRepository {
	
	public int create (Modulo_metodo modulo_metodo);
	
	public List<Modulo_metodo> read ();
	
	public int update (long mom_id, Modulo_metodo modulo_metodo);
	
	public int delete (long mom_id);

}
