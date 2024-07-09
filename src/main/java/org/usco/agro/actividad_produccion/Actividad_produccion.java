package org.usco.agro.actividad_produccion;

import java.sql.Timestamp;
import java.sql.Date;


public class Actividad_produccion {
    private long acp_id;
	private String acp_nombre;
	private int acp_actividad_programacion_id;
	private String acp_descripcion;
	private int acp_estado;

	
	public Actividad_produccion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Actividad_produccion(long acp_id, String acp_nombre, int acp_actividad_programacion_id, String acp_descripcion, int acp_estado) {
		super();
		this.acp_id = acp_id;
		this.acp_nombre = acp_nombre;
		this.acp_actividad_programacion_id = acp_actividad_programacion_id;
		this.acp_descripcion = acp_descripcion;
		this.acp_estado = acp_estado;

	}

	public Actividad_produccion(String acp_nombre, int acp_actividad_programacion_id, String acp_descripcion, int acp_estado) {
		super();
		this.acp_nombre = acp_nombre;
		this.acp_actividad_programacion_id = acp_actividad_programacion_id;
		this.acp_descripcion = acp_descripcion;
		this.acp_estado = acp_estado;

	}
    
    public long getAcp_id() {
		return acp_id;
	}

	public void setAcp_id(long acp_id) {
		this.acp_id = acp_id;
	}
	public String getAcp_nombre() {
		return acp_nombre;
	}

	public void setAcp_nombre(String acp_nombre) {
		this.acp_nombre = acp_nombre;
	}
	public int getAcp_actividad_programacion_id() {
		return acp_actividad_programacion_id;
	}

	public void setAcp_actividad_programacion_id(int acp_actividad_programacion_id) {
		this.acp_actividad_programacion_id = acp_actividad_programacion_id;
	}
	public String getAcp_descripcion() {
		return acp_descripcion;
	}

	public void setAcp_descripcion(String acp_descripcion) {
		this.acp_descripcion = acp_descripcion;
	}
	public int getAcp_estado() {
		return acp_estado;
	}

	public void setAcp_estado(int acp_estado) {
		this.acp_estado = acp_estado;
	}

    
	@Override
	public String toString() {
		return "Actividad_produccion [acp_id=" + acp_id + ", acp_nombre=" + acp_nombre + ", acp_actividad_programacion_id=" + acp_actividad_programacion_id + ", acp_descripcion=" + acp_descripcion + ", acp_estado=" + acp_estado + "]";
	}
	
}
