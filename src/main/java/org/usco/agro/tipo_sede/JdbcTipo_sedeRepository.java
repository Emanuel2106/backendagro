package org.usco.agro.tipo_sede;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcTipo_sedeRepository implements Tipo_sedeRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.tipo_sede"
		+ "(tis_nombre, tis_descripcion, tis_estado)"
		+ "VALUES (?, ?, ?)";

	String READ_SQL = "SELECT tis_id, tis_nombre, tis_descripcion, tis_estado"
		+ " FROM public.tipo_sede";

	String UPDATE_SQL = "UPDATE public.tipo_sede"
		+ " SET tis_nombre=?, tis_descripcion=?, tis_estado=?"
		+ " WHERE tis_id=?";

	String DELETE_SQL = "DELETE FROM public.tipo_sede"
		+ " WHERE tis_id=?";


	@Override
	public int create(Tipo_sede tipo_sede) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { tipo_sede.getTis_nombre(), tipo_sede.getTis_descripcion(), tipo_sede.getTis_estado() });
	}

	@Override
	public List<Tipo_sede> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Tipo_sede.class));
	}

	@Override
	public int update(long tis_id, Tipo_sede tipo_sede) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { tipo_sede.getTis_nombre(), tipo_sede.getTis_descripcion(), tipo_sede.getTis_estado(), tis_id });
	}

	@Override
	public int delete(long tis_id) {
		return jdbcTemplate.update(DELETE_SQL, tis_id);
	}

}
