package org.usco.agro.tipo_sede;


import java.util.List;

public interface Tipo_sedeRepository {
	
	public int create (Tipo_sede tipo_sede);
	
	public List<Tipo_sede> read ();
	
	public int update (long tis_id, Tipo_sede tipo_sede);
	
	public int delete (long tis_id);

}
