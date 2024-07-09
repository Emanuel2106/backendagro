package org.usco.agro.tipo_actividad;

import java.sql.Timestamp;
import java.sql.Date;


public class Tipo_actividad {
    private long tia_id;
	private int tia_categoria_actividad_id;
	private int tia_proceso_id;
	private String tia_nombre;
	private String tia_descripcion;
	private int tia_estado;

	
	public Tipo_actividad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tipo_actividad(long tia_id, int tia_categoria_actividad_id, int tia_proceso_id, String tia_nombre, String tia_descripcion, int tia_estado) {
		super();
		this.tia_id = tia_id;
		this.tia_categoria_actividad_id = tia_categoria_actividad_id;
		this.tia_proceso_id = tia_proceso_id;
		this.tia_nombre = tia_nombre;
		this.tia_descripcion = tia_descripcion;
		this.tia_estado = tia_estado;

	}

	public Tipo_actividad(int tia_categoria_actividad_id, int tia_proceso_id, String tia_nombre, String tia_descripcion, int tia_estado) {
		super();
		this.tia_categoria_actividad_id = tia_categoria_actividad_id;
		this.tia_proceso_id = tia_proceso_id;
		this.tia_nombre = tia_nombre;
		this.tia_descripcion = tia_descripcion;
		this.tia_estado = tia_estado;

	}
    
    public long getTia_id() {
		return tia_id;
	}

	public void setTia_id(long tia_id) {
		this.tia_id = tia_id;
	}
	public int getTia_categoria_actividad_id() {
		return tia_categoria_actividad_id;
	}

	public void setTia_categoria_actividad_id(int tia_categoria_actividad_id) {
		this.tia_categoria_actividad_id = tia_categoria_actividad_id;
	}
	public int getTia_proceso_id() {
		return tia_proceso_id;
	}

	public void setTia_proceso_id(int tia_proceso_id) {
		this.tia_proceso_id = tia_proceso_id;
	}
	public String getTia_nombre() {
		return tia_nombre;
	}

	public void setTia_nombre(String tia_nombre) {
		this.tia_nombre = tia_nombre;
	}
	public String getTia_descripcion() {
		return tia_descripcion;
	}

	public void setTia_descripcion(String tia_descripcion) {
		this.tia_descripcion = tia_descripcion;
	}
	public int getTia_estado() {
		return tia_estado;
	}

	public void setTia_estado(int tia_estado) {
		this.tia_estado = tia_estado;
	}

    
	@Override
	public String toString() {
		return "Tipo_actividad [tia_id=" + tia_id + ", tia_categoria_actividad_id=" + tia_categoria_actividad_id + ", tia_proceso_id=" + tia_proceso_id + ", tia_nombre=" + tia_nombre + ", tia_descripcion=" + tia_descripcion + ", tia_estado=" + tia_estado + "]";
	}
	
}
