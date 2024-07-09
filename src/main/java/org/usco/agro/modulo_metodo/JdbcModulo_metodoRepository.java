package org.usco.agro.modulo_metodo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcModulo_metodoRepository implements Modulo_metodoRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.modulo_metodo"
		+ "(mom_modulo_id, mom_metodo_id, mom_uri, mom_estado)"
		+ "VALUES (?, ?, ?, ?)";

	String READ_SQL = "SELECT mom_id, mom_modulo_id, mom_metodo_id, mom_uri, mom_estado"
		+ " FROM public.modulo_metodo";

	String UPDATE_SQL = "UPDATE public.modulo_metodo"
		+ " SET mom_modulo_id=?, mom_metodo_id=?, mom_uri=?, mom_estado=?"
		+ " WHERE mom_id=?";

	String DELETE_SQL = "DELETE FROM public.modulo_metodo"
		+ " WHERE mom_id=?";


	@Override
	public int create(Modulo_metodo modulo_metodo) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { modulo_metodo.getMom_modulo_id(), modulo_metodo.getMom_metodo_id(), modulo_metodo.getMom_uri(), modulo_metodo.getMom_estado() });
	}

	@Override
	public List<Modulo_metodo> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Modulo_metodo.class));
	}

	@Override
	public int update(long mom_id, Modulo_metodo modulo_metodo) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { modulo_metodo.getMom_modulo_id(), modulo_metodo.getMom_metodo_id(), modulo_metodo.getMom_uri(), modulo_metodo.getMom_estado(), mom_id });
	}

	@Override
	public int delete(long mom_id) {
		return jdbcTemplate.update(DELETE_SQL, mom_id);
	}

}
