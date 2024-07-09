package org.usco.agro.espacio_actividad;

import java.sql.Timestamp;
import java.sql.Date;


public class Espacio_actividad {
    private long esa_id;
	private int esa_produccion_id;
	private int esa_tipo_actividad_id;
	private Timestamp esa_fecha_hora;
	private int esa_cantidad;
	private int esa_unidad;
	private double esa_precio;
	private int esa_evaluacion_id;
	private String esa_descripcion;
	private int esa_estado;

	
	public Espacio_actividad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Espacio_actividad(long esa_id, int esa_produccion_id, int esa_tipo_actividad_id, Timestamp esa_fecha_hora, int esa_cantidad, int esa_unidad, double esa_precio, int esa_evaluacion_id, String esa_descripcion, int esa_estado) {
		super();
		this.esa_id = esa_id;
		this.esa_produccion_id = esa_produccion_id;
		this.esa_tipo_actividad_id = esa_tipo_actividad_id;
		this.esa_fecha_hora = esa_fecha_hora;
		this.esa_cantidad = esa_cantidad;
		this.esa_unidad = esa_unidad;
		this.esa_precio = esa_precio;
		this.esa_evaluacion_id = esa_evaluacion_id;
		this.esa_descripcion = esa_descripcion;
		this.esa_estado = esa_estado;

	}

	public Espacio_actividad(int esa_produccion_id, int esa_tipo_actividad_id, Timestamp esa_fecha_hora, int esa_cantidad, int esa_unidad, double esa_precio, int esa_evaluacion_id, String esa_descripcion, int esa_estado) {
		super();
		this.esa_produccion_id = esa_produccion_id;
		this.esa_tipo_actividad_id = esa_tipo_actividad_id;
		this.esa_fecha_hora = esa_fecha_hora;
		this.esa_cantidad = esa_cantidad;
		this.esa_unidad = esa_unidad;
		this.esa_precio = esa_precio;
		this.esa_evaluacion_id = esa_evaluacion_id;
		this.esa_descripcion = esa_descripcion;
		this.esa_estado = esa_estado;

	}
    
    public long getEsa_id() {
		return esa_id;
	}

	public void setEsa_id(long esa_id) {
		this.esa_id = esa_id;
	}
	public int getEsa_produccion_id() {
		return esa_produccion_id;
	}

	public void setEsa_produccion_id(int esa_produccion_id) {
		this.esa_produccion_id = esa_produccion_id;
	}
	public int getEsa_tipo_actividad_id() {
		return esa_tipo_actividad_id;
	}

	public void setEsa_tipo_actividad_id(int esa_tipo_actividad_id) {
		this.esa_tipo_actividad_id = esa_tipo_actividad_id;
	}
	public Timestamp getEsa_fecha_hora() {
		return esa_fecha_hora;
	}

	public void setEsa_fecha_hora(Timestamp esa_fecha_hora) {
		this.esa_fecha_hora = esa_fecha_hora;
	}
	public int getEsa_cantidad() {
		return esa_cantidad;
	}

	public void setEsa_cantidad(int esa_cantidad) {
		this.esa_cantidad = esa_cantidad;
	}
	public int getEsa_unidad() {
		return esa_unidad;
	}

	public void setEsa_unidad(int esa_unidad) {
		this.esa_unidad = esa_unidad;
	}
	public double getEsa_precio() {
		return esa_precio;
	}

	public void setEsa_precio(double esa_precio) {
		this.esa_precio = esa_precio;
	}
	public int getEsa_evaluacion_id() {
		return esa_evaluacion_id;
	}

	public void setEsa_evaluacion_id(int esa_evaluacion_id) {
		this.esa_evaluacion_id = esa_evaluacion_id;
	}
	public String getEsa_descripcion() {
		return esa_descripcion;
	}

	public void setEsa_descripcion(String esa_descripcion) {
		this.esa_descripcion = esa_descripcion;
	}
	public int getEsa_estado() {
		return esa_estado;
	}

	public void setEsa_estado(int esa_estado) {
		this.esa_estado = esa_estado;
	}

    
	@Override
	public String toString() {
		return "Espacio_actividad [esa_id=" + esa_id + ", esa_produccion_id=" + esa_produccion_id + ", esa_tipo_actividad_id=" + esa_tipo_actividad_id + ", esa_fecha_hora=" + esa_fecha_hora + ", esa_cantidad=" + esa_cantidad + ", esa_unidad=" + esa_unidad + ", esa_precio=" + esa_precio + ", esa_evaluacion_id=" + esa_evaluacion_id + ", esa_descripcion=" + esa_descripcion + ", esa_estado=" + esa_estado + "]";
	}
	
}
