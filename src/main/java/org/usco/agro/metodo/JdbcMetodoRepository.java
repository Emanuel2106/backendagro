package org.usco.agro.metodo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcMetodoRepository implements MetodoRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.metodo"
		+ "(met_nombre, met_descripcion, met_estado)"
		+ "VALUES (?, ?, ?)";

	String READ_SQL = "SELECT met_id, met_nombre, met_descripcion, met_estado"
		+ " FROM public.metodo";

	String UPDATE_SQL = "UPDATE public.metodo"
		+ " SET met_nombre=?, met_descripcion=?, met_estado=?"
		+ " WHERE met_id=?";

	String DELETE_SQL = "DELETE FROM public.metodo"
		+ " WHERE met_id=?";


	@Override
	public int create(Metodo metodo) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { metodo.getMet_nombre(), metodo.getMet_descripcion(), metodo.getMet_estado() });
	}

	@Override
	public List<Metodo> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Metodo.class));
	}

	@Override
	public int update(long met_id, Metodo metodo) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { metodo.getMet_nombre(), metodo.getMet_descripcion(), metodo.getMet_estado(), met_id });
	}

	@Override
	public int delete(long met_id) {
		return jdbcTemplate.update(DELETE_SQL, met_id);
	}

}
