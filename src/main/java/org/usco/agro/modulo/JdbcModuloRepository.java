package org.usco.agro.modulo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcModuloRepository implements ModuloRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.modulo"
		+ "(mod_nombre, mod_url, mod_descripcion, mod_estado)"
		+ "VALUES (?, ?, ?, ?)";

	String READ_SQL = "SELECT mod_id, mod_nombre, mod_url, mod_descripcion, mod_estado"
		+ " FROM public.modulo";

	String UPDATE_SQL = "UPDATE public.modulo"
		+ " SET mod_nombre=?, mod_url=?, mod_descripcion=?, mod_estado=?"
		+ " WHERE mod_id=?";

	String DELETE_SQL = "DELETE FROM public.modulo"
		+ " WHERE mod_id=?";


	@Override
	public int create(Modulo modulo) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { modulo.getMod_nombre(), modulo.getMod_url(), modulo.getMod_descripcion(), modulo.getMod_estado() });
	}

	@Override
	public List<Modulo> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Modulo.class));
	}

	@Override
	public int update(long mod_id, Modulo modulo) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { modulo.getMod_nombre(), modulo.getMod_url(), modulo.getMod_descripcion(), modulo.getMod_estado(), mod_id });
	}

	@Override
	public int delete(long mod_id) {
		return jdbcTemplate.update(DELETE_SQL, mod_id);
	}

}
