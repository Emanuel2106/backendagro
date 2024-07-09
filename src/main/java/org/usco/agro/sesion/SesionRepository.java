package org.usco.agro.sesion;


import java.util.List;

public interface SesionRepository {
	
	public int create (Sesion sesion);
	
	public List<Sesion> read ();
	
	public int update (long ses_id, Sesion sesion);
	
	public int delete (long ses_id);

}
