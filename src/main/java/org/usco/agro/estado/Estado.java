package org.usco.agro.estado;

import java.sql.Timestamp;
import java.sql.Date;


public class Estado {
    private long est_id;
	private String est_nombre;
	private String est_descripcion;

	
	public Estado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estado(long est_id, String est_nombre, String est_descripcion) {
		super();
		this.est_id = est_id;
		this.est_nombre = est_nombre;
		this.est_descripcion = est_descripcion;

	}

	public Estado(String est_nombre, String est_descripcion) {
		super();
		this.est_nombre = est_nombre;
		this.est_descripcion = est_descripcion;

	}
    
    public long getEst_id() {
		return est_id;
	}

	public void setEst_id(long est_id) {
		this.est_id = est_id;
	}
	public String getEst_nombre() {
		return est_nombre;
	}

	public void setEst_nombre(String est_nombre) {
		this.est_nombre = est_nombre;
	}
	public String getEst_descripcion() {
		return est_descripcion;
	}

	public void setEst_descripcion(String est_descripcion) {
		this.est_descripcion = est_descripcion;
	}

    
	@Override
	public String toString() {
		return "Estado [est_id=" + est_id + ", est_nombre=" + est_nombre + ", est_descripcion=" + est_descripcion + "]";
	}
	
}
