package org.usco.agro.municipio;

import java.sql.Timestamp;
import java.sql.Date;


public class Municipio {
    private long mun_id;
	private String mun_nombre;
	private int mun_departamento_id;
	private int mun_codigo;
	private String mun_acronimo;

	
	public Municipio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Municipio(long mun_id, String mun_nombre, int mun_departamento_id, int mun_codigo, String mun_acronimo) {
		super();
		this.mun_id = mun_id;
		this.mun_nombre = mun_nombre;
		this.mun_departamento_id = mun_departamento_id;
		this.mun_codigo = mun_codigo;
		this.mun_acronimo = mun_acronimo;

	}

	public Municipio(String mun_nombre, int mun_departamento_id, int mun_codigo, String mun_acronimo) {
		super();
		this.mun_nombre = mun_nombre;
		this.mun_departamento_id = mun_departamento_id;
		this.mun_codigo = mun_codigo;
		this.mun_acronimo = mun_acronimo;

	}
    
    public long getMun_id() {
		return mun_id;
	}

	public void setMun_id(long mun_id) {
		this.mun_id = mun_id;
	}
	public String getMun_nombre() {
		return mun_nombre;
	}

	public void setMun_nombre(String mun_nombre) {
		this.mun_nombre = mun_nombre;
	}
	public int getMun_departamento_id() {
		return mun_departamento_id;
	}

	public void setMun_departamento_id(int mun_departamento_id) {
		this.mun_departamento_id = mun_departamento_id;
	}
	public int getMun_codigo() {
		return mun_codigo;
	}

	public void setMun_codigo(int mun_codigo) {
		this.mun_codigo = mun_codigo;
	}
	public String getMun_acronimo() {
		return mun_acronimo;
	}

	public void setMun_acronimo(String mun_acronimo) {
		this.mun_acronimo = mun_acronimo;
	}

    
	@Override
	public String toString() {
		return "Municipio [mun_id=" + mun_id + ", mun_nombre=" + mun_nombre + ", mun_departamento_id=" + mun_departamento_id + ", mun_codigo=" + mun_codigo + ", mun_acronimo=" + mun_acronimo + "]";
	}
	
}
