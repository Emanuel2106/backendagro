package org.usco.agro.perfil;

import java.sql.Timestamp;
import java.sql.Date;


public class Perfil {
    private long per_id;
	private String per_nombre;
	private String per_descripcion;
	private int per_estado;

	
	public Perfil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perfil(long per_id, String per_nombre, String per_descripcion, int per_estado) {
		super();
		this.per_id = per_id;
		this.per_nombre = per_nombre;
		this.per_descripcion = per_descripcion;
		this.per_estado = per_estado;

	}

	public Perfil(String per_nombre, String per_descripcion, int per_estado) {
		super();
		this.per_nombre = per_nombre;
		this.per_descripcion = per_descripcion;
		this.per_estado = per_estado;

	}
    
    public long getPer_id() {
		return per_id;
	}

	public void setPer_id(long per_id) {
		this.per_id = per_id;
	}
	public String getPer_nombre() {
		return per_nombre;
	}

	public void setPer_nombre(String per_nombre) {
		this.per_nombre = per_nombre;
	}
	public String getPer_descripcion() {
		return per_descripcion;
	}

	public void setPer_descripcion(String per_descripcion) {
		this.per_descripcion = per_descripcion;
	}
	public int getPer_estado() {
		return per_estado;
	}

	public void setPer_estado(int per_estado) {
		this.per_estado = per_estado;
	}

    
	@Override
	public String toString() {
		return "Perfil [per_id=" + per_id + ", per_nombre=" + per_nombre + ", per_descripcion=" + per_descripcion + ", per_estado=" + per_estado + "]";
	}
	
}
