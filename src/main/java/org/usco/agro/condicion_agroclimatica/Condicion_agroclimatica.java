package org.usco.agro.condicion_agroclimatica;

import java.sql.Timestamp;
import java.sql.Date;


public class Condicion_agroclimatica {
    private long coa_id;
	private int coa_espacio_id;
	private Timestamp coa_fecha;
	private String coa_descripcion;
	private int coa_estado;

	
	public Condicion_agroclimatica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Condicion_agroclimatica(long coa_id, int coa_espacio_id, Timestamp coa_fecha, String coa_descripcion, int coa_estado) {
		super();
		this.coa_id = coa_id;
		this.coa_espacio_id = coa_espacio_id;
		this.coa_fecha = coa_fecha;
		this.coa_descripcion = coa_descripcion;
		this.coa_estado = coa_estado;

	}

	public Condicion_agroclimatica(int coa_espacio_id, Timestamp coa_fecha, String coa_descripcion, int coa_estado) {
		super();
		this.coa_espacio_id = coa_espacio_id;
		this.coa_fecha = coa_fecha;
		this.coa_descripcion = coa_descripcion;
		this.coa_estado = coa_estado;

	}
    
    public long getCoa_id() {
		return coa_id;
	}

	public void setCoa_id(long coa_id) {
		this.coa_id = coa_id;
	}
	public int getCoa_espacio_id() {
		return coa_espacio_id;
	}

	public void setCoa_espacio_id(int coa_espacio_id) {
		this.coa_espacio_id = coa_espacio_id;
	}
	public Timestamp getCoa_fecha() {
		return coa_fecha;
	}

	public void setCoa_fecha(Timestamp coa_fecha) {
		this.coa_fecha = coa_fecha;
	}
	public String getCoa_descripcion() {
		return coa_descripcion;
	}

	public void setCoa_descripcion(String coa_descripcion) {
		this.coa_descripcion = coa_descripcion;
	}
	public int getCoa_estado() {
		return coa_estado;
	}

	public void setCoa_estado(int coa_estado) {
		this.coa_estado = coa_estado;
	}

    
	@Override
	public String toString() {
		return "Condicion_agroclimatica [coa_id=" + coa_id + ", coa_espacio_id=" + coa_espacio_id + ", coa_fecha=" + coa_fecha + ", coa_descripcion=" + coa_descripcion + ", coa_estado=" + coa_estado + "]";
	}
	
}
