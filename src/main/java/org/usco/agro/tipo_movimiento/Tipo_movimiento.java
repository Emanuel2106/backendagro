package org.usco.agro.tipo_movimiento;

import java.sql.Timestamp;
import java.sql.Date;


public class Tipo_movimiento {
    private long tim_id;
	private String tim_nombre;
	private String tim_descripcion;
	private int tim_estado;

	
	public Tipo_movimiento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tipo_movimiento(long tim_id, String tim_nombre, String tim_descripcion, int tim_estado) {
		super();
		this.tim_id = tim_id;
		this.tim_nombre = tim_nombre;
		this.tim_descripcion = tim_descripcion;
		this.tim_estado = tim_estado;

	}

	public Tipo_movimiento(String tim_nombre, String tim_descripcion, int tim_estado) {
		super();
		this.tim_nombre = tim_nombre;
		this.tim_descripcion = tim_descripcion;
		this.tim_estado = tim_estado;

	}
    
    public long getTim_id() {
		return tim_id;
	}

	public void setTim_id(long tim_id) {
		this.tim_id = tim_id;
	}
	public String getTim_nombre() {
		return tim_nombre;
	}

	public void setTim_nombre(String tim_nombre) {
		this.tim_nombre = tim_nombre;
	}
	public String getTim_descripcion() {
		return tim_descripcion;
	}

	public void setTim_descripcion(String tim_descripcion) {
		this.tim_descripcion = tim_descripcion;
	}
	public int getTim_estado() {
		return tim_estado;
	}

	public void setTim_estado(int tim_estado) {
		this.tim_estado = tim_estado;
	}

    
	@Override
	public String toString() {
		return "Tipo_movimiento [tim_id=" + tim_id + ", tim_nombre=" + tim_nombre + ", tim_descripcion=" + tim_descripcion + ", tim_estado=" + tim_estado + "]";
	}
	
}
