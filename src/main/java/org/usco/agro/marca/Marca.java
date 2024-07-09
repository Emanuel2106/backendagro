package org.usco.agro.marca;

import java.sql.Timestamp;
import java.sql.Date;


public class Marca {
    private long mar_id;
	private String mar_nombre;
	private String mar_descripcion;
	private int mar_estado;
	
	public Marca() {
		super();
	}

	public Marca(long mar_id, String mar_nombre, String mar_descripcion, int mar_estado) {
		super();
		this.mar_id = mar_id;
		this.mar_nombre = mar_nombre;
		this.mar_descripcion = mar_descripcion;
		this.mar_estado = mar_estado;
	}

	public Marca(String mar_nombre, String mar_descripcion, int mar_estado) {
		super();
		this.mar_nombre = mar_nombre;
		this.mar_descripcion = mar_descripcion;
		this.mar_estado = mar_estado;
	}

	/**
	 * @return the mar_id
	 */
	public long getMar_id() {
		return mar_id;
	}

	/**
	 * @param mar_id the mar_id to set
	 */
	public void setMar_id(long mar_id) {
		this.mar_id = mar_id;
	}

	/**
	 * @return the mar_nombre
	 */
	public String getMar_nombre() {
		return mar_nombre;
	}

	/**
	 * @param mar_nombre the mar_nombre to set
	 */
	public void setMar_nombre(String mar_nombre) {
		this.mar_nombre = mar_nombre;
	}

	/**
	 * @return the mar_descripcion
	 */
	public String getMar_descripcion() {
		return mar_descripcion;
	}

	/**
	 * @param mar_descripcion the mar_descripcion to set
	 */
	public void setMar_descripcion(String mar_descripcion) {
		this.mar_descripcion = mar_descripcion;
	}

	/**
	 * @return the mar_estado
	 */
	public int getMar_estado() {
		return mar_estado;
	}

	/**
	 * @param mar_estado the mar_estado to set
	 */
	public void setMar_estado(int mar_estado) {
		this.mar_estado = mar_estado;
	}

	@Override
	public String toString() {
		return "Marca [mar_id=" + mar_id + ", mar_nombre=" + mar_nombre + ", mar_descripcion=" + mar_descripcion
				+ ", mar_estado=" + mar_estado + "]";
	}
	
	


	
}
