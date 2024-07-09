package org.usco.agro.condicion_agroclimatica_item;


import java.util.List;

public interface Condicion_agroclimatica_itemRepository {
	
	public int create (Condicion_agroclimatica_item condicion_agroclimatica_item);
	
	public List<Condicion_agroclimatica_item> read ();
	
	public int update (long cai_id, Condicion_agroclimatica_item condicion_agroclimatica_item);
	
	public int delete (long cai_id);

}
