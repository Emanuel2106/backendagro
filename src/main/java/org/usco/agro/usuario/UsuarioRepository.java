package org.usco.agro.usuario;


import java.util.List;

public interface UsuarioRepository {
	
	public int create (Usuario usuario);
	
	public List<Usuario> read ();
	
	public int update (long usu_id, Usuario usuario);
	
	public int delete (long usu_id);

}
