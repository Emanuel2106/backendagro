package org.usco.agro.permisos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcPermisosRepository implements PermisosRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.permisos"
		+ "(per_modulo_metodo_id, per_rol, per_metodo_id)"
		+ "VALUES (?, ?, ?)";

	String READ_SQL = "SELECT per_id, per_modulo_metodo_id, per_rol, per_metodo_id"
		+ " FROM public.permisos";

	String UPDATE_SQL = "UPDATE public.permisos"
		+ " SET per_modulo_metodo_id=?, per_rol=?, per_metodo_id=?"
		+ " WHERE per_id=?";

	String DELETE_SQL = "DELETE FROM public.permisos"
		+ " WHERE per_id=?";


	@Override
	public int create(Permisos permisos) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { permisos.getPer_modulo_metodo_id(), permisos.getPer_rol(), permisos.getPer_metodo_id() });
	}

	@Override
	public List<Permisos> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Permisos.class));
	}

	@Override
	public int update(long per_id, Permisos permisos) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { permisos.getPer_modulo_metodo_id(), permisos.getPer_rol(), permisos.getPer_metodo_id(), per_id });
	}

	@Override
	public int delete(long per_id) {
		return jdbcTemplate.update(DELETE_SQL, per_id);
	}

}
