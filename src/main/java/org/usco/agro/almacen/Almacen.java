package org.usco.agro.almacen;

import java.sql.Timestamp;
import java.sql.Date;


public class Almacen {
    private long alm_id;
	private String alm_nombre;
	private int alm_sede_id;
	private String alm_geolocalizacion;
	private String alm_coordenadas;
	private String alm_descripcion;
	private int alm_estado;

	
	public Almacen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Almacen(long alm_id, String alm_nombre, int alm_sede_id, String alm_geolocalizacion, String alm_coordenadas, String alm_descripcion, int alm_estado) {
		super();
		this.alm_id = alm_id;
		this.alm_nombre = alm_nombre;
		this.alm_sede_id = alm_sede_id;
		this.alm_geolocalizacion = alm_geolocalizacion;
		this.alm_coordenadas = alm_coordenadas;
		this.alm_descripcion = alm_descripcion;
		this.alm_estado = alm_estado;

	}

	public Almacen(String alm_nombre, int alm_sede_id, String alm_geolocalizacion, String alm_coordenadas, String alm_descripcion, int alm_estado) {
		super();
		this.alm_nombre = alm_nombre;
		this.alm_sede_id = alm_sede_id;
		this.alm_geolocalizacion = alm_geolocalizacion;
		this.alm_coordenadas = alm_coordenadas;
		this.alm_descripcion = alm_descripcion;
		this.alm_estado = alm_estado;

	}
    
    public long getAlm_id() {
		return alm_id;
	}

	public void setAlm_id(long alm_id) {
		this.alm_id = alm_id;
	}
	public String getAlm_nombre() {
		return alm_nombre;
	}

	public void setAlm_nombre(String alm_nombre) {
		this.alm_nombre = alm_nombre;
	}
	public int getAlm_sede_id() {
		return alm_sede_id;
	}

	public void setAlm_sede_id(int alm_sede_id) {
		this.alm_sede_id = alm_sede_id;
	}
	public String getAlm_geolocalizacion() {
		return alm_geolocalizacion;
	}

	public void setAlm_geolocalizacion(String alm_geolocalizacion) {
		this.alm_geolocalizacion = alm_geolocalizacion;
	}
	public String getAlm_coordenadas() {
		return alm_coordenadas;
	}

	public void setAlm_coordenadas(String alm_coordenadas) {
		this.alm_coordenadas = alm_coordenadas;
	}
	public String getAlm_descripcion() {
		return alm_descripcion;
	}

	public void setAlm_descripcion(String alm_descripcion) {
		this.alm_descripcion = alm_descripcion;
	}
	public int getAlm_estado() {
		return alm_estado;
	}

	public void setAlm_estado(int alm_estado) {
		this.alm_estado = alm_estado;
	}

    
	@Override
	public String toString() {
		return "Almacen [alm_id=" + alm_id + ", alm_nombre=" + alm_nombre + ", alm_sede_id=" + alm_sede_id + ", alm_geolocalizacion=" + alm_geolocalizacion + ", alm_coordenadas=" + alm_coordenadas + ", alm_descripcion=" + alm_descripcion + ", alm_estado=" + alm_estado + "]";
	}
	
}
