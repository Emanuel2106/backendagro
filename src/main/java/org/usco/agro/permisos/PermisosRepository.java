package org.usco.agro.permisos;


import java.util.List;

public interface PermisosRepository {
	
	public int create (Permisos permisos);
	
	public List<Permisos> read ();
	
	public int update (long per_id, Permisos permisos);
	
	public int delete (long per_id);

}
