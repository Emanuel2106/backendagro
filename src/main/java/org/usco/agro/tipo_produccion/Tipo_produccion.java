package org.usco.agro.tipo_produccion;

import java.sql.Timestamp;
import java.sql.Date;


public class Tipo_produccion {
    private long tip_id;
	private String tip_nombre;
	private String tip_descripcion;
	private int tip_estado;

	
	public Tipo_produccion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tipo_produccion(long tip_id, String tip_nombre, String tip_descripcion, int tip_estado) {
		super();
		this.tip_id = tip_id;
		this.tip_nombre = tip_nombre;
		this.tip_descripcion = tip_descripcion;
		this.tip_estado = tip_estado;

	}

	public Tipo_produccion(String tip_nombre, String tip_descripcion, int tip_estado) {
		super();
		this.tip_nombre = tip_nombre;
		this.tip_descripcion = tip_descripcion;
		this.tip_estado = tip_estado;

	}
    
    public long getTip_id() {
		return tip_id;
	}

	public void setTip_id(long tip_id) {
		this.tip_id = tip_id;
	}
	public String getTip_nombre() {
		return tip_nombre;
	}

	public void setTip_nombre(String tip_nombre) {
		this.tip_nombre = tip_nombre;
	}
	public String getTip_descripcion() {
		return tip_descripcion;
	}

	public void setTip_descripcion(String tip_descripcion) {
		this.tip_descripcion = tip_descripcion;
	}
	public int getTip_estado() {
		return tip_estado;
	}

	public void setTip_estado(int tip_estado) {
		this.tip_estado = tip_estado;
	}

    
	@Override
	public String toString() {
		return "Tipo_produccion [tip_id=" + tip_id + ", tip_nombre=" + tip_nombre + ", tip_descripcion=" + tip_descripcion + ", tip_estado=" + tip_estado + "]";
	}
	
}
