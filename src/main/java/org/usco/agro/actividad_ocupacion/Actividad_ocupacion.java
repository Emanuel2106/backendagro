package org.usco.agro.actividad_ocupacion;

import java.sql.Timestamp;
import java.sql.Date;


public class Actividad_ocupacion {
    private long aco_id;
	private String aco_nombre;
	private int aco_tipo_actividad_id;
	private int aco_evaluacion_id;

	
	public Actividad_ocupacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Actividad_ocupacion(long aco_id, String aco_nombre, int aco_tipo_actividad_id, int aco_evaluacion_id) {
		super();
		this.aco_id = aco_id;
		this.aco_nombre = aco_nombre;
		this.aco_tipo_actividad_id = aco_tipo_actividad_id;
		this.aco_evaluacion_id = aco_evaluacion_id;

	}

	public Actividad_ocupacion(String aco_nombre, int aco_tipo_actividad_id, int aco_evaluacion_id) {
		super();
		this.aco_nombre = aco_nombre;
		this.aco_tipo_actividad_id = aco_tipo_actividad_id;
		this.aco_evaluacion_id = aco_evaluacion_id;

	}
    
    public long getAco_id() {
		return aco_id;
	}

	public void setAco_id(long aco_id) {
		this.aco_id = aco_id;
	}
	public String getAco_nombre() {
		return aco_nombre;
	}

	public void setAco_nombre(String aco_nombre) {
		this.aco_nombre = aco_nombre;
	}
	public int getAco_tipo_actividad_id() {
		return aco_tipo_actividad_id;
	}

	public void setAco_tipo_actividad_id(int aco_tipo_actividad_id) {
		this.aco_tipo_actividad_id = aco_tipo_actividad_id;
	}
	public int getAco_evaluacion_id() {
		return aco_evaluacion_id;
	}

	public void setAco_evaluacion_id(int aco_evaluacion_id) {
		this.aco_evaluacion_id = aco_evaluacion_id;
	}

    
	@Override
	public String toString() {
		return "Actividad_ocupacion [aco_id=" + aco_id + ", aco_nombre=" + aco_nombre + ", aco_tipo_actividad_id=" + aco_tipo_actividad_id + ", aco_evaluacion_id=" + aco_evaluacion_id + "]";
	}
	
}
