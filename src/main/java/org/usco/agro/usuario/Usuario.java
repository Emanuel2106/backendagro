package org.usco.agro.usuario;

import java.sql.Timestamp;
import java.sql.Date;


public class Usuario {
    private long usu_id;
	private int usu_persona_id;
	private String usu_email;
	private String usu_password;
	private int usu_estado;

	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(long usu_id, int usu_persona_id, String usu_email, String usu_password, int usu_estado) {
		super();
		this.usu_id = usu_id;
		this.usu_persona_id = usu_persona_id;
		this.usu_email = usu_email;
		this.usu_password = usu_password;
		this.usu_estado = usu_estado;

	}

	public Usuario(int usu_persona_id, String usu_email, String usu_password, int usu_estado) {
		super();
		this.usu_persona_id = usu_persona_id;
		this.usu_email = usu_email;
		this.usu_password = usu_password;
		this.usu_estado = usu_estado;

	}
    
    public long getUsu_id() {
		return usu_id;
	}

	public void setUsu_id(long usu_id) {
		this.usu_id = usu_id;
	}
	public int getUsu_persona_id() {
		return usu_persona_id;
	}

	public void setUsu_persona_id(int usu_persona_id) {
		this.usu_persona_id = usu_persona_id;
	}
	public String getUsu_email() {
		return usu_email;
	}

	public void setUsu_email(String usu_email) {
		this.usu_email = usu_email;
	}
	public String getUsu_password() {
		return usu_password;
	}

	public void setUsu_password(String usu_password) {
		this.usu_password = usu_password;
	}
	public int getUsu_estado() {
		return usu_estado;
	}

	public void setUsu_estado(int usu_estado) {
		this.usu_estado = usu_estado;
	}

    
	@Override
	public String toString() {
		return "Usuario [usu_id=" + usu_id + ", usu_persona_id=" + usu_persona_id + ", usu_email=" + usu_email + ", usu_password=" + usu_password + ", usu_estado=" + usu_estado + "]";
	}
	
}
