package org.usco.agro.producto_presentacion;


import java.util.List;

public interface Producto_presentacionRepository {
	
	public int create (Producto_presentacion producto_presentacion);
	
	public List<Producto_presentacion> read ();
	
	public int update (long prp_id, Producto_presentacion producto_presentacion);
	
	public int delete (long prp_id);

}
