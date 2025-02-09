package org.usco.agro.departamento;


import java.util.List;

public interface DepartamentoRepository {
	
	public int create (Departamento departamento);
	
	public List<Departamento> read ();
	
	public int update (long dep_id, Departamento departamento);
	
	public int delete (long dep_id);

}
