package org.usco.agro.modulo;


import java.util.List;

public interface ModuloRepository {
	
	public int create (Modulo modulo);
	
	public List<Modulo> read ();
	
	public int update (long mod_id, Modulo modulo);
	
	public int delete (long mod_id);

}
