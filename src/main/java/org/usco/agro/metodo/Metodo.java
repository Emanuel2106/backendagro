package org.usco.agro.metodo;

import java.sql.Timestamp;
import java.sql.Date;


public class Metodo {
    private long met_id;
	private String met_nombre;
	private String met_descripcion;
	private int met_estado;

	
	public Metodo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Metodo(long met_id, String met_nombre, String met_descripcion, int met_estado) {
		super();
		this.met_id = met_id;
		this.met_nombre = met_nombre;
		this.met_descripcion = met_descripcion;
		this.met_estado = met_estado;

	}

	public Metodo(String met_nombre, String met_descripcion, int met_estado) {
		super();
		this.met_nombre = met_nombre;
		this.met_descripcion = met_descripcion;
		this.met_estado = met_estado;

	}
    
    public long getMet_id() {
		return met_id;
	}

	public void setMet_id(long met_id) {
		this.met_id = met_id;
	}
	public String getMet_nombre() {
		return met_nombre;
	}

	public void setMet_nombre(String met_nombre) {
		this.met_nombre = met_nombre;
	}
	public String getMet_descripcion() {
		return met_descripcion;
	}

	public void setMet_descripcion(String met_descripcion) {
		this.met_descripcion = met_descripcion;
	}
	public int getMet_estado() {
		return met_estado;
	}

	public void setMet_estado(int met_estado) {
		this.met_estado = met_estado;
	}

    
	@Override
	public String toString() {
		return "Metodo [met_id=" + met_id + ", met_nombre=" + met_nombre + ", met_descripcion=" + met_descripcion + ", met_estado=" + met_estado + "]";
	}
	
}
