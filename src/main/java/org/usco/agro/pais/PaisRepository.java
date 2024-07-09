package org.usco.agro.pais;


import java.util.List;

public interface PaisRepository {
	
	public int create (Pais pais);
	
	public List<Pais> read ();
	
	public int update (long pai_id, Pais pais);
	
	public int delete (long pai_id);

}
