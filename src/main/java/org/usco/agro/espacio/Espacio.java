package org.usco.agro.espacio;

import java.sql.Timestamp;
import java.sql.Date;


public class Espacio {
    private long esp_id;
	private int esp_bloque_id;
	private int esp_tipo_espacio_id;
	private String esp_nombre;
	private String esp_geolocalizacion;
	private String esp_coordenadas;
	private String esp_descripcion;
	private int esp_estado;

	
	public Espacio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Espacio(long esp_id, int esp_bloque_id, int esp_tipo_espacio_id, String esp_nombre, String esp_geolocalizacion, String esp_coordenadas, String esp_descripcion, int esp_estado) {
		super();
		this.esp_id = esp_id;
		this.esp_bloque_id = esp_bloque_id;
		this.esp_tipo_espacio_id = esp_tipo_espacio_id;
		this.esp_nombre = esp_nombre;
		this.esp_geolocalizacion = esp_geolocalizacion;
		this.esp_coordenadas = esp_coordenadas;
		this.esp_descripcion = esp_descripcion;
		this.esp_estado = esp_estado;

	}

	public Espacio(int esp_bloque_id, int esp_tipo_espacio_id, String esp_nombre, String esp_geolocalizacion, String esp_coordenadas, String esp_descripcion, int esp_estado) {
		super();
		this.esp_bloque_id = esp_bloque_id;
		this.esp_tipo_espacio_id = esp_tipo_espacio_id;
		this.esp_nombre = esp_nombre;
		this.esp_geolocalizacion = esp_geolocalizacion;
		this.esp_coordenadas = esp_coordenadas;
		this.esp_descripcion = esp_descripcion;
		this.esp_estado = esp_estado;

	}
    
    public long getEsp_id() {
		return esp_id;
	}

	public void setEsp_id(long esp_id) {
		this.esp_id = esp_id;
	}
	public int getEsp_bloque_id() {
		return esp_bloque_id;
	}

	public void setEsp_bloque_id(int esp_bloque_id) {
		this.esp_bloque_id = esp_bloque_id;
	}
	public int getEsp_tipo_espacio_id() {
		return esp_tipo_espacio_id;
	}

	public void setEsp_tipo_espacio_id(int esp_tipo_espacio_id) {
		this.esp_tipo_espacio_id = esp_tipo_espacio_id;
	}
	public String getEsp_nombre() {
		return esp_nombre;
	}

	public void setEsp_nombre(String esp_nombre) {
		this.esp_nombre = esp_nombre;
	}
	public String getEsp_geolocalizacion() {
		return esp_geolocalizacion;
	}

	public void setEsp_geolocalizacion(String esp_geolocalizacion) {
		this.esp_geolocalizacion = esp_geolocalizacion;
	}
	public String getEsp_coordenadas() {
		return esp_coordenadas;
	}

	public void setEsp_coordenadas(String esp_coordenadas) {
		this.esp_coordenadas = esp_coordenadas;
	}
	public String getEsp_descripcion() {
		return esp_descripcion;
	}

	public void setEsp_descripcion(String esp_descripcion) {
		this.esp_descripcion = esp_descripcion;
	}
	public int getEsp_estado() {
		return esp_estado;
	}

	public void setEsp_estado(int esp_estado) {
		this.esp_estado = esp_estado;
	}

    
	@Override
	public String toString() {
		return "Espacio [esp_id=" + esp_id + ", esp_bloque_id=" + esp_bloque_id + ", esp_tipo_espacio_id=" + esp_tipo_espacio_id + ", esp_nombre=" + esp_nombre + ", esp_geolocalizacion=" + esp_geolocalizacion + ", esp_coordenadas=" + esp_coordenadas + ", esp_descripcion=" + esp_descripcion + ", esp_estado=" + esp_estado + "]";
	}
	
}
