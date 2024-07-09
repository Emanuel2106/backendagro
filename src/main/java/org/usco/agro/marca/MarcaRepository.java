package org.usco.agro.marca;


import java.util.List;

public interface MarcaRepository {
	
	public int create (Marca marca);
	
	public List<Marca> read ();
	
	public int update (long mar_id, Marca marca);
	
	public int delete (long mar_id);

}
