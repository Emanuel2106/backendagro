package org.usco.agro.condicion_agroclimatica_item;

import java.sql.Timestamp;
import java.sql.Date;


public class Condicion_agroclimatica_item {
    private long cai_id;
	private int cai_condicion_agroclimatica_id;
	private int cai_variable_agroclimatica_id;
	private double cai_valor;

	
	public Condicion_agroclimatica_item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Condicion_agroclimatica_item(long cai_id, int cai_condicion_agroclimatica_id, int cai_variable_agroclimatica_id, double cai_valor) {
		super();
		this.cai_id = cai_id;
		this.cai_condicion_agroclimatica_id = cai_condicion_agroclimatica_id;
		this.cai_variable_agroclimatica_id = cai_variable_agroclimatica_id;
		this.cai_valor = cai_valor;

	}

	public Condicion_agroclimatica_item(int cai_condicion_agroclimatica_id, int cai_variable_agroclimatica_id, double cai_valor) {
		super();
		this.cai_condicion_agroclimatica_id = cai_condicion_agroclimatica_id;
		this.cai_variable_agroclimatica_id = cai_variable_agroclimatica_id;
		this.cai_valor = cai_valor;

	}
    
    public long getCai_id() {
		return cai_id;
	}

	public void setCai_id(long cai_id) {
		this.cai_id = cai_id;
	}
	public int getCai_condicion_agroclimatica_id() {
		return cai_condicion_agroclimatica_id;
	}

	public void setCai_condicion_agroclimatica_id(int cai_condicion_agroclimatica_id) {
		this.cai_condicion_agroclimatica_id = cai_condicion_agroclimatica_id;
	}
	public int getCai_variable_agroclimatica_id() {
		return cai_variable_agroclimatica_id;
	}

	public void setCai_variable_agroclimatica_id(int cai_variable_agroclimatica_id) {
		this.cai_variable_agroclimatica_id = cai_variable_agroclimatica_id;
	}
	public double getCai_valor() {
		return cai_valor;
	}

	public void setCai_valor(double cai_valor) {
		this.cai_valor = cai_valor;
	}

    
	@Override
	public String toString() {
		return "Condicion_agroclimatica_item [cai_id=" + cai_id + ", cai_condicion_agroclimatica_id=" + cai_condicion_agroclimatica_id + ", cai_variable_agroclimatica_id=" + cai_variable_agroclimatica_id + ", cai_valor=" + cai_valor + "]";
	}
	
}
