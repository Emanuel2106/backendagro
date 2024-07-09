package org.usco.agro.kardex_item;


import java.util.List;

public interface Kardex_itemRepository {
	
	public int create (Kardex_item kardex_item);
	
	public List<Kardex_item> read ();
	
	public int update (long kai_id, Kardex_item kardex_item);
	
	public int delete (long kai_id);

}
