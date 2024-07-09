package org.usco.agro.proveedor_evaluacion;

import java.sql.Timestamp;
import java.sql.Date;


public class Proveedor_evaluacion {
    private long pre_id;
	private Timestamp pre_fecha_hora;
	private int pre_proveedor_id;
	private int pre_evaluacion_id;
	private String pre_descripcion;
	private int pre_estado;

	
	public Proveedor_evaluacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Proveedor_evaluacion(long pre_id, Timestamp pre_fecha_hora, int pre_proveedor_id, int pre_evaluacion_id, String pre_descripcion, int pre_estado) {
		super();
		this.pre_id = pre_id;
		this.pre_fecha_hora = pre_fecha_hora;
		this.pre_proveedor_id = pre_proveedor_id;
		this.pre_evaluacion_id = pre_evaluacion_id;
		this.pre_descripcion = pre_descripcion;
		this.pre_estado = pre_estado;

	}

	public Proveedor_evaluacion(Timestamp pre_fecha_hora, int pre_proveedor_id, int pre_evaluacion_id, String pre_descripcion, int pre_estado) {
		super();
		this.pre_fecha_hora = pre_fecha_hora;
		this.pre_proveedor_id = pre_proveedor_id;
		this.pre_evaluacion_id = pre_evaluacion_id;
		this.pre_descripcion = pre_descripcion;
		this.pre_estado = pre_estado;

	}
    
    public long getPre_id() {
		return pre_id;
	}

	public void setPre_id(long pre_id) {
		this.pre_id = pre_id;
	}
	public Timestamp getPre_fecha_hora() {
		return pre_fecha_hora;
	}

	public void setPre_fecha(Timestamp pre_fecha_hora) {
		this.pre_fecha_hora = pre_fecha_hora;
	}
	public int getPre_proveedor_id() {
		return pre_proveedor_id;
	}

	public void setPre_proveedor_id(int pre_proveedor_id) {
		this.pre_proveedor_id = pre_proveedor_id;
	}
	public int getPre_evaluacion_id() {
		return pre_evaluacion_id;
	}

	public void setPre_evaluacion_id(int pre_evaluacion_id) {
		this.pre_evaluacion_id = pre_evaluacion_id;
	}
	public String getPre_descripcion() {
		return pre_descripcion;
	}

	public void setPre_descripcion(String pre_descripcion) {
		this.pre_descripcion = pre_descripcion;
	}
	public int getPre_estado() {
		return pre_estado;
	}

	public void setPre_estado(int pre_estado) {
		this.pre_estado = pre_estado;
	}

    
	@Override
	public String toString() {
		return "Proveedor_evaluacion [pre_id=" + pre_id + ", pre_fecha_hora=" + pre_fecha_hora + ", pre_proveedor_id=" + pre_proveedor_id + ", pre_evaluacion_id=" + pre_evaluacion_id + ", pre_descripcion=" + pre_descripcion + ", pre_estado=" + pre_estado + "]";
	}
	
}
