package org.usco.agro.tipo_costo_indirecto;

import java.sql.Timestamp;
import java.sql.Date;


public class Tipo_costo_indirecto {
    private long tci_id;
	private String tci_nombre;
	private String tci_descripcion;
	private int tci_estado;

	
	public Tipo_costo_indirecto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tipo_costo_indirecto(long tci_id, String tci_nombre, String tci_descripcion, int tci_estado) {
		super();
		this.tci_id = tci_id;
		this.tci_nombre = tci_nombre;
		this.tci_descripcion = tci_descripcion;
		this.tci_estado = tci_estado;

	}

	public Tipo_costo_indirecto(String tci_nombre, String tci_descripcion, int tci_estado) {
		super();
		this.tci_nombre = tci_nombre;
		this.tci_descripcion = tci_descripcion;
		this.tci_estado = tci_estado;

	}
    
    public long getTci_id() {
		return tci_id;
	}

	public void setTci_id(long tci_id) {
		this.tci_id = tci_id;
	}
	public String getTci_nombre() {
		return tci_nombre;
	}

	public void setTci_nombre(String tci_nombre) {
		this.tci_nombre = tci_nombre;
	}
	public String getTci_descripcion() {
		return tci_descripcion;
	}

	public void setTci_descripcion(String tci_descripcion) {
		this.tci_descripcion = tci_descripcion;
	}
	public int getTci_estado() {
		return tci_estado;
	}

	public void setTci_estado(int tci_estado) {
		this.tci_estado = tci_estado;
	}

    
	@Override
	public String toString() {
		return "Tipo_costo_indirecto [tci_id=" + tci_id + ", tci_nombre=" + tci_nombre + ", tci_descripcion=" + tci_descripcion + ", tci_estado=" + tci_estado + "]";
	}
	
}
