package org.usco.agro.tipo_espacio;

import java.sql.Timestamp;
import java.sql.Date;


public class Tipo_espacio {
    private long tie_id;
	private String tie_nombre;
	private String tie_descripcion;
	private int tie_estado;

	
	public Tipo_espacio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tipo_espacio(long tie_id, String tie_nombre, String tie_descripcion, int tie_estado) {
		super();
		this.tie_id = tie_id;
		this.tie_nombre = tie_nombre;
		this.tie_descripcion = tie_descripcion;
		this.tie_estado = tie_estado;

	}

	public Tipo_espacio(String tie_nombre, String tie_descripcion, int tie_estado) {
		super();
		this.tie_nombre = tie_nombre;
		this.tie_descripcion = tie_descripcion;
		this.tie_estado = tie_estado;

	}
    
    public long getTie_id() {
		return tie_id;
	}

	public void setTie_id(long tie_id) {
		this.tie_id = tie_id;
	}
	public String getTie_nombre() {
		return tie_nombre;
	}

	public void setTie_nombre(String tie_nombre) {
		this.tie_nombre = tie_nombre;
	}
	public String getTie_descripcion() {
		return tie_descripcion;
	}

	public void setTie_descripcion(String tie_descripcion) {
		this.tie_descripcion = tie_descripcion;
	}
	public int getTie_estado() {
		return tie_estado;
	}

	public void setTie_estado(int tie_estado) {
		this.tie_estado = tie_estado;
	}

    
	@Override
	public String toString() {
		return "Tipo_espacio [tie_id=" + tie_id + ", tie_nombre=" + tie_nombre + ", tie_descripcion=" + tie_descripcion + ", tie_estado=" + tie_estado + "]";
	}
	
}
