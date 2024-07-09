package org.usco.agro.modulo_metodo;

import java.sql.Timestamp;
import java.sql.Date;


public class Modulo_metodo {
    private long mom_id;
	private int mom_modulo_id;
	private int mom_metodo_id;
	private String mom_uri;
	private int mom_estado;

	
	public Modulo_metodo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Modulo_metodo(long mom_id, int mom_modulo_id, int mom_metodo_id, String mom_uri, int mom_estado) {
		super();
		this.mom_id = mom_id;
		this.mom_modulo_id = mom_modulo_id;
		this.mom_metodo_id = mom_metodo_id;
		this.mom_uri = mom_uri;
		this.mom_estado = mom_estado;

	}

	public Modulo_metodo(int mom_modulo_id, int mom_metodo_id, String mom_uri, int mom_estado) {
		super();
		this.mom_modulo_id = mom_modulo_id;
		this.mom_metodo_id = mom_metodo_id;
		this.mom_uri = mom_uri;
		this.mom_estado = mom_estado;

	}
    
    public long getMom_id() {
		return mom_id;
	}

	public void setMom_id(long mom_id) {
		this.mom_id = mom_id;
	}
	public int getMom_modulo_id() {
		return mom_modulo_id;
	}

	public void setMom_modulo_id(int mom_modulo_id) {
		this.mom_modulo_id = mom_modulo_id;
	}
	public int getMom_metodo_id() {
		return mom_metodo_id;
	}

	public void setMom_metodo_id(int mom_metodo_id) {
		this.mom_metodo_id = mom_metodo_id;
	}
	public String getMom_uri() {
		return mom_uri;
	}

	public void setMom_uri(String mom_uri) {
		this.mom_uri = mom_uri;
	}
	public int getMom_estado() {
		return mom_estado;
	}

	public void setMom_estado(int mom_estado) {
		this.mom_estado = mom_estado;
	}

    
	@Override
	public String toString() {
		return "Modulo_metodo [mom_id=" + mom_id + ", mom_modulo_id=" + mom_modulo_id + ", mom_metodo_id=" + mom_metodo_id + ", mom_uri=" + mom_uri + ", mom_estado=" + mom_estado + "]";
	}
	
}
