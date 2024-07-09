package org.usco.agro.espacio_actividad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcEspacio_actividadRepository implements Espacio_actividadRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.espacio_actividad"
		+ "(esa_produccion_id, esa_tipo_actividad_id, esa_fecha_hora, esa_cantidad, esa_unidad, esa_precio, esa_evaluacion_id, esa_descripcion, esa_estado)"
		+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

	String READ_SQL = "SELECT esa_id, esa_produccion_id, esa_tipo_actividad_id, esa_fecha_hora, esa_cantidad, esa_unidad, esa_precio, esa_evaluacion_id, esa_descripcion, esa_estado"
		+ " FROM public.espacio_actividad";

	String UPDATE_SQL = "UPDATE public.espacio_actividad"
		+ " SET esa_produccion_id=?, esa_tipo_actividad_id=?, esa_fecha_hora=?, esa_cantidad=?, esa_unidad=?, esa_precio=?, esa_evaluacion_id=?, esa_descripcion=?, esa_estado=?"
		+ " WHERE esa_id=?";

	String DELETE_SQL = "DELETE FROM public.espacio_actividad"
		+ " WHERE esa_id=?";


	@Override
	public int create(Espacio_actividad espacio_actividad) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { espacio_actividad.getEsa_produccion_id(), espacio_actividad.getEsa_tipo_actividad_id(), espacio_actividad.getEsa_fecha_hora(), espacio_actividad.getEsa_cantidad(), espacio_actividad.getEsa_unidad(), espacio_actividad.getEsa_precio(), espacio_actividad.getEsa_evaluacion_id(), espacio_actividad.getEsa_descripcion(), espacio_actividad.getEsa_estado() });
	}

	@Override
	public List<Espacio_actividad> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Espacio_actividad.class));
	}

	@Override
	public int update(long esa_id, Espacio_actividad espacio_actividad) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { espacio_actividad.getEsa_produccion_id(), espacio_actividad.getEsa_tipo_actividad_id(), espacio_actividad.getEsa_fecha_hora(), espacio_actividad.getEsa_cantidad(), espacio_actividad.getEsa_unidad(), espacio_actividad.getEsa_precio(), espacio_actividad.getEsa_evaluacion_id(), espacio_actividad.getEsa_descripcion(), espacio_actividad.getEsa_estado(), esa_id });
	}

	@Override
	public int delete(long esa_id) {
		return jdbcTemplate.update(DELETE_SQL, esa_id);
	}

}
