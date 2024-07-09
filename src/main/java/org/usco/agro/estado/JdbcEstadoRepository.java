package org.usco.agro.estado;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcEstadoRepository implements EstadoRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.estado"
		+ "(est_nombre, est_descripcion)"
		+ "VALUES (?, ?)";

	String READ_SQL = "SELECT est_id, est_nombre, est_descripcion"
		+ " FROM public.estado";

	String UPDATE_SQL = "UPDATE public.estado"
		+ " SET est_nombre=?, est_descripcion=?"
		+ " WHERE est_id=?";

	String DELETE_SQL = "DELETE FROM public.estado"
		+ " WHERE est_id=?";


	@Override
	public int create(Estado estado) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { estado.getEst_nombre(), estado.getEst_descripcion() });
	}

	@Override
	public List<Estado> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Estado.class));
	}

	@Override
	public int update(long est_id, Estado estado) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { estado.getEst_nombre(), estado.getEst_descripcion(), est_id });
	}

	@Override
	public int delete(long est_id) {
		return jdbcTemplate.update(DELETE_SQL, est_id);
	}

}
