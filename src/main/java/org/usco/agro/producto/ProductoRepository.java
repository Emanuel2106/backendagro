package org.usco.agro.producto;


import java.util.List;

public interface ProductoRepository {
	
	public int create (Producto producto);
	
	public List<Producto> read ();
	
	public int update (long pro_id, Producto producto);
	
	public int delete (long pro_id);

}
