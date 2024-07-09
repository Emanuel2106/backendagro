package org.usco.agro.cliente_evaluacion;

import java.sql.Timestamp;
import java.sql.Date;


public class Cliente_evaluacion {
    private long cle_id;
	private Timestamp cle_fecha;
	private int cle_persona_id;
	private int cle_evaluacion_id;
	private String cle_descripcion;
	private int cle_estado;

	
	public Cliente_evaluacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente_evaluacion(long cle_id, Timestamp cle_fecha, int cle_persona_id, int cle_evaluacion_id, String cle_descripcion, int cle_estado) {
		super();
		this.cle_id = cle_id;
		this.cle_fecha = cle_fecha;
		this.cle_persona_id = cle_persona_id;
		this.cle_evaluacion_id = cle_evaluacion_id;
		this.cle_descripcion = cle_descripcion;
		this.cle_estado = cle_estado;

	}

	public Cliente_evaluacion(Timestamp cle_fecha, int cle_persona_id, int cle_evaluacion_id, String cle_descripcion, int cle_estado) {
		super();
		this.cle_fecha = cle_fecha;
		this.cle_persona_id = cle_persona_id;
		this.cle_evaluacion_id = cle_evaluacion_id;
		this.cle_descripcion = cle_descripcion;
		this.cle_estado = cle_estado;

	}
    
    public long getCle_id() {
		return cle_id;
	}

	public void setCle_id(long cle_id) {
		this.cle_id = cle_id;
	}
	public Timestamp getCle_fecha() {
		return cle_fecha;
	}

	public void setCle_fecha(Timestamp cle_fecha) {
		this.cle_fecha = cle_fecha;
	}
	public int getCle_persona_id() {
		return cle_persona_id;
	}

	public void setCle_persona_id(int cle_persona_id) {
		this.cle_persona_id = cle_persona_id;
	}
	public int getCle_evaluacion_id() {
		return cle_evaluacion_id;
	}

	public void setCle_evaluacion_id(int cle_evaluacion_id) {
		this.cle_evaluacion_id = cle_evaluacion_id;
	}
	public String getCle_descripcion() {
		return cle_descripcion;
	}

	public void setCle_descripcion(String cle_descripcion) {
		this.cle_descripcion = cle_descripcion;
	}
	public int getCle_estado() {
		return cle_estado;
	}

	public void setCle_estado(int cle_estado) {
		this.cle_estado = cle_estado;
	}

    
	@Override
	public String toString() {
		return "Cliente_evaluacion [cle_id=" + cle_id + ", cle_fecha=" + cle_fecha + ", cle_persona_id=" + cle_persona_id + ", cle_evaluacion_id=" + cle_evaluacion_id + ", cle_descripcion=" + cle_descripcion + ", cle_estado=" + cle_estado + "]";
	}
	
}
