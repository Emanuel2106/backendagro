package org.usco.agro.producto_categoria;

import java.sql.Timestamp;
import java.sql.Date;


public class Producto_categoria {
    private long prc_id;
	private String prc_nombre;
	private String prc_descripcion;
	private int prc_estado;

	
	public Producto_categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Producto_categoria(long prc_id, String prc_nombre, String prc_descripcion, int prc_estado) {
		super();
		this.prc_id = prc_id;
		this.prc_nombre = prc_nombre;
		this.prc_descripcion = prc_descripcion;
		this.prc_estado = prc_estado;

	}

	public Producto_categoria(String prc_nombre, String prc_descripcion, int prc_estado) {
		super();
		this.prc_nombre = prc_nombre;
		this.prc_descripcion = prc_descripcion;
		this.prc_estado = prc_estado;

	}
    
    public long getPrc_id() {
		return prc_id;
	}

	public void setPrc_id(long prc_id) {
		this.prc_id = prc_id;
	}
	public String getPrc_nombre() {
		return prc_nombre;
	}

	public void setPrc_nombre(String prc_nombre) {
		this.prc_nombre = prc_nombre;
	}
	public String getPrc_descripcion() {
		return prc_descripcion;
	}

	public void setPrc_descripcion(String prc_descripcion) {
		this.prc_descripcion = prc_descripcion;
	}
	public int getPrc_estado() {
		return prc_estado;
	}

	public void setPrc_estado(int prc_estado) {
		this.prc_estado = prc_estado;
	}

    
	@Override
	public String toString() {
		return "Producto_categoria [prc_id=" + prc_id + ", prc_nombre=" + prc_nombre + ", prc_descripcion=" + prc_descripcion + ", prc_estado=" + prc_estado + "]";
	}
	
}
