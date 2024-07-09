package org.usco.agro.actividad_ocupacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcActividad_ocupacionRepository implements Actividad_ocupacionRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.actividad_ocupacion"
		+ "(aco_nombre, aco_tipo_actividad_id, aco_evaluacion_id)"
		+ "VALUES (?, ?, ?)";

	String READ_SQL = "SELECT aco_id, aco_nombre, aco_tipo_actividad_id, aco_evaluacion_id"
		+ " FROM public.actividad_ocupacion";

	String UPDATE_SQL = "UPDATE public.actividad_ocupacion"
		+ " SET aco_nombre=?, aco_tipo_actividad_id=?, aco_evaluacion_id=?"
		+ " WHERE aco_id=?";

	String DELETE_SQL = "DELETE FROM public.actividad_ocupacion"
		+ " WHERE aco_id=?";


	@Override
	public int create(Actividad_ocupacion actividad_ocupacion) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { actividad_ocupacion.getAco_nombre(), actividad_ocupacion.getAco_tipo_actividad_id(), actividad_ocupacion.getAco_evaluacion_id() });
	}

	@Override
	public List<Actividad_ocupacion> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Actividad_ocupacion.class));
	}

	@Override
	public int update(long aco_id, Actividad_ocupacion actividad_ocupacion) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { actividad_ocupacion.getAco_nombre(), actividad_ocupacion.getAco_tipo_actividad_id(), actividad_ocupacion.getAco_evaluacion_id(), aco_id });
	}

	@Override
	public int delete(long aco_id) {
		return jdbcTemplate.update(DELETE_SQL, aco_id);
	}

}
