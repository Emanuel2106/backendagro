package org.usco.agro.sesion;

import java.sql.Timestamp;
import java.sql.Date;


public class Sesion {
    private long ses_id;
	private int ses_usuario_id;
	private Timestamp ses_fecha_hora_start;
	private Timestamp ses_fecha_hora_end;
	private String ses_direccion_ip;
	private int ses_estado;

	
	public Sesion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sesion(long ses_id, int ses_usuario_id, Timestamp ses_fecha_hora_start, Timestamp ses_fecha_hora_end, String ses_direccion_ip, int ses_estado) {
		super();
		this.ses_id = ses_id;
		this.ses_usuario_id = ses_usuario_id;
		this.ses_fecha_hora_start = ses_fecha_hora_start;
		this.ses_fecha_hora_end = ses_fecha_hora_end;
		this.ses_direccion_ip = ses_direccion_ip;
		this.ses_estado = ses_estado;

	}

	public Sesion(int ses_usuario_id, Timestamp ses_fecha_hora_start, Timestamp ses_fecha_hora_end, String ses_direccion_ip, int ses_estado) {
		super();
		this.ses_usuario_id = ses_usuario_id;
		this.ses_fecha_hora_start = ses_fecha_hora_start;
		this.ses_fecha_hora_end = ses_fecha_hora_end;
		this.ses_direccion_ip = ses_direccion_ip;
		this.ses_estado = ses_estado;

	}
    
    public long getSes_id() {
		return ses_id;
	}

	public void setSes_id(long ses_id) {
		this.ses_id = ses_id;
	}
	public int getSes_usuario_id() {
		return ses_usuario_id;
	}

	public void setSes_usuario_id(int ses_usuario_id) {
		this.ses_usuario_id = ses_usuario_id;
	}
	public Timestamp getSes_fecha_hora_start() {
		return ses_fecha_hora_start;
	}

	public void setSes_fecha_hora_start(Timestamp ses_fecha_hora_start) {
		this.ses_fecha_hora_start = ses_fecha_hora_start;
	}
	public Timestamp getSes_fecha_hora_end() {
		return ses_fecha_hora_end;
	}

	public void setSes_fecha_hora_end(Timestamp ses_fecha_hora_end) {
		this.ses_fecha_hora_end = ses_fecha_hora_end;
	}
	public String getSes_direccion_ip() {
		return ses_direccion_ip;
	}

	public void setSes_direccion_ip(String ses_direccion_ip) {
		this.ses_direccion_ip = ses_direccion_ip;
	}
	public int getSes_estado() {
		return ses_estado;
	}

	public void setSes_estado(int ses_estado) {
		this.ses_estado = ses_estado;
	}

    
	@Override
	public String toString() {
		return "Sesion [ses_id=" + ses_id + ", ses_usuario_id=" + ses_usuario_id + ", ses_fecha_hora_start=" + ses_fecha_hora_start + ", ses_fecha_hora_end=" + ses_fecha_hora_end + ", ses_direccion_ip=" + ses_direccion_ip + ", ses_estado=" + ses_estado + "]";
	}
	
}
