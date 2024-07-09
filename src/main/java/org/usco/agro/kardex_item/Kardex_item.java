package org.usco.agro.kardex_item;

import java.sql.Timestamp;
import java.sql.Date;


public class Kardex_item {
    private long kai_id;
	private int kai_kardex_id;
	private int kai_producto_presentacion_id;
	private double kai_cantidad;
	private double kai_precio;
	private int kai_estado;
	
	
	public Kardex_item() {
		super();
	}


	public Kardex_item(long kai_id, int kai_kardex_id, int kai_producto_presentacion_id, double kai_cantidad,
			double kai_precio, int kai_estado) {
		super();
		this.kai_id = kai_id;
		this.kai_kardex_id = kai_kardex_id;
		this.kai_producto_presentacion_id = kai_producto_presentacion_id;
		this.kai_cantidad = kai_cantidad;
		this.kai_precio = kai_precio;
		this.kai_estado = kai_estado;
	}


	public Kardex_item(int kai_kardex_id, int kai_producto_presentacion_id, double kai_cantidad, double kai_precio,
			int kai_estado) {
		super();
		this.kai_kardex_id = kai_kardex_id;
		this.kai_producto_presentacion_id = kai_producto_presentacion_id;
		this.kai_cantidad = kai_cantidad;
		this.kai_precio = kai_precio;
		this.kai_estado = kai_estado;
	}


	/**
	 * @return the kai_id
	 */
	public long getKai_id() {
		return kai_id;
	}


	/**
	 * @param kai_id the kai_id to set
	 */
	public void setKai_id(long kai_id) {
		this.kai_id = kai_id;
	}


	/**
	 * @return the kai_kardex_id
	 */
	public int getKai_kardex_id() {
		return kai_kardex_id;
	}


	/**
	 * @param kai_kardex_id the kai_kardex_id to set
	 */
	public void setKai_kardex_id(int kai_kardex_id) {
		this.kai_kardex_id = kai_kardex_id;
	}


	/**
	 * @return the kai_producto_presentacion_id
	 */
	public int getKai_producto_presentacion_id() {
		return kai_producto_presentacion_id;
	}


	/**
	 * @param kai_producto_presentacion_id the kai_producto_presentacion_id to set
	 */
	public void setKai_producto_presentacion_id(int kai_producto_presentacion_id) {
		this.kai_producto_presentacion_id = kai_producto_presentacion_id;
	}


	/**
	 * @return the kai_cantidad
	 */
	public double getKai_cantidad() {
		return kai_cantidad;
	}


	/**
	 * @param kai_cantidad the kai_cantidad to set
	 */
	public void setKai_cantidad(double kai_cantidad) {
		this.kai_cantidad = kai_cantidad;
	}


	/**
	 * @return the kai_precio
	 */
	public double getKai_precio() {
		return kai_precio;
	}


	/**
	 * @param kai_precio the kai_precio to set
	 */
	public void setKai_precio(double kai_precio) {
		this.kai_precio = kai_precio;
	}


	/**
	 * @return the kai_estado
	 */
	public int getKai_estado() {
		return kai_estado;
	}


	/**
	 * @param kai_estado the kai_estado to set
	 */
	public void setKai_estado(int kai_estado) {
		this.kai_estado = kai_estado;
	}
	
	
	


	@Override
	public String toString() {
		return "Kardex_item [kai_id=" + kai_id + ", kai_kardex_id=" + kai_kardex_id + ", kai_producto_presentacion_id="
				+ kai_producto_presentacion_id + ", kai_cantidad=" + kai_cantidad + ", kai_precio=" + kai_precio
				+ ", kai_estado=" + kai_estado + "]";
	}
	
	
	
	
	

	

	
	
	
}
