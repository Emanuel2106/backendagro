package org.usco.agro.bloque;

import java.sql.Timestamp;
import java.sql.Date;


public class Bloque {
    private long blo_id;
	private int blo_sede_id;
	private int blo_tipo_bloque_id;
	private String blo_nombre;
	private String blo_geolocalizacion;
	private String blo_coordenadas;
	private int blo_numero_pisos;
	private String blo_descripcion;
	private int blo_estado;

	
	public Bloque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bloque(long blo_id, int blo_sede_id, int blo_tipo_bloque_id, String blo_nombre, String blo_geolocalizacion, String blo_coordenadas, int blo_numero_pisos, String blo_descripcion, int blo_estado) {
		super();
		this.blo_id = blo_id;
		this.blo_sede_id = blo_sede_id;
		this.blo_tipo_bloque_id = blo_tipo_bloque_id;
		this.blo_nombre = blo_nombre;
		this.blo_geolocalizacion = blo_geolocalizacion;
		this.blo_coordenadas = blo_coordenadas;
		this.blo_numero_pisos = blo_numero_pisos;
		this.blo_descripcion = blo_descripcion;
		this.blo_estado = blo_estado;

	}

	public Bloque(int blo_sede_id, int blo_tipo_bloque_id, String blo_nombre, String blo_geolocalizacion, String blo_coordenadas, int blo_numero_pisos, String blo_descripcion, int blo_estado) {
		super();
		this.blo_sede_id = blo_sede_id;
		this.blo_tipo_bloque_id = blo_tipo_bloque_id;
		this.blo_nombre = blo_nombre;
		this.blo_geolocalizacion = blo_geolocalizacion;
		this.blo_coordenadas = blo_coordenadas;
		this.blo_numero_pisos = blo_numero_pisos;
		this.blo_descripcion = blo_descripcion;
		this.blo_estado = blo_estado;

	}
    
    public long getBlo_id() {
		return blo_id;
	}

	public void setBlo_id(long blo_id) {
		this.blo_id = blo_id;
	}
	public int getBlo_sede_id() {
		return blo_sede_id;
	}

	public void setBlo_sede_id(int blo_sede_id) {
		this.blo_sede_id = blo_sede_id;
	}
	public int getBlo_tipo_bloque_id() {
		return blo_tipo_bloque_id;
	}

	public void setBlo_tipo_bloque_id(int blo_tipo_bloque_id) {
		this.blo_tipo_bloque_id = blo_tipo_bloque_id;
	}
	public String getBlo_nombre() {
		return blo_nombre;
	}

	public void setBlo_nombre(String blo_nombre) {
		this.blo_nombre = blo_nombre;
	}
	public String getBlo_geolocalizacion() {
		return blo_geolocalizacion;
	}

	public void setBlo_geolocalizacion(String blo_geolocalizacion) {
		this.blo_geolocalizacion = blo_geolocalizacion;
	}
	public String getBlo_coordenadas() {
		return blo_coordenadas;
	}

	public void setBlo_coordenadas(String blo_coordenadas) {
		this.blo_coordenadas = blo_coordenadas;
	}
	public int getBlo_numero_pisos() {
		return blo_numero_pisos;
	}

	public void setBlo_numero_pisos(int blo_numero_pisos) {
		this.blo_numero_pisos = blo_numero_pisos;
	}
	public String getBlo_descripcion() {
		return blo_descripcion;
	}

	public void setBlo_descripcion(String blo_descripcion) {
		this.blo_descripcion = blo_descripcion;
	}
	public int getBlo_estado() {
		return blo_estado;
	}

	public void setBlo_estado(int blo_estado) {
		this.blo_estado = blo_estado;
	}

    
	@Override
	public String toString() {
		return "Bloque [blo_id=" + blo_id + ", blo_sede_id=" + blo_sede_id + ", blo_tipo_bloque_id=" + blo_tipo_bloque_id + ", blo_nombre=" + blo_nombre + ", blo_geolocalizacion=" + blo_geolocalizacion + ", blo_coordenadas=" + blo_coordenadas + ", blo_numero_pisos=" + blo_numero_pisos + ", blo_descripcion=" + blo_descripcion + ", blo_estado=" + blo_estado + "]";
	}
	
}
