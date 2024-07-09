package org.usco.agro.producto_presentacion;

import java.sql.Timestamp;
import java.sql.Date;


public class Producto_presentacion {
    private long prp_id;
	private int prp_producto_id;
	private String prp_nombre;
	private int prp_unidad_id;
	private String prp_descripcion;
	private int prp_estado;
	private double prp_cantidad;
	private int prp_marca_id;
	private int prp_presentacion_id;
	
	public Producto_presentacion() {
		super();
	}

	public Producto_presentacion(long prp_id, int prp_producto_id, String prp_nombre, int prp_unidad_id,
			String prp_descripcion, int prp_estado, double prp_cantidad, int prp_marca_id, int prp_presentacion_id) {
		super();
		this.prp_id = prp_id;
		this.prp_producto_id = prp_producto_id;
		this.prp_nombre = prp_nombre;
		this.prp_unidad_id = prp_unidad_id;
		this.prp_descripcion = prp_descripcion;
		this.prp_estado = prp_estado;
		this.prp_cantidad = prp_cantidad;
		this.prp_marca_id = prp_marca_id;
		this.prp_presentacion_id = prp_presentacion_id;
	}

	public Producto_presentacion(int prp_producto_id, String prp_nombre, int prp_unidad_id, String prp_descripcion,
			int prp_estado, double prp_cantidad, int prp_marca_id, int prp_presentacion_id) {
		super();
		this.prp_producto_id = prp_producto_id;
		this.prp_nombre = prp_nombre;
		this.prp_unidad_id = prp_unidad_id;
		this.prp_descripcion = prp_descripcion;
		this.prp_estado = prp_estado;
		this.prp_cantidad = prp_cantidad;
		this.prp_marca_id = prp_marca_id;
		this.prp_presentacion_id = prp_presentacion_id;
	}

	/**
	 * @return the prp_id
	 */
	public long getPrp_id() {
		return prp_id;
	}

	/**
	 * @param prp_id the prp_id to set
	 */
	public void setPrp_id(long prp_id) {
		this.prp_id = prp_id;
	}

	/**
	 * @return the prp_producto_id
	 */
	public int getPrp_producto_id() {
		return prp_producto_id;
	}

	/**
	 * @param prp_producto_id the prp_producto_id to set
	 */
	public void setPrp_producto_id(int prp_producto_id) {
		this.prp_producto_id = prp_producto_id;
	}

	/**
	 * @return the prp_nombre
	 */
	public String getPrp_nombre() {
		return prp_nombre;
	}

	/**
	 * @param prp_nombre the prp_nombre to set
	 */
	public void setPrp_nombre(String prp_nombre) {
		this.prp_nombre = prp_nombre;
	}

	/**
	 * @return the prp_unidad
	 */
	public int getPrp_unidad_id() {
		return prp_unidad_id;
	}

	/**
	 * @param prp_unidad the prp_unidad to set
	 */
	public void setPrp_unidad_id(int prp_unidad) {
		this.prp_unidad_id = prp_unidad;
	}

	/**
	 * @return the prp_descripcion
	 */
	public String getPrp_descripcion() {
		return prp_descripcion;
	}

	/**
	 * @param prp_descripcion the prp_descripcion to set
	 */
	public void setPrp_descripcion(String prp_descripcion) {
		this.prp_descripcion = prp_descripcion;
	}

	/**
	 * @return the prp_estado
	 */
	public int getPrp_estado() {
		return prp_estado;
	}

	/**
	 * @param prp_estado the prp_estado to set
	 */
	public void setPrp_estado(int prp_estado) {
		this.prp_estado = prp_estado;
	}

	/**
	 * @return the prp_cantidad
	 */
	public double getPrp_cantidad() {
		return prp_cantidad;
	}

	/**
	 * @param prp_cantidad the prp_cantidad to set
	 */
	public void setPrp_cantidad(double prp_cantidad) {
		this.prp_cantidad = prp_cantidad;
	}

	/**
	 * @return the prp_marca_id
	 */
	public int getPrp_marca_id() {
		return prp_marca_id;
	}

	/**
	 * @param prp_marca_id the prp_marca_id to set
	 */
	public void setPrp_marca_id(int prp_marca_id) {
		this.prp_marca_id = prp_marca_id;
	}

	/**
	 * @return the prp_presentacion_id
	 */
	public int getPrp_presentacion_id() {
		return prp_presentacion_id;
	}

	/**
	 * @param prp_presentacion_id the prp_presentacion_id to set
	 */
	public void setPrp_presentacion_id(int prp_presentacion_id) {
		this.prp_presentacion_id = prp_presentacion_id;
	}

	@Override
	public String toString() {
		return "Producto_presentacion [prp_id=" + prp_id + ", prp_producto_id=" + prp_producto_id + ", prp_nombre="
				+ prp_nombre + ", prp_unidad_id=" + prp_unidad_id + ", prp_descripcion=" + prp_descripcion + ", prp_estado="
				+ prp_estado + ", prp_cantidad=" + prp_cantidad + ", prp_marca_id=" + prp_marca_id
				+ ", prp_presentacion_id=" + prp_presentacion_id + "]";
	}
	
	
	
	
	
	
}
