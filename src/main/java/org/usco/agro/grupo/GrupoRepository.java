package org.usco.agro.grupo;


import java.util.List;

public interface GrupoRepository {
	
	public int create (Grupo grupo);
	
	public List<Grupo> read ();
	
	public int update (long gru_id, Grupo grupo);
	
	public int delete (long gru_id);

}
