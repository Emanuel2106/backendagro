package org.usco.agro.pais;

import java.sql.Timestamp;
import java.sql.Date;


public class Pais {
    private long pai_id;
	private String pai_nombre;
	private int pai_codigo;
	private String pai_acronimo;

	
	public Pais() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pais(long pai_id, String pai_nombre, int pai_codigo, String pai_acronimo) {
		super();
		this.pai_id = pai_id;
		this.pai_nombre = pai_nombre;
		this.pai_codigo = pai_codigo;
		this.pai_acronimo = pai_acronimo;

	}

	public Pais(String pai_nombre, int pai_codigo, String pai_acronimo) {
		super();
		this.pai_nombre = pai_nombre;
		this.pai_codigo = pai_codigo;
		this.pai_acronimo = pai_acronimo;

	}
    
    public long getPai_id() {
		return pai_id;
	}

	public void setPai_id(long pai_id) {
		this.pai_id = pai_id;
	}
	public String getPai_nombre() {
		return pai_nombre;
	}

	public void setPai_nombre(String pai_nombre) {
		this.pai_nombre = pai_nombre;
	}
	public int getPai_codigo() {
		return pai_codigo;
	}

	public void setPai_codigo(int pai_codigo) {
		this.pai_codigo = pai_codigo;
	}
	public String getPai_acronimo() {
		return pai_acronimo;
	}

	public void setPai_acronimo(String pai_acronimo) {
		this.pai_acronimo = pai_acronimo;
	}

    
	@Override
	public String toString() {
		return "Pais [pai_id=" + pai_id + ", pai_nombre=" + pai_nombre + ", pai_codigo=" + pai_codigo + ", pai_acronimo=" + pai_acronimo + "]";
	}
	
}
