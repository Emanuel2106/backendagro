package org.usco.agro.proceso;

import java.sql.Timestamp;
import java.sql.Date;


public class Proceso {
    private long pro_id;
	private int pro_tipo_produccion_id;
	private String pro_nombre;
	private String pro_descripcion;
	private int pro_estado;

	
	public Proceso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Proceso(long pro_id, int pro_tipo_produccion_id, String pro_nombre, String pro_descripcion, int pro_estado) {
		super();
		this.pro_id = pro_id;
		this.pro_tipo_produccion_id = pro_tipo_produccion_id;
		this.pro_nombre = pro_nombre;
		this.pro_descripcion = pro_descripcion;
		this.pro_estado = pro_estado;

	}

	public Proceso(int pro_tipo_produccion_id, String pro_nombre, String pro_descripcion, int pro_estado) {
		super();
		this.pro_tipo_produccion_id = pro_tipo_produccion_id;
		this.pro_nombre = pro_nombre;
		this.pro_descripcion = pro_descripcion;
		this.pro_estado = pro_estado;

	}
    
    public long getPro_id() {
		return pro_id;
	}

	public void setPro_id(long pro_id) {
		this.pro_id = pro_id;
	}
	public int getPro_tipo_produccion_id() {
		return pro_tipo_produccion_id;
	}

	public void setPro_tipo_produccion_id(int pro_tipo_produccion_id) {
		this.pro_tipo_produccion_id = pro_tipo_produccion_id;
	}
	public String getPro_nombre() {
		return pro_nombre;
	}

	public void setPro_nombre(String pro_nombre) {
		this.pro_nombre = pro_nombre;
	}
	public String getPro_descripcion() {
		return pro_descripcion;
	}

	public void setPro_descripcion(String pro_descripcion) {
		this.pro_descripcion = pro_descripcion;
	}
	public int getPro_estado() {
		return pro_estado;
	}

	public void setPro_estado(int pro_estado) {
		this.pro_estado = pro_estado;
	}

    
	@Override
	public String toString() {
		return "Proceso [pro_id=" + pro_id + ", pro_tipo_produccion_id=" + pro_tipo_produccion_id + ", pro_nombre=" + pro_nombre + ", pro_descripcion=" + pro_descripcion + ", pro_estado=" + pro_estado + "]";
	}
	
}
