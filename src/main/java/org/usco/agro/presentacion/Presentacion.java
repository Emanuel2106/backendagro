package org.usco.agro.presentacion;

import java.sql.Timestamp;
import java.sql.Date;


public class Presentacion {
    private long pre_id;
	private String pre_nombre;
	private String pre_descripcion;
	private int pre_estado;
	
	public Presentacion() {
		super();
	}

	public Presentacion(long pre_id, String pre_nombre, String pre_descripcion, int pre_estado) {
		super();
		this.pre_id = pre_id;
		this.pre_nombre = pre_nombre;
		this.pre_descripcion = pre_descripcion;
		this.pre_estado = pre_estado;
	}

	public Presentacion(String pre_nombre, String pre_descripcion, int pre_estado) {
		super();
		this.pre_nombre = pre_nombre;
		this.pre_descripcion = pre_descripcion;
		this.pre_estado = pre_estado;
	}

	/**
	 * @return the pre_id
	 */
	public long getPre_id() {
		return pre_id;
	}

	/**
	 * @param pre_id the pre_id to set
	 */
	public void setPre_id(long pre_id) {
		this.pre_id = pre_id;
	}

	/**
	 * @return the pre_nombre
	 */
	public String getPre_nombre() {
		return pre_nombre;
	}

	/**
	 * @param pre_nombre the pre_nombre to set
	 */
	public void setPre_nombre(String pre_nombre) {
		this.pre_nombre = pre_nombre;
	}

	/**
	 * @return the pre_descripcion
	 */
	public String getPre_descripcion() {
		return pre_descripcion;
	}

	/**
	 * @param pre_descripcion the pre_descripcion to set
	 */
	public void setPre_descripcion(String pre_descripcion) {
		this.pre_descripcion = pre_descripcion;
	}

	/**
	 * @return the pre_estado
	 */
	public int getPre_estado() {
		return pre_estado;
	}

	/**
	 * @param pre_estado the pre_estado to set
	 */
	public void setPre_estado(int pre_estado) {
		this.pre_estado = pre_estado;
	}

	@Override
	public String toString() {
		return "Presentacion [pre_id=" + pre_id + ", pre_nombre=" + pre_nombre + ", pre_descripcion=" + pre_descripcion
				+ ", pre_estado=" + pre_estado + "]";
	}
	
	
	
	
	
	


	
}
