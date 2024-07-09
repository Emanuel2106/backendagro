package org.usco.agro.modulo;

import java.sql.Timestamp;
import java.sql.Date;


public class Modulo {
    private long mod_id;
	private String mod_nombre;
	private String mod_url;
	private String mod_descripcion;
	private int mod_estado;

	
	public Modulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Modulo(long mod_id, String mod_nombre, String mod_url, String mod_descripcion, int mod_estado) {
		super();
		this.mod_id = mod_id;
		this.mod_nombre = mod_nombre;
		this.mod_url = mod_url;
		this.mod_descripcion = mod_descripcion;
		this.mod_estado = mod_estado;

	}

	public Modulo(String mod_nombre, String mod_url, String mod_descripcion, int mod_estado) {
		super();
		this.mod_nombre = mod_nombre;
		this.mod_url = mod_url;
		this.mod_descripcion = mod_descripcion;
		this.mod_estado = mod_estado;

	}
    
    public long getMod_id() {
		return mod_id;
	}

	public void setMod_id(long mod_id) {
		this.mod_id = mod_id;
	}
	public String getMod_nombre() {
		return mod_nombre;
	}

	public void setMod_nombre(String mod_nombre) {
		this.mod_nombre = mod_nombre;
	}
	public String getMod_url() {
		return mod_url;
	}

	public void setMod_url(String mod_url) {
		this.mod_url = mod_url;
	}
	public String getMod_descripcion() {
		return mod_descripcion;
	}

	public void setMod_descripcion(String mod_descripcion) {
		this.mod_descripcion = mod_descripcion;
	}
	public int getMod_estado() {
		return mod_estado;
	}

	public void setMod_estado(int mod_estado) {
		this.mod_estado = mod_estado;
	}

    
	@Override
	public String toString() {
		return "Modulo [mod_id=" + mod_id + ", mod_nombre=" + mod_nombre + ", mod_url=" + mod_url + ", mod_descripcion=" + mod_descripcion + ", mod_estado=" + mod_estado + "]";
	}
	
}
