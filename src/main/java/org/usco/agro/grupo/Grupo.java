package org.usco.agro.grupo;

import java.sql.Timestamp;
import java.sql.Date;


public class Grupo {
    private long gru_id;
	private String gru_nombre;
	private int gru_empresa_id;
	private String gru_descripcion;
	private int gru_estado;

	
	public Grupo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Grupo(long gru_id, String gru_nombre, int gru_empresa_id, String gru_descripcion, int gru_estado) {
		super();
		this.gru_id = gru_id;
		this.gru_nombre = gru_nombre;
		this.gru_empresa_id = gru_empresa_id;
		this.gru_descripcion = gru_descripcion;
		this.gru_estado = gru_estado;

	}

	public Grupo(String gru_nombre, int gru_empresa_id, String gru_descripcion, int gru_estado) {
		super();
		this.gru_nombre = gru_nombre;
		this.gru_empresa_id = gru_empresa_id;
		this.gru_descripcion = gru_descripcion;
		this.gru_estado = gru_estado;

	}
    
    public long getGru_id() {
		return gru_id;
	}

	public void setGru_id(long gru_id) {
		this.gru_id = gru_id;
	}
	public String getGru_nombre() {
		return gru_nombre;
	}

	public void setGru_nombre(String gru_nombre) {
		this.gru_nombre = gru_nombre;
	}
	public int getGru_empresa_id() {
		return gru_empresa_id;
	}

	public void setGru_empresa_id(int gru_empresa_id) {
		this.gru_empresa_id = gru_empresa_id;
	}
	public String getGru_descripcion() {
		return gru_descripcion;
	}

	public void setGru_descripcion(String gru_descripcion) {
		this.gru_descripcion = gru_descripcion;
	}
	public int getGru_estado() {
		return gru_estado;
	}

	public void setGru_estado(int gru_estado) {
		this.gru_estado = gru_estado;
	}

    
	@Override
	public String toString() {
		return "Grupo [gru_id=" + gru_id + ", gru_nombre=" + gru_nombre + ", gru_empresa_id=" + gru_empresa_id + ", gru_descripcion=" + gru_descripcion + ", gru_estado=" + gru_estado + "]";
	}
	
}
