package org.usco.agro.kardex;

import java.sql.Timestamp;
import java.sql.Date;


public class Kardex {
    private long kar_id;
	private Timestamp kar_fecha_hora;
	private int kar_almacen_id;
	private int kar_produccion_id;
	private int kar_tipo_movimiento_id;
	private String kar_descripcion;
	private int kar_estado;

	
	public Kardex() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Kardex(long kar_id, Timestamp kar_fecha_hora, int kar_almacen_id, int kar_produccion_id, int kar_tipo_movimiento_id, String kar_descripcion, int kar_estado) {
		super();
		this.kar_id = kar_id;
		this.kar_fecha_hora = kar_fecha_hora;
		this.kar_almacen_id = kar_almacen_id;
		this.kar_produccion_id = kar_produccion_id;
		this.kar_tipo_movimiento_id = kar_tipo_movimiento_id;
		this.kar_descripcion = kar_descripcion;
		this.kar_estado = kar_estado;

	}

	public Kardex(Timestamp kar_fecha_hora,  int kar_almacen_id, int kar_produccion_id, int kar_tipo_movimiento_id, String kar_descripcion, int kar_estado) {
		super();
		this.kar_fecha_hora = kar_fecha_hora;
		this.kar_almacen_id = kar_almacen_id;
		this.kar_produccion_id = kar_produccion_id;
		this.kar_tipo_movimiento_id = kar_tipo_movimiento_id;
		this.kar_descripcion = kar_descripcion;
		this.kar_estado = kar_estado;

	}
    
    public long getKar_id() {
		return kar_id;
	}

	public void setKar_id(long kar_id) {
		this.kar_id = kar_id;
	}
	public Timestamp getKar_fecha_hora() {
		return kar_fecha_hora;
	}

	public void setKar_fecha_hora(Timestamp kar_fecha_hora) {
		this.kar_fecha_hora = kar_fecha_hora;
	}

	public int getKar_almacen_id() {
		return kar_almacen_id;
	}

	public void setKar_almacen_id(int kar_almacen_id) {
		this.kar_almacen_id = kar_almacen_id;
	}
	public int getKar_produccion_id() {
		return kar_produccion_id;
	}

	public void setKar_produccion_id(int kar_produccion_id) {
		this.kar_produccion_id = kar_produccion_id;
	}
	public int getKar_tipo_movimiento_id() {
		return kar_tipo_movimiento_id;
	}

	public void setKar_tipo_movimiento_id(int kar_tipo_movimiento_id) {
		this.kar_tipo_movimiento_id = kar_tipo_movimiento_id;
	}
	public String getKar_descripcion() {
		return kar_descripcion;
	}

	public void setKar_descripcion(String kar_descripcion) {
		this.kar_descripcion = kar_descripcion;
	}
	public int getKar_estado() {
		return kar_estado;
	}

	public void setKar_estado(int kar_estado) {
		this.kar_estado = kar_estado;
	}

    
	@Override
	public String toString() {
		return "Kardex [kar_id=" + kar_id + ", kar_fecha_hora=" + kar_fecha_hora + ", kar_almacen_id=" + kar_almacen_id + ", kar_produccion_id=" + kar_produccion_id + ", kar_tipo_movimiento_id=" + kar_tipo_movimiento_id + ", kar_descripcion=" + kar_descripcion + ", kar_estado=" + kar_estado + "]";
	}
	
}
