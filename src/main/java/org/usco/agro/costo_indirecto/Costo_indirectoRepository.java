package org.usco.agro.costo_indirecto;


import java.util.List;

public interface Costo_indirectoRepository {
	
	public int create (Costo_indirecto costo_indirecto);
	
	public List<Costo_indirecto> read ();
	
	public int update (long coi_id, Costo_indirecto costo_indirecto);
	
	public int delete (long coi_id);

}
