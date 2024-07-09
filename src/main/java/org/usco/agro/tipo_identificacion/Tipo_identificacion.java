package org.usco.agro.tipo_identificacion;

import java.sql.Timestamp;
import java.sql.Date;


public class Tipo_identificacion {
    private long tii_id;
	private String tii_nombre;
	private String tii_descripcion;
	private int tii_estado;

	
	public Tipo_identificacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tipo_identificacion(long tii_id, String tii_nombre, String tii_descripcion, int tii_estado) {
		super();
		this.tii_id = tii_id;
		this.tii_nombre = tii_nombre;
		this.tii_descripcion = tii_descripcion;
		this.tii_estado = tii_estado;

	}

	public Tipo_identificacion(String tii_nombre, String tii_descripcion, int tii_estado) {
		super();
		this.tii_nombre = tii_nombre;
		this.tii_descripcion = tii_descripcion;
		this.tii_estado = tii_estado;

	}
    
    public long getTii_id() {
		return tii_id;
	}

	public void setTii_id(long tii_id) {
		this.tii_id = tii_id;
	}
	public String getTii_nombre() {
		return tii_nombre;
	}

	public void setTii_nombre(String tii_nombre) {
		this.tii_nombre = tii_nombre;
	}
	public String getTii_descripcion() {
		return tii_descripcion;
	}

	public void setTii_descripcion(String tii_descripcion) {
		this.tii_descripcion = tii_descripcion;
	}
	public int getTii_estado() {
		return tii_estado;
	}

	public void setTii_estado(int tii_estado) {
		this.tii_estado = tii_estado;
	}

    
	@Override
	public String toString() {
		return "Tipo_identificacion [tii_id=" + tii_id + ", tii_nombre=" + tii_nombre + ", tii_descripcion=" + tii_descripcion + ", tii_estado=" + tii_estado + "]";
	}
	
}
