package org.usco.agro.costo_indirecto;

import java.sql.Timestamp;
import java.sql.Date;


public class Costo_indirecto {
    private long coi_id;
	private int coi_espacio_id;
	private int coi_tipo_costo_indirecto_id;
	private Timestamp coi_fecha_inicio;
	private Timestamp coi_fecha_fin;
	private String coi_nombre;
	private double coi_precio;
	private String coi_descripcion;
	private int coi_estado;

	
	public Costo_indirecto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Costo_indirecto(long coi_id, int coi_espacio_id, int coi_tipo_costo_indirecto_id, Timestamp coi_fecha_inicio, Timestamp coi_fecha_fin, String coi_nombre, double coi_precio, String coi_descripcion, int coi_estado) {
		super();
		this.coi_id = coi_id;
		this.coi_espacio_id = coi_espacio_id;
		this.coi_tipo_costo_indirecto_id = coi_tipo_costo_indirecto_id;
		this.coi_fecha_inicio = coi_fecha_inicio;
		this.coi_fecha_fin = coi_fecha_fin;
		this.coi_nombre = coi_nombre;
		this.coi_precio = coi_precio;
		this.coi_descripcion = coi_descripcion;
		this.coi_estado = coi_estado;

	}

	public Costo_indirecto(int coi_espacio_id, int coi_tipo_costo_indirecto_id, Timestamp coi_fecha_inicio, Timestamp coi_fecha_fin, String coi_nombre, double coi_precio, String coi_descripcion, int coi_estado) {
		super();
		this.coi_espacio_id = coi_espacio_id;
		this.coi_tipo_costo_indirecto_id = coi_tipo_costo_indirecto_id;
		this.coi_fecha_inicio = coi_fecha_inicio;
		this.coi_fecha_fin = coi_fecha_fin;
		this.coi_nombre = coi_nombre;
		this.coi_precio = coi_precio;
		this.coi_descripcion = coi_descripcion;
		this.coi_estado = coi_estado;

	}
    
    public long getCoi_id() {
		return coi_id;
	}

	public void setCoi_id(long coi_id) {
		this.coi_id = coi_id;
	}
	public int getCoi_espacio_id() {
		return coi_espacio_id;
	}

	public void setCoi_espacio_id(int coi_espacio_id) {
		this.coi_espacio_id = coi_espacio_id;
	}
	public int getCoi_tipo_costo_indirecto_id() {
		return coi_tipo_costo_indirecto_id;
	}

	public void setCoi_tipo_costo_indirecto_id(int coi_tipo_costo_indirecto_id) {
		this.coi_tipo_costo_indirecto_id = coi_tipo_costo_indirecto_id;
	}
	public Timestamp getCoi_fecha_inicio() {
		return coi_fecha_inicio;
	}

	public void setCoi_fecha_inicio(Timestamp coi_fecha_inicio) {
		this.coi_fecha_inicio = coi_fecha_inicio;
	}
	public Timestamp getCoi_fecha_fin() {
		return coi_fecha_fin;
	}

	public void setCoi_fecha_fin(Timestamp coi_fecha_fin) {
		this.coi_fecha_fin = coi_fecha_fin;
	}
	public String getCoi_nombre() {
		return coi_nombre;
	}

	public void setCoi_nombre(String coi_nombre) {
		this.coi_nombre = coi_nombre;
	}
	public double getCoi_precio() {
		return coi_precio;
	}

	public void setCoi_precio(double coi_precio) {
		this.coi_precio = coi_precio;
	}
	public String getCoi_descripcion() {
		return coi_descripcion;
	}

	public void setCoi_descripcion(String coi_descripcion) {
		this.coi_descripcion = coi_descripcion;
	}
	public int getCoi_estado() {
		return coi_estado;
	}

	public void setCoi_estado(int coi_estado) {
		this.coi_estado = coi_estado;
	}

    
	@Override
	public String toString() {
		return "Costo_indirecto [coi_id=" + coi_id + ", coi_espacio_id=" + coi_espacio_id + ", coi_tipo_costo_indirecto_id=" + coi_tipo_costo_indirecto_id + ", coi_fecha_inicio=" + coi_fecha_inicio + ", coi_fecha_fin=" + coi_fecha_fin + ", coi_nombre=" + coi_nombre + ", coi_precio=" + coi_precio + ", coi_descripcion=" + coi_descripcion + ", coi_estado=" + coi_estado + "]";
	}
	
}
