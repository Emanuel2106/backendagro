package org.usco.agro.tipo_movimiento;


import java.util.List;

public interface Tipo_movimientoRepository {
	
	public int create (Tipo_movimiento tipo_movimiento);
	
	public List<Tipo_movimiento> read ();
	
	public int update (long tim_id, Tipo_movimiento tipo_movimiento);
	
	public int delete (long tim_id);

}
