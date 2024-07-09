package org.usco.agro.evaluacion;

import java.sql.Timestamp;
import java.sql.Date;


public class Evaluacion {
    private long eva_id;
	private String eva_nombre;
	private String eva_descripcion;
	private int eva_estado;

	
	public Evaluacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Evaluacion(long eva_id, String eva_nombre, String eva_descripcion, int eva_estado) {
		super();
		this.eva_id = eva_id;
		this.eva_nombre = eva_nombre;
		this.eva_descripcion = eva_descripcion;
		this.eva_estado = eva_estado;

	}

	public Evaluacion(String eva_nombre, String eva_descripcion, int eva_estado) {
		super();
		this.eva_nombre = eva_nombre;
		this.eva_descripcion = eva_descripcion;
		this.eva_estado = eva_estado;

	}
    
    public long getEva_id() {
		return eva_id;
	}

	public void setEva_id(long eva_id) {
		this.eva_id = eva_id;
	}
	public String getEva_nombre() {
		return eva_nombre;
	}

	public void setEva_nombre(String eva_nombre) {
		this.eva_nombre = eva_nombre;
	}
	public String getEva_descripcion() {
		return eva_descripcion;
	}

	public void setEva_descripcion(String eva_descripcion) {
		this.eva_descripcion = eva_descripcion;
	}
	public int getEva_estado() {
		return eva_estado;
	}

	public void setEva_estado(int eva_estado) {
		this.eva_estado = eva_estado;
	}

    
	@Override
	public String toString() {
		return "Evaluacion [eva_id=" + eva_id + ", eva_nombre=" + eva_nombre + ", eva_descripcion=" + eva_descripcion + ", eva_estado=" + eva_estado + "]";
	}
	
}
