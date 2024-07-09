package org.usco.agro.tipo_sede;

import java.sql.Timestamp;
import java.sql.Date;


public class Tipo_sede {
    private long tis_id;
	private String tis_nombre;
	private String tis_descripcion;
	private int tis_estado;

	
	public Tipo_sede() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tipo_sede(long tis_id, String tis_nombre, String tis_descripcion, int tis_estado) {
		super();
		this.tis_id = tis_id;
		this.tis_nombre = tis_nombre;
		this.tis_descripcion = tis_descripcion;
		this.tis_estado = tis_estado;

	}

	public Tipo_sede(String tis_nombre, String tis_descripcion, int tis_estado) {
		super();
		this.tis_nombre = tis_nombre;
		this.tis_descripcion = tis_descripcion;
		this.tis_estado = tis_estado;

	}
    
    public long getTis_id() {
		return tis_id;
	}

	public void setTis_id(long tis_id) {
		this.tis_id = tis_id;
	}
	public String getTis_nombre() {
		return tis_nombre;
	}

	public void setTis_nombre(String tis_nombre) {
		this.tis_nombre = tis_nombre;
	}
	public String getTis_descripcion() {
		return tis_descripcion;
	}

	public void setTis_descripcion(String tis_descripcion) {
		this.tis_descripcion = tis_descripcion;
	}
	public int getTis_estado() {
		return tis_estado;
	}

	public void setTis_estado(int tis_estado) {
		this.tis_estado = tis_estado;
	}

    
	@Override
	public String toString() {
		return "Tipo_sede [tis_id=" + tis_id + ", tis_nombre=" + tis_nombre + ", tis_descripcion=" + tis_descripcion + ", tis_estado=" + tis_estado + "]";
	}
	
}
