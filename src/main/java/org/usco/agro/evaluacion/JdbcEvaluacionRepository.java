package org.usco.agro.evaluacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcEvaluacionRepository implements EvaluacionRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.evaluacion"
		+ "(eva_nombre, eva_descripcion, eva_estado)"
		+ "VALUES (?, ?, ?)";

	String READ_SQL = "SELECT eva_id, eva_nombre, eva_descripcion, eva_estado"
		+ " FROM public.evaluacion";

	String UPDATE_SQL = "UPDATE public.evaluacion"
		+ " SET eva_nombre=?, eva_descripcion=?, eva_estado=?"
		+ " WHERE eva_id=?";

	String DELETE_SQL = "DELETE FROM public.evaluacion"
		+ " WHERE eva_id=?";


	@Override
	public int create(Evaluacion evaluacion) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { evaluacion.getEva_nombre(), evaluacion.getEva_descripcion(), evaluacion.getEva_estado() });
	}

	@Override
	public List<Evaluacion> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Evaluacion.class));
	}

	@Override
	public int update(long eva_id, Evaluacion evaluacion) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { evaluacion.getEva_nombre(), evaluacion.getEva_descripcion(), evaluacion.getEva_estado(), eva_id });
	}

	@Override
	public int delete(long eva_id) {
		return jdbcTemplate.update(DELETE_SQL, eva_id);
	}

}
