package org.usco.agro.actividad_produccion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcActividad_produccionRepository implements Actividad_produccionRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.actividad_produccion"
		+ "(acp_nombre, acp_actividad_programacion_id, acp_descripcion, acp_estado)"
		+ "VALUES (?, ?, ?, ?)";

	String READ_SQL = "SELECT acp_id, acp_nombre, acp_actividad_programacion_id, acp_descripcion, acp_estado"
		+ " FROM public.actividad_produccion";

	String UPDATE_SQL = "UPDATE public.actividad_produccion"
		+ " SET acp_nombre=?, acp_actividad_programacion_id=?, acp_descripcion=?, acp_estado=?"
		+ " WHERE acp_id=?";

	String DELETE_SQL = "DELETE FROM public.actividad_produccion"
		+ " WHERE acp_id=?";


	@Override
	public int create(Actividad_produccion actividad_produccion) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { actividad_produccion.getAcp_nombre(), actividad_produccion.getAcp_actividad_programacion_id(), actividad_produccion.getAcp_descripcion(), actividad_produccion.getAcp_estado() });
	}

	@Override
	public List<Actividad_produccion> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Actividad_produccion.class));
	}

	@Override
	public int update(long acp_id, Actividad_produccion actividad_produccion) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { actividad_produccion.getAcp_nombre(), actividad_produccion.getAcp_actividad_programacion_id(), actividad_produccion.getAcp_descripcion(), actividad_produccion.getAcp_estado(), acp_id });
	}

	@Override
	public int delete(long acp_id) {
		return jdbcTemplate.update(DELETE_SQL, acp_id);
	}

}
