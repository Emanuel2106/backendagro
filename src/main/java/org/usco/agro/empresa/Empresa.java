package org.usco.agro.empresa;

import java.sql.Timestamp;
import java.sql.Date;


public class Empresa {
    private long emp_id;
	private int emp_tipo_identificacion_id;
	private String emp_identificacion;
	private String emp_nombre;
	private int emp_persona_id;
	private String emp_descripcion;
	private int emp_estado;

	
	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empresa(long emp_id, int emp_tipo_identificacion_id, String emp_identificacion, String emp_nombre, int emp_persona_id, String emp_descripcion, int emp_estado) {
		super();
		this.emp_id = emp_id;
		this.emp_tipo_identificacion_id = emp_tipo_identificacion_id;
		this.emp_identificacion = emp_identificacion;
		this.emp_nombre = emp_nombre;
		this.emp_persona_id = emp_persona_id;
		this.emp_descripcion = emp_descripcion;
		this.emp_estado = emp_estado;

	}

	public Empresa(int emp_tipo_identificacion_id, String emp_identificacion, String emp_nombre, int emp_persona_id, String emp_descripcion, int emp_estado) {
		super();
		this.emp_tipo_identificacion_id = emp_tipo_identificacion_id;
		this.emp_identificacion = emp_identificacion;
		this.emp_nombre = emp_nombre;
		this.emp_persona_id = emp_persona_id;
		this.emp_descripcion = emp_descripcion;
		this.emp_estado = emp_estado;

	}
    
    public long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}
	public int getEmp_tipo_identificacion_id() {
		return emp_tipo_identificacion_id;
	}

	public void setEmp_tipo_identificacion_id(int emp_tipo_identificacion_id) {
		this.emp_tipo_identificacion_id = emp_tipo_identificacion_id;
	}
	public String getEmp_identificacion() {
		return emp_identificacion;
	}

	public void setEmp_identificacion(String emp_identificacion) {
		this.emp_identificacion = emp_identificacion;
	}
	public String getEmp_nombre() {
		return emp_nombre;
	}

	public void setEmp_nombre(String emp_nombre) {
		this.emp_nombre = emp_nombre;
	}
	public int getEmp_persona_id() {
		return emp_persona_id;
	}

	public void setEmp_persona_id(int emp_persona_id) {
		this.emp_persona_id = emp_persona_id;
	}
	public String getEmp_descripcion() {
		return emp_descripcion;
	}

	public void setEmp_descripcion(String emp_descripcion) {
		this.emp_descripcion = emp_descripcion;
	}
	public int getEmp_estado() {
		return emp_estado;
	}

	public void setEmp_estado(int emp_estado) {
		this.emp_estado = emp_estado;
	}

    
	@Override
	public String toString() {
		return "Empresa [emp_id=" + emp_id + ", emp_tipo_identificacion_id=" + emp_tipo_identificacion_id + ", emp_identificacion=" + emp_identificacion + ", emp_nombre=" + emp_nombre + ", emp_persona_id=" + emp_persona_id + ", emp_descripcion=" + emp_descripcion + ", emp_estado=" + emp_estado + "]";
	}
	
}
