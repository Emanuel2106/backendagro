package org.usco.agro.estado;


import java.util.List;

public interface EstadoRepository {
	
	public int create (Estado estado);
	
	public List<Estado> read ();
	
	public int update (long est_id, Estado estado);
	
	public int delete (long est_id);

}
