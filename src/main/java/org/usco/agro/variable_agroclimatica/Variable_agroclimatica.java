package org.usco.agro.variable_agroclimatica;

import java.sql.Timestamp;
import java.sql.Date;


public class Variable_agroclimatica {
    private long vaa_id;
	private String vaa_nombre;
	private int vaa_unidad;
	private String vaa_descripcion;
	private int vaa_estado;

	
	public Variable_agroclimatica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Variable_agroclimatica(long vaa_id, String vaa_nombre, int vaa_unidad, String vaa_descripcion, int vaa_estado) {
		super();
		this.vaa_id = vaa_id;
		this.vaa_nombre = vaa_nombre;
		this.vaa_unidad = vaa_unidad;
		this.vaa_descripcion = vaa_descripcion;
		this.vaa_estado = vaa_estado;

	}

	public Variable_agroclimatica(String vaa_nombre, int vaa_unidad, String vaa_descripcion, int vaa_estado) {
		super();
		this.vaa_nombre = vaa_nombre;
		this.vaa_unidad = vaa_unidad;
		this.vaa_descripcion = vaa_descripcion;
		this.vaa_estado = vaa_estado;

	}
    
    public long getVaa_id() {
		return vaa_id;
	}

	public void setVaa_id(long vaa_id) {
		this.vaa_id = vaa_id;
	}
	public String getVaa_nombre() {
		return vaa_nombre;
	}

	public void setVaa_nombre(String vaa_nombre) {
		this.vaa_nombre = vaa_nombre;
	}
	public int getVaa_unidad() {
		return vaa_unidad;
	}

	public void setVaa_unidad(int vaa_unidad) {
		this.vaa_unidad = vaa_unidad;
	}
	public String getVaa_descripcion() {
		return vaa_descripcion;
	}

	public void setVaa_descripcion(String vaa_descripcion) {
		this.vaa_descripcion = vaa_descripcion;
	}
	public int getVaa_estado() {
		return vaa_estado;
	}

	public void setVaa_estado(int vaa_estado) {
		this.vaa_estado = vaa_estado;
	}

    
	@Override
	public String toString() {
		return "Variable_agroclimatica [vaa_id=" + vaa_id + ", vaa_nombre=" + vaa_nombre + ", vaa_unidad=" + vaa_unidad + ", vaa_descripcion=" + vaa_descripcion + ", vaa_estado=" + vaa_estado + "]";
	}
	
}
