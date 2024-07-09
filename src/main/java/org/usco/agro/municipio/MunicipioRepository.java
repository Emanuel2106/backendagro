package org.usco.agro.municipio;


import java.util.List;

public interface MunicipioRepository {
	
	public int create (Municipio municipio);
	
	public List<Municipio> read ();
	
	public int update (long mun_id, Municipio municipio);
	
	public int delete (long mun_id);

}
