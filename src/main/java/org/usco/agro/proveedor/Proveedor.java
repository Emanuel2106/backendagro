package org.usco.agro.proveedor;

import java.sql.Timestamp;
import java.sql.Date;


public class Proveedor {
    private long pro_id;
	private int pro_empresa_id;
	private Timestamp pro_fecha_creacion;
	private int pro_estado;

	
	public Proveedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Proveedor(long pro_id, int pro_empresa_id, Timestamp pro_fecha_creacion, int pro_estado) {
		super();
		this.pro_id = pro_id;
		this.pro_empresa_id = pro_empresa_id;
		this.pro_fecha_creacion = pro_fecha_creacion;
		this.pro_estado = pro_estado;

	}

	public Proveedor(int pro_empresa_id, Timestamp pro_fecha_creacion, int pro_estado) {
		super();
		this.pro_empresa_id = pro_empresa_id;
		this.pro_fecha_creacion = pro_fecha_creacion;
		this.pro_estado = pro_estado;

	}
    
    public long getPro_id() {
		return pro_id;
	}

	public void setPro_id(long pro_id) {
		this.pro_id = pro_id;
	}
	public int getPro_empresa_id() {
		return pro_empresa_id;
	}

	public void setPro_empresa_id(int pro_empresa_id) {
		this.pro_empresa_id = pro_empresa_id;
	}
	public Timestamp getPro_fecha_creacion() {
		return pro_fecha_creacion;
	}

	public void setPro_fecha_creacion(Timestamp pro_fecha_creacion) {
		this.pro_fecha_creacion = pro_fecha_creacion;
	}
	public int getPro_estado() {
		return pro_estado;
	}

	public void setPro_estado(int pro_estado) {
		this.pro_estado = pro_estado;
	}

    
	@Override
	public String toString() {
		return "Proveedor [pro_id=" + pro_id + ", pro_empresa_id=" + pro_empresa_id + ", pro_fecha_creacion=" + pro_fecha_creacion + ", pro_estado=" + pro_estado + "]";
	}
	
}
