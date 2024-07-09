package org.usco.agro.producto;

import java.sql.Timestamp;
import java.sql.Date;


public class Producto {
    private long pro_id;
	private String pro_nombre;
	private int pro_producto_categoria_id;
	private String pro_descripcion;
	private int pro_estado;

	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Producto(long pro_id, String pro_nombre, int pro_producto_categoria_id, String pro_descripcion, int pro_estado) {
		super();
		this.pro_id = pro_id;
		this.pro_nombre = pro_nombre;
		this.pro_producto_categoria_id = pro_producto_categoria_id;
		this.pro_descripcion = pro_descripcion;
		this.pro_estado = pro_estado;

	}

	public Producto(String pro_nombre, int pro_producto_categoria_id, String pro_descripcion, int pro_estado) {
		super();
		this.pro_nombre = pro_nombre;
		this.pro_producto_categoria_id = pro_producto_categoria_id;
		this.pro_descripcion = pro_descripcion;
		this.pro_estado = pro_estado;

	}
    
    public long getPro_id() {
		return pro_id;
	}

	public void setPro_id(long pro_id) {
		this.pro_id = pro_id;
	}
	public String getPro_nombre() {
		return pro_nombre;
	}

	public void setPro_nombre(String pro_nombre) {
		this.pro_nombre = pro_nombre;
	}
	public int getPro_producto_categoria_id() {
		return pro_producto_categoria_id;
	}

	public void setPro_producto_categoria_id(int pro_producto_categoria_id) {
		this.pro_producto_categoria_id = pro_producto_categoria_id;
	}
	public String getPro_descripcion() {
		return pro_descripcion;
	}

	public void setPro_descripcion(String pro_descripcion) {
		this.pro_descripcion = pro_descripcion;
	}
	public int getPro_estado() {
		return pro_estado;
	}

	public void setPro_estado(int pro_estado) {
		this.pro_estado = pro_estado;
	}

    
	@Override
	public String toString() {
		return "Producto [pro_id=" + pro_id + ", pro_nombre=" + pro_nombre + ", pro_producto_categoria_id=" + pro_producto_categoria_id + ", pro_descripcion=" + pro_descripcion + ", pro_estado=" + pro_estado + "]";
	}
	
}
