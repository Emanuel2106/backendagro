package org.usco.agro.unidad;

import java.sql.Timestamp;
import java.sql.Date;


public class Unidad {
    private long uni_id;
	private String uni_nombre;
	private String uni_descripcion;
	private int uni_estado;

	
	public Unidad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Unidad(long uni_id, String uni_nombre, String uni_descripcion, int uni_estado) {
		super();
		this.uni_id = uni_id;
		this.uni_nombre = uni_nombre;
		this.uni_descripcion = uni_descripcion;
		this.uni_estado = uni_estado;

	}

	public Unidad(String uni_nombre, String uni_descripcion, int uni_estado) {
		super();
		this.uni_nombre = uni_nombre;
		this.uni_descripcion = uni_descripcion;
		this.uni_estado = uni_estado;

	}
    
    public long getUni_id() {
		return uni_id;
	}

	public void setUni_id(long uni_id) {
		this.uni_id = uni_id;
	}
	public String getUni_nombre() {
		return uni_nombre;
	}

	public void setUni_nombre(String uni_nombre) {
		this.uni_nombre = uni_nombre;
	}
	public String getUni_descripcion() {
		return uni_descripcion;
	}

	public void setUni_descripcion(String uni_descripcion) {
		this.uni_descripcion = uni_descripcion;
	}
	public int getUni_estado() {
		return uni_estado;
	}

	public void setUni_estado(int uni_estado) {
		this.uni_estado = uni_estado;
	}

    
	@Override
	public String toString() {
		return "Unidad [uni_id=" + uni_id + ", uni_nombre=" + uni_nombre + ", uni_descripcion=" + uni_descripcion + ", uni_estado=" + uni_estado + "]";
	}
	
}
