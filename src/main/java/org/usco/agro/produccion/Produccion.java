package org.usco.agro.produccion;

import java.sql.Timestamp;
import java.sql.Date;


public class Produccion {
    private long pro_id;
	private String pro_nombre;
	private int pro_tipo_produccion_id;
	private String pro_descripcion;
	private Timestamp pro_fecha_inicio;
	private Timestamp pro_fecha_final;
	private int pro_espacio_id;
	private int pro_estado;

	
	public Produccion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produccion(long pro_id, String pro_nombre, int pro_tipo_produccion_id, String pro_descripcion, Timestamp pro_fecha_inicio, Timestamp pro_fecha_final, int pro_espacio_id, int pro_estado) {
		super();
		this.pro_id = pro_id;
		this.pro_nombre = pro_nombre;
		this.pro_tipo_produccion_id = pro_tipo_produccion_id;
		this.pro_descripcion = pro_descripcion;
		this.pro_fecha_inicio = pro_fecha_inicio;
		this.pro_fecha_final = pro_fecha_final;
		this.pro_espacio_id = pro_espacio_id;
		this.pro_estado = pro_estado;

	}

	public Produccion(String pro_nombre, int pro_tipo_produccion_id, String pro_descripcion, Timestamp pro_fecha_inicio, Timestamp pro_fecha_final, int pro_espacio_id, int pro_estado) {
		super();
		this.pro_nombre = pro_nombre;
		this.pro_tipo_produccion_id = pro_tipo_produccion_id;
		this.pro_descripcion = pro_descripcion;
		this.pro_fecha_inicio = pro_fecha_inicio;
		this.pro_fecha_final = pro_fecha_final;
		this.pro_espacio_id = pro_espacio_id;
		this.pro_estado = pro_estado;

	}
    
    public long getPro_id() {
		return pro_id;
	}

	public void setPro_id(long pro_id) {
		this.pro_id = pro_id;
	}
	public String getPro_nombre() {
		return pro_nombre;
	}

	public void setPro_nombre(String pro_nombre) {
		this.pro_nombre = pro_nombre;
	}
	public int getPro_tipo_produccion_id() {
		return pro_tipo_produccion_id;
	}

	public void setPro_tipo_produccion_id(int pro_tipo_produccion_id) {
		this.pro_tipo_produccion_id = pro_tipo_produccion_id;
	}
	public String getPro_descripcion() {
		return pro_descripcion;
	}

	public void setPro_descripcion(String pro_descripcion) {
		this.pro_descripcion = pro_descripcion;
	}
	public Timestamp getPro_fecha_inicio() {
		return pro_fecha_inicio;
	}

	public void setPro_fecha_inicio(Timestamp pro_fecha_inicio) {
		this.pro_fecha_inicio = pro_fecha_inicio;
	}
	public Timestamp getPro_fecha_final() {
		return pro_fecha_final;
	}

	public void setPro_fecha_final(Timestamp pro_fecha_final) {
		this.pro_fecha_final = pro_fecha_final;
	}
	public int getPro_espacio_id() {
		return pro_espacio_id;
	}

	public void setPro_espacio_id(int pro_espacio_id) {
		this.pro_espacio_id = pro_espacio_id;
	}
	public int getPro_estado() {
		return pro_estado;
	}

	public void setPro_estado(int pro_estado) {
		this.pro_estado = pro_estado;
	}

    
	@Override
	public String toString() {
		return "Produccion [pro_id=" + pro_id + ", pro_nombre=" + pro_nombre + ", pro_tipo_produccion_id=" + pro_tipo_produccion_id + ", pro_descripcion=" + pro_descripcion + ", pro_fecha_inicio=" + pro_fecha_inicio + ", pro_fecha_final=" + pro_fecha_final + ", pro_espacio_id=" + pro_espacio_id + ", pro_estado=" + pro_estado + "]";
	}
	
}
