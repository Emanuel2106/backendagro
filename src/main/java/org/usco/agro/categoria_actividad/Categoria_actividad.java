package org.usco.agro.categoria_actividad;

import java.sql.Timestamp;
import java.sql.Date;


public class Categoria_actividad {
    private long caa_id;
	private String caa_nombre;
	private String caa_descripcion;
	private int caa_estado;

	
	public Categoria_actividad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categoria_actividad(long caa_id, String caa_nombre, String caa_descripcion, int caa_estado) {
		super();
		this.caa_id = caa_id;
		this.caa_nombre = caa_nombre;
		this.caa_descripcion = caa_descripcion;
		this.caa_estado = caa_estado;

	}

	public Categoria_actividad(String caa_nombre, String caa_descripcion, int caa_estado) {
		super();
		this.caa_nombre = caa_nombre;
		this.caa_descripcion = caa_descripcion;
		this.caa_estado = caa_estado;

	}
    
    public long getCaa_id() {
		return caa_id;
	}

	public void setCaa_id(long caa_id) {
		this.caa_id = caa_id;
	}
	public String getCaa_nombre() {
		return caa_nombre;
	}

	public void setCaa_nombre(String caa_nombre) {
		this.caa_nombre = caa_nombre;
	}
	public String getCaa_descripcion() {
		return caa_descripcion;
	}

	public void setCaa_descripcion(String caa_descripcion) {
		this.caa_descripcion = caa_descripcion;
	}
	public int getCaa_estado() {
		return caa_estado;
	}

	public void setCaa_estado(int caa_estado) {
		this.caa_estado = caa_estado;
	}

    
	@Override
	public String toString() {
		return "Categoria_actividad [caa_id=" + caa_id + ", caa_nombre=" + caa_nombre + ", caa_descripcion=" + caa_descripcion + ", caa_estado=" + caa_estado + "]";
	}
	
}
