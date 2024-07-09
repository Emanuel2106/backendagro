package org.usco.agro.kardex;


import java.util.List;

public interface KardexRepository {
	
	public int create (Kardex kardex);
	
	public List<Kardex> read ();
	
	public int update (long kar_id, Kardex kardex);
	
	public int delete (long kar_id);

}
