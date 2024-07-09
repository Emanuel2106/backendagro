package org.usco.agro.presentacion;


import java.util.List;

public interface PresentacionRepository {
	
	public int create (Presentacion presentacion);
	
	public List<Presentacion> read ();
	
	public int update (long pre_id, Presentacion marca);
	
	public int delete (long pre_id);

}
