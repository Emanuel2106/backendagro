package org.usco.agro.sede;


import java.util.List;

public interface SedeRepository {
	
	public int create (Sede sede);
	
	public List<Sede> read ();
	
	public int update (long sed_id, Sede sede);
	
	public int delete (long sed_id);

}
