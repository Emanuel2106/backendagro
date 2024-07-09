package org.usco.agro.persona;

import java.sql.Timestamp;
import java.sql.Date;


public class Persona {
    private long per_id;
	private int per_tipo_identificacion;
	private String per_identificacion;
	private String per_nombre;
	private String per_apellido;
	private boolean per_genero;
	private Timestamp per_fecha_nacimiento;
	private int per_estrato;
	private String per_direccion;
	private String per_email_personal;
	private long per_celular;
	private int per_estado;

	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(long per_id, int per_tipo_identificacion, String per_identificacion, String per_nombre, String per_apellido, boolean per_genero, Timestamp per_fecha_nacimiento, int per_estrato, String per_direccion, String per_email_personal, long per_celular, int per_estado) {
		super();
		this.per_id = per_id;
		this.per_tipo_identificacion = per_tipo_identificacion;
		this.per_identificacion = per_identificacion;
		this.per_nombre = per_nombre;
		this.per_apellido = per_apellido;
		this.per_genero = per_genero;
		this.per_fecha_nacimiento = per_fecha_nacimiento;
		this.per_estrato = per_estrato;
		this.per_direccion = per_direccion;
		this.per_email_personal = per_email_personal;
		this.per_celular = per_celular;
		this.per_estado = per_estado;

	}

	public Persona(int per_tipo_identificacion, String per_identificacion, String per_nombre, String per_apellido, boolean per_genero, Timestamp per_fecha_nacimiento, int per_estrato, String per_direccion, String per_email_personal, long per_celular, int per_estado) {
		super();
		this.per_tipo_identificacion = per_tipo_identificacion;
		this.per_identificacion = per_identificacion;
		this.per_nombre = per_nombre;
		this.per_apellido = per_apellido;
		this.per_genero = per_genero;
		this.per_fecha_nacimiento = per_fecha_nacimiento;
		this.per_estrato = per_estrato;
		this.per_direccion = per_direccion;
		this.per_email_personal = per_email_personal;
		this.per_celular = per_celular;
		this.per_estado = per_estado;

	}
    
    public long getPer_id() {
		return per_id;
	}

	public void setPer_id(long per_id) {
		this.per_id = per_id;
	}
	public int getPer_tipo_identificacion() {
		return per_tipo_identificacion;
	}

	public void setPer_tipo_identificacion(int per_tipo_identificacion) {
		this.per_tipo_identificacion = per_tipo_identificacion;
	}
	public String getPer_identificacion() {
		return per_identificacion;
	}

	public void setPer_identificacion(String per_identificacion) {
		this.per_identificacion = per_identificacion;
	}
	public String getPer_nombre() {
		return per_nombre;
	}

	public void setPer_nombre(String per_nombre) {
		this.per_nombre = per_nombre;
	}
	public String getPer_apellido() {
		return per_apellido;
	}

	public void setPer_apellido(String per_apellido) {
		this.per_apellido = per_apellido;
	}
	public boolean getPer_genero() {
		return per_genero;
	}

	public void setPer_genero(boolean per_genero) {
		this.per_genero = per_genero;
	}
	public Timestamp getPer_fecha_nacimiento() {
		return per_fecha_nacimiento;
	}

	public void setPer_fecha_nacimiento(Timestamp per_fecha_nacimiento) {
		this.per_fecha_nacimiento = per_fecha_nacimiento;
	}
	public int getPer_estrato() {
		return per_estrato;
	}

	public void setPer_estrato(int per_estrato) {
		this.per_estrato = per_estrato;
	}
	public String getPer_direccion() {
		return per_direccion;
	}

	public void setPer_direccion(String per_direccion) {
		this.per_direccion = per_direccion;
	}
	public String getPer_email_personal() {
		return per_email_personal;
	}

	public void setPer_email_personal(String per_email_personal) {
		this.per_email_personal = per_email_personal;
	}
	public long getPer_celular() {
		return per_celular;
	}

	public void setPer_celular(long per_celular) {
		this.per_celular = per_celular;
	}
	public int getPer_estado() {
		return per_estado;
	}

	public void setPer_estado(int per_estado) {
		this.per_estado = per_estado;
	}

    
	@Override
	public String toString() {
		return "Persona [per_id=" + per_id + ", per_tipo_identificacion=" + per_tipo_identificacion + ", per_identificacion=" + per_identificacion + ", per_nombre=" + per_nombre + ", per_apellido=" + per_apellido + ", per_genero=" + per_genero + ", per_fecha_nacimiento=" + per_fecha_nacimiento + ", per_estrato=" + per_estrato + ", per_direccion=" + per_direccion + ", per_email_personal=" + per_email_personal + ", per_celular=" + per_celular + ", per_estado=" + per_estado + "]";
	}
	
}
