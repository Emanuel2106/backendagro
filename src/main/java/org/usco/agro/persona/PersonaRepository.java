package org.usco.agro.persona;


import java.util.List;

public interface PersonaRepository {
	
	public int create (Persona persona);
	
	public List<Persona> read ();
	
	public int update (long per_id, Persona persona);
	
	public int delete (long per_id);

}
