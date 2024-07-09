package org.usco.agro.actividad_programacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcActividad_programacionRepository implements Actividad_programacionRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.actividad_programacion"
		+ "(acp_nombre, acp_fecha_inicio, acp_fecha_fin, acp_tipo_produccion_proceso_id, acp_descripcion, acp_estado)"
		+ "VALUES (?, ?, ?, ?, ?, ?)";

	String READ_SQL = "SELECT acp_id, acp_nombre, acp_fecha_inicio, acp_fecha_fin, acp_tipo_produccion_proceso_id, acp_descripcion, acp_estado"
		+ " FROM public.actividad_programacion";

	String UPDATE_SQL = "UPDATE public.actividad_programacion"
		+ " SET acp_nombre=?, acp_fecha_inicio=?, acp_fecha_fin=?, acp_tipo_produccion_proceso_id=?, acp_descripcion=?, acp_estado=?"
		+ " WHERE acp_id=?";

	String DELETE_SQL = "DELETE FROM public.actividad_programacion"
		+ " WHERE acp_id=?";


	@Override
	public int create(Actividad_programacion actividad_programacion) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { actividad_programacion.getAcp_nombre(), actividad_programacion.getAcp_fecha_inicio(), actividad_programacion.getAcp_fecha_fin(), actividad_programacion.getAcp_tipo_produccion_proceso_id(), actividad_programacion.getAcp_descripcion(), actividad_programacion.getAcp_estado() });
	}

	@Override
	public List<Actividad_programacion> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Actividad_programacion.class));
	}

	@Override
	public int update(long acp_id, Actividad_programacion actividad_programacion) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { actividad_programacion.getAcp_nombre(), actividad_programacion.getAcp_fecha_inicio(), actividad_programacion.getAcp_fecha_fin(), actividad_programacion.getAcp_tipo_produccion_proceso_id(), actividad_programacion.getAcp_descripcion(), actividad_programacion.getAcp_estado(), acp_id });
	}

	@Override
	public int delete(long acp_id) {
		return jdbcTemplate.update(DELETE_SQL, acp_id);
	}

}
