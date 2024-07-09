package org.usco.agro.espacio_ocupacion;

import java.sql.Timestamp;
import java.sql.Date;


public class Espacio_ocupacion {
    private long eso_id;
	private int eso_espacio_id;
	private int eso_actividad_ocupacion_id;
	private Timestamp eso_fecha_inicio;
	private Timestamp eso_fecha_fin;
	private int eso_estado;

	
	public Espacio_ocupacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Espacio_ocupacion(long eso_id, int eso_espacio_id, int eso_actividad_ocupacion_id, Timestamp eso_fecha_inicio, Timestamp eso_fecha_fin, int eso_estado) {
		super();
		this.eso_id = eso_id;
		this.eso_espacio_id = eso_espacio_id;
		this.eso_actividad_ocupacion_id = eso_actividad_ocupacion_id;
		this.eso_fecha_inicio = eso_fecha_inicio;
		this.eso_fecha_fin = eso_fecha_fin;
		this.eso_estado = eso_estado;

	}

	public Espacio_ocupacion(int eso_espacio_id, int eso_actividad_ocupacion_id, Timestamp eso_fecha_inicio, Timestamp eso_fecha_fin, int eso_estado) {
		super();
		this.eso_espacio_id = eso_espacio_id;
		this.eso_actividad_ocupacion_id = eso_actividad_ocupacion_id;
		this.eso_fecha_inicio = eso_fecha_inicio;
		this.eso_fecha_fin = eso_fecha_fin;
		this.eso_estado = eso_estado;

	}
    
    public long getEso_id() {
		return eso_id;
	}

	public void setEso_id(long eso_id) {
		this.eso_id = eso_id;
	}
	public int getEso_espacio_id() {
		return eso_espacio_id;
	}

	public void setEso_espacio_id(int eso_espacio_id) {
		this.eso_espacio_id = eso_espacio_id;
	}
	public int getEso_actividad_ocupacion_id() {
		return eso_actividad_ocupacion_id;
	}

	public void setEso_actividad_ocupacion_id(int eso_actividad_ocupacion_id) {
		this.eso_actividad_ocupacion_id = eso_actividad_ocupacion_id;
	}
	public Timestamp getEso_fecha_inicio() {
		return eso_fecha_inicio;
	}

	public void setEso_fecha_inicio(Timestamp eso_fecha_inicio) {
		this.eso_fecha_inicio = eso_fecha_inicio;
	}
	public Timestamp getEso_fecha_fin() {
		return eso_fecha_fin;
	}

	public void setEso_fecha_fin(Timestamp eso_fecha_fin) {
		this.eso_fecha_fin = eso_fecha_fin;
	}
	public int getEso_estado() {
		return eso_estado;
	}

	public void setEso_estado(int eso_estado) {
		this.eso_estado = eso_estado;
	}

    
	@Override
	public String toString() {
		return "Espacio_ocupacion [eso_id=" + eso_id + ", eso_espacio_id=" + eso_espacio_id + ", eso_actividad_ocupacion_id=" + eso_actividad_ocupacion_id + ", eso_fecha_inicio=" + eso_fecha_inicio + ", eso_fecha_fin=" + eso_fecha_fin + ", eso_estado=" + eso_estado + "]";
	}
	
}
