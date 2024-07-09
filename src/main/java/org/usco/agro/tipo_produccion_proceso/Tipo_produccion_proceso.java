package org.usco.agro.tipo_produccion_proceso;

import java.sql.Timestamp;
import java.sql.Date;


public class Tipo_produccion_proceso {
    private long tpp_id;
	private int tpp_tipo_produccion_id;
	private int tpp_proceso_id;
	private String tpp_descripcion;
	private int tpp_estado;

	
	public Tipo_produccion_proceso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tipo_produccion_proceso(long tpp_id, int tpp_tipo_produccion_id, int tpp_proceso_id, String tpp_descripcion, int tpp_estado) {
		super();
		this.tpp_id = tpp_id;
		this.tpp_tipo_produccion_id = tpp_tipo_produccion_id;
		this.tpp_proceso_id = tpp_proceso_id;
		this.tpp_descripcion = tpp_descripcion;
		this.tpp_estado = tpp_estado;

	}

	public Tipo_produccion_proceso(int tpp_tipo_produccion_id, int tpp_proceso_id, String tpp_descripcion, int tpp_estado) {
		super();
		this.tpp_tipo_produccion_id = tpp_tipo_produccion_id;
		this.tpp_proceso_id = tpp_proceso_id;
		this.tpp_descripcion = tpp_descripcion;
		this.tpp_estado = tpp_estado;

	}
    
    public long getTpp_id() {
		return tpp_id;
	}

	public void setTpp_id(long tpp_id) {
		this.tpp_id = tpp_id;
	}
	public int getTpp_tipo_produccion_id() {
		return tpp_tipo_produccion_id;
	}

	public void setTpp_tipo_produccion_id(int tpp_tipo_produccion_id) {
		this.tpp_tipo_produccion_id = tpp_tipo_produccion_id;
	}
	public int getTpp_proceso_id() {
		return tpp_proceso_id;
	}

	public void setTpp_proceso_id(int tpp_proceso_id) {
		this.tpp_proceso_id = tpp_proceso_id;
	}
	public String getTpp_descripcion() {
		return tpp_descripcion;
	}

	public void setTpp_descripcion(String tpp_descripcion) {
		this.tpp_descripcion = tpp_descripcion;
	}
	public int getTpp_estado() {
		return tpp_estado;
	}

	public void setTpp_estado(int tpp_estado) {
		this.tpp_estado = tpp_estado;
	}

    
	@Override
	public String toString() {
		return "Tipo_produccion_proceso [tpp_id=" + tpp_id + ", tpp_tipo_produccion_id=" + tpp_tipo_produccion_id + ", tpp_proceso_id=" + tpp_proceso_id + ", tpp_descripcion=" + tpp_descripcion + ", tpp_estado=" + tpp_estado + "]";
	}
	
}
