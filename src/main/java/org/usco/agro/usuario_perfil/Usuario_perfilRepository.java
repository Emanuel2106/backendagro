package org.usco.agro.usuario_perfil;


import java.util.List;

public interface Usuario_perfilRepository {
	
	public int create (Usuario_perfil usuario_perfil);
	
	public List<Usuario_perfil> read ();
	
	public int update (long usp_id, Usuario_perfil usuario_perfil);
	
	public int delete (long usp_id);

}
