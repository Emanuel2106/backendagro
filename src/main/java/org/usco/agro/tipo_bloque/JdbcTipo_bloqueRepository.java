package org.usco.agro.tipo_bloque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcTipo_bloqueRepository implements Tipo_bloqueRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.tipo_bloque"
		+ "(tib_nombre, tib_descripcion, tib_estado)"
		+ "VALUES (?, ?, ?)";

	String READ_SQL = "SELECT tib_id, tib_nombre, tib_descripcion, tib_estado"
		+ " FROM public.tipo_bloque";

	String UPDATE_SQL = "UPDATE public.tipo_bloque"
		+ " SET tib_nombre=?, tib_descripcion=?, tib_estado=?"
		+ " WHERE tib_id=?";

	String DELETE_SQL = "DELETE FROM public.tipo_bloque"
		+ " WHERE tib_id=?";


	@Override
	public int create(Tipo_bloque tipo_bloque) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { tipo_bloque.getTib_nombre(), tipo_bloque.getTib_descripcion(), tipo_bloque.getTib_estado() });
	}

	@Override
	public List<Tipo_bloque> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Tipo_bloque.class));
	}

	@Override
	public int update(long tib_id, Tipo_bloque tipo_bloque) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { tipo_bloque.getTib_nombre(), tipo_bloque.getTib_descripcion(), tipo_bloque.getTib_estado(), tib_id });
	}

	@Override
	public int delete(long tib_id) {
		return jdbcTemplate.update(DELETE_SQL, tib_id);
	}

}
