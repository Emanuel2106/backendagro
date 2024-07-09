package org.usco.agro.usuario_perfil;

import java.sql.Timestamp;
import java.sql.Date;


public class Usuario_perfil {
    private long usp_id;
	private int usp_usuario_id;
	private int usp_perfil_id;
	private int usp_estado;

	
	public Usuario_perfil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario_perfil(long usp_id, int usp_usuario_id, int usp_perfil_id, int usp_estado) {
		super();
		this.usp_id = usp_id;
		this.usp_usuario_id = usp_usuario_id;
		this.usp_perfil_id = usp_perfil_id;
		this.usp_estado = usp_estado;

	}

	public Usuario_perfil(int usp_usuario_id, int usp_perfil_id, int usp_estado) {
		super();
		this.usp_usuario_id = usp_usuario_id;
		this.usp_perfil_id = usp_perfil_id;
		this.usp_estado = usp_estado;

	}
    
    public long getUsp_id() {
		return usp_id;
	}

	public void setUsp_id(long usp_id) {
		this.usp_id = usp_id;
	}
	public int getUsp_usuario_id() {
		return usp_usuario_id;
	}

	public void setUsp_usuario_id(int usp_usuario_id) {
		this.usp_usuario_id = usp_usuario_id;
	}
	public int getUsp_perfil_id() {
		return usp_perfil_id;
	}

	public void setUsp_perfil_id(int usp_perfil_id) {
		this.usp_perfil_id = usp_perfil_id;
	}
	public int getUsp_estado() {
		return usp_estado;
	}

	public void setUsp_estado(int usp_estado) {
		this.usp_estado = usp_estado;
	}

    
	@Override
	public String toString() {
		return "Usuario_perfil [usp_id=" + usp_id + ", usp_usuario_id=" + usp_usuario_id + ", usp_perfil_id=" + usp_perfil_id + ", usp_estado=" + usp_estado + "]";
	}
	
}
