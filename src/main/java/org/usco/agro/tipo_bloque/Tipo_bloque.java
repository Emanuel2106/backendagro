package org.usco.agro.tipo_bloque;

import java.sql.Timestamp;
import java.sql.Date;


public class Tipo_bloque {
    private long tib_id;
	private String tib_nombre;
	private String tib_descripcion;
	private int tib_estado;

	
	public Tipo_bloque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tipo_bloque(long tib_id, String tib_nombre, String tib_descripcion, int tib_estado) {
		super();
		this.tib_id = tib_id;
		this.tib_nombre = tib_nombre;
		this.tib_descripcion = tib_descripcion;
		this.tib_estado = tib_estado;

	}

	public Tipo_bloque(String tib_nombre, String tib_descripcion, int tib_estado) {
		super();
		this.tib_nombre = tib_nombre;
		this.tib_descripcion = tib_descripcion;
		this.tib_estado = tib_estado;

	}
    
    public long getTib_id() {
		return tib_id;
	}

	public void setTib_id(long tib_id) {
		this.tib_id = tib_id;
	}
	public String getTib_nombre() {
		return tib_nombre;
	}

	public void setTib_nombre(String tib_nombre) {
		this.tib_nombre = tib_nombre;
	}
	public String getTib_descripcion() {
		return tib_descripcion;
	}

	public void setTib_descripcion(String tib_descripcion) {
		this.tib_descripcion = tib_descripcion;
	}
	public int getTib_estado() {
		return tib_estado;
	}

	public void setTib_estado(int tib_estado) {
		this.tib_estado = tib_estado;
	}

    
	@Override
	public String toString() {
		return "Tipo_bloque [tib_id=" + tib_id + ", tib_nombre=" + tib_nombre + ", tib_descripcion=" + tib_descripcion + ", tib_estado=" + tib_estado + "]";
	}
	
}
