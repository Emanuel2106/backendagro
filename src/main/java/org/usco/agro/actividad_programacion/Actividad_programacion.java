package org.usco.agro.actividad_programacion;

import java.sql.Timestamp;
import java.sql.Date;


public class Actividad_programacion {
    private long acp_id;
	private String acp_nombre;
	private Timestamp acp_fecha_inicio;
	private Timestamp acp_fecha_fin;
	private int acp_tipo_produccion_proceso_id;
	private String acp_descripcion;
	private int acp_estado;

	
	public Actividad_programacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Actividad_programacion(long acp_id, String acp_nombre, Timestamp acp_fecha_inicio, Timestamp acp_fecha_fin, int acp_tipo_produccion_proceso_id, String acp_descripcion, int acp_estado) {
		super();
		this.acp_id = acp_id;
		this.acp_nombre = acp_nombre;
		this.acp_fecha_inicio = acp_fecha_inicio;
		this.acp_fecha_fin = acp_fecha_fin;
		this.acp_tipo_produccion_proceso_id = acp_tipo_produccion_proceso_id;
		this.acp_descripcion = acp_descripcion;
		this.acp_estado = acp_estado;

	}

	public Actividad_programacion(String acp_nombre, Timestamp acp_fecha_inicio, Timestamp acp_fecha_fin, int acp_tipo_produccion_proceso_id, String acp_descripcion, int acp_estado) {
		super();
		this.acp_nombre = acp_nombre;
		this.acp_fecha_inicio = acp_fecha_inicio;
		this.acp_fecha_fin = acp_fecha_fin;
		this.acp_tipo_produccion_proceso_id = acp_tipo_produccion_proceso_id;
		this.acp_descripcion = acp_descripcion;
		this.acp_estado = acp_estado;

	}
    
    public long getAcp_id() {
		return acp_id;
	}

	public void setAcp_id(long acp_id) {
		this.acp_id = acp_id;
	}
	public String getAcp_nombre() {
		return acp_nombre;
	}

	public void setAcp_nombre(String acp_nombre) {
		this.acp_nombre = acp_nombre;
	}
	public Timestamp getAcp_fecha_inicio() {
		return acp_fecha_inicio;
	}

	public void setAcp_fecha_inicio(Timestamp acp_fecha_inicio) {
		this.acp_fecha_inicio = acp_fecha_inicio;
	}
	public Timestamp getAcp_fecha_fin() {
		return acp_fecha_fin;
	}

	public void setAcp_fecha_fin(Timestamp acp_fecha_fin) {
		this.acp_fecha_fin = acp_fecha_fin;
	}
	public int getAcp_tipo_produccion_proceso_id() {
		return acp_tipo_produccion_proceso_id;
	}

	public void setAcp_tipo_produccion_proceso_id(int acp_tipo_produccion_proceso_id) {
		this.acp_tipo_produccion_proceso_id = acp_tipo_produccion_proceso_id;
	}
	public String getAcp_descripcion() {
		return acp_descripcion;
	}

	public void setAcp_descripcion(String acp_descripcion) {
		this.acp_descripcion = acp_descripcion;
	}
	public int getAcp_estado() {
		return acp_estado;
	}

	public void setAcp_estado(int acp_estado) {
		this.acp_estado = acp_estado;
	}

    
	@Override
	public String toString() {
		return "Actividad_programacion [acp_id=" + acp_id + ", acp_nombre=" + acp_nombre + ", acp_fecha_inicio=" + acp_fecha_inicio + ", acp_fecha_fin=" + acp_fecha_fin + ", acp_tipo_produccion_proceso_id=" + acp_tipo_produccion_proceso_id + ", acp_descripcion=" + acp_descripcion + ", acp_estado=" + acp_estado + "]";
	}
	
}
