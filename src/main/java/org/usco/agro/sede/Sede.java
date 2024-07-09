package org.usco.agro.sede;

import java.sql.Timestamp;
import java.sql.Date;


public class Sede {
    private long sed_id;
	private int sed_grupo_id;
	private int sed_tipo_sede_id;
	private int sed_empresa_id;
	private String sed_nombre;
	private int sed_municipio_id;
	private String sed_geolocalizacion;
	private String sed_coordenadas;
	private double sed_area;
	private String sed_comuna;
	private String sed_descripcion;
	private int sed_estado;

	
	public Sede() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sede(long sed_id, int sed_grupo_id, int sed_tipo_sede_id, int sed_empresa_id, String sed_nombre, int sed_municipio_id, String sed_geolocalizacion, String sed_coordenadas, double sed_area, String sed_comuna, String sed_descripcion, int sed_estado) {
		super();
		this.sed_id = sed_id;
		this.sed_grupo_id = sed_grupo_id;
		this.sed_tipo_sede_id = sed_tipo_sede_id;
		this.sed_empresa_id = sed_empresa_id;
		this.sed_nombre = sed_nombre;
		this.sed_municipio_id = sed_municipio_id;
		this.sed_geolocalizacion = sed_geolocalizacion;
		this.sed_coordenadas = sed_coordenadas;
		this.sed_area = sed_area;
		this.sed_comuna = sed_comuna;
		this.sed_descripcion = sed_descripcion;
		this.sed_estado = sed_estado;

	}

	public Sede(int sed_grupo_id, int sed_tipo_sede_id, int sed_empresa_id, String sed_nombre, int sed_municipio_id, String sed_geolocalizacion, String sed_coordenadas, double sed_area, String sed_comuna, String sed_descripcion, int sed_estado) {
		super();
		this.sed_grupo_id = sed_grupo_id;
		this.sed_tipo_sede_id = sed_tipo_sede_id;
		this.sed_empresa_id = sed_empresa_id;
		this.sed_nombre = sed_nombre;
		this.sed_municipio_id = sed_municipio_id;
		this.sed_geolocalizacion = sed_geolocalizacion;
		this.sed_coordenadas = sed_coordenadas;
		this.sed_area = sed_area;
		this.sed_comuna = sed_comuna;
		this.sed_descripcion = sed_descripcion;
		this.sed_estado = sed_estado;

	}
    
    public long getSed_id() {
		return sed_id;
	}

	public void setSed_id(long sed_id) {
		this.sed_id = sed_id;
	}
	public int getSed_grupo_id() {
		return sed_grupo_id;
	}

	public void setSed_grupo_id(int sed_grupo_id) {
		this.sed_grupo_id = sed_grupo_id;
	}
	public int getSed_tipo_sede_id() {
		return sed_tipo_sede_id;
	}

	public void setSed_tipo_sede_id(int sed_tipo_sede_id) {
		this.sed_tipo_sede_id = sed_tipo_sede_id;
	}
	public int getSed_empresa_id() {
		return sed_empresa_id;
	}

	public void setSed_empresa_id(int sed_empresa_id) {
		this.sed_empresa_id = sed_empresa_id;
	}
	public String getSed_nombre() {
		return sed_nombre;
	}

	public void setSed_nombre(String sed_nombre) {
		this.sed_nombre = sed_nombre;
	}
	public int getSed_municipio_id() {
		return sed_municipio_id;
	}

	public void setSed_municipio_id(int sed_municipio_id) {
		this.sed_municipio_id = sed_municipio_id;
	}
	public String getSed_geolocalizacion() {
		return sed_geolocalizacion;
	}

	public void setSed_geolocalizacion(String sed_geolocalizacion) {
		this.sed_geolocalizacion = sed_geolocalizacion;
	}
	public String getSed_coordenadas() {
		return sed_coordenadas;
	}

	public void setSed_coordenadas(String sed_coordenadas) {
		this.sed_coordenadas = sed_coordenadas;
	}
	public double getSed_area() {
		return sed_area;
	}

	public void setSed_area(double sed_area) {
		this.sed_area = sed_area;
	}
	public String getSed_comuna() {
		return sed_comuna;
	}

	public void setSed_comuna(String sed_comuna) {
		this.sed_comuna = sed_comuna;
	}
	public String getSed_descripcion() {
		return sed_descripcion;
	}

	public void setSed_descripcion(String sed_descripcion) {
		this.sed_descripcion = sed_descripcion;
	}
	public int getSed_estado() {
		return sed_estado;
	}

	public void setSed_estado(int sed_estado) {
		this.sed_estado = sed_estado;
	}

    
	@Override
	public String toString() {
		return "Sede [sed_id=" + sed_id + ", sed_grupo_id=" + sed_grupo_id + ", sed_tipo_sede_id=" + sed_tipo_sede_id + ", sed_empresa_id=" + sed_empresa_id + ", sed_nombre=" + sed_nombre + ", sed_municipio_id=" + sed_municipio_id + ", sed_geolocalizacion=" + sed_geolocalizacion + ", sed_coordenadas=" + sed_coordenadas + ", sed_area=" + sed_area + ", sed_comuna=" + sed_comuna + ", sed_descripcion=" + sed_descripcion + ", sed_estado=" + sed_estado + "]";
	}
	
}
