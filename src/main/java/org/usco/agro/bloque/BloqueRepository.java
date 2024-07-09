package org.usco.agro.bloque;


import java.util.List;

public interface BloqueRepository {
	
	public int create (Bloque bloque);
	
	public List<Bloque> read ();
	
	public int update (long blo_id, Bloque bloque);
	
	public int delete (long blo_id);

}
