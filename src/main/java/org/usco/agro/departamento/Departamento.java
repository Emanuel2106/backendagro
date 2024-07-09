package org.usco.agro.departamento;

import java.sql.Timestamp;
import java.sql.Date;


public class Departamento {
    private long dep_id;
	private String dep_nombre;
	private int dep_pais_id;
	private int dep_codigo;
	private String dep_acronimo;

	
	public Departamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Departamento(long dep_id, String dep_nombre, int dep_pais_id, int dep_codigo, String dep_acronimo) {
		super();
		this.dep_id = dep_id;
		this.dep_nombre = dep_nombre;
		this.dep_pais_id = dep_pais_id;
		this.dep_codigo = dep_codigo;
		this.dep_acronimo = dep_acronimo;

	}

	public Departamento(String dep_nombre, int dep_pais_id, int dep_codigo, String dep_acronimo) {
		super();
		this.dep_nombre = dep_nombre;
		this.dep_pais_id = dep_pais_id;
		this.dep_codigo = dep_codigo;
		this.dep_acronimo = dep_acronimo;

	}
    
    public long getDep_id() {
		return dep_id;
	}

	public void setDep_id(long dep_id) {
		this.dep_id = dep_id;
	}
	public String getDep_nombre() {
		return dep_nombre;
	}

	public void setDep_nombre(String dep_nombre) {
		this.dep_nombre = dep_nombre;
	}
	public int getDep_pais_id() {
		return dep_pais_id;
	}

	public void setDep_pais_id(int dep_pais_id) {
		this.dep_pais_id = dep_pais_id;
	}
	public int getDep_codigo() {
		return dep_codigo;
	}

	public void setDep_codigo(int dep_codigo) {
		this.dep_codigo = dep_codigo;
	}
	public String getDep_acronimo() {
		return dep_acronimo;
	}

	public void setDep_acronimo(String dep_acronimo) {
		this.dep_acronimo = dep_acronimo;
	}

    
	@Override
	public String toString() {
		return "Departamento [dep_id=" + dep_id + ", dep_nombre=" + dep_nombre + ", dep_pais_id=" + dep_pais_id + ", dep_codigo=" + dep_codigo + ", dep_acronimo=" + dep_acronimo + "]";
	}
	
}
