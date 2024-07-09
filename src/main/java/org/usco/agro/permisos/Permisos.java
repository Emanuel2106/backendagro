package org.usco.agro.permisos;

import java.sql.Timestamp;
import java.sql.Date;


public class Permisos {
    private long per_id;
	private int per_modulo_metodo_id;
	private String per_rol;
	private int per_metodo_id;

	
	public Permisos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Permisos(long per_id, int per_modulo_metodo_id, String per_rol, int per_metodo_id) {
		super();
		this.per_id = per_id;
		this.per_modulo_metodo_id = per_modulo_metodo_id;
		this.per_rol = per_rol;
		this.per_metodo_id = per_metodo_id;

	}

	public Permisos(int per_modulo_metodo_id, String per_rol, int per_metodo_id) {
		super();
		this.per_modulo_metodo_id = per_modulo_metodo_id;
		this.per_rol = per_rol;
		this.per_metodo_id = per_metodo_id;

	}
    
    public long getPer_id() {
		return per_id;
	}

	public void setPer_id(long per_id) {
		this.per_id = per_id;
	}
	public int getPer_modulo_metodo_id() {
		return per_modulo_metodo_id;
	}

	public void setPer_modulo_metodo_id(int per_modulo_metodo_id) {
		this.per_modulo_metodo_id = per_modulo_metodo_id;
	}
	public String getPer_rol() {
		return per_rol;
	}

	public void setPer_rol(String per_rol) {
		this.per_rol = per_rol;
	}
	public int getPer_metodo_id() {
		return per_metodo_id;
	}

	public void setPer_metodo_id(int per_metodo_id) {
		this.per_metodo_id = per_metodo_id;
	}

    
	@Override
	public String toString() {
		return "Permisos [per_id=" + per_id + ", per_modulo_metodo_id=" + per_modulo_metodo_id + ", per_rol=" + per_rol + ", per_metodo_id=" + per_metodo_id + "]";
	}
	
}
