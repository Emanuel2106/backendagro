package org.usco.agro.condicion_agroclimatica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcCondicion_agroclimaticaRepository implements Condicion_agroclimaticaRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.condicion_agroclimatica"
		+ "(coa_espacio_id, coa_fecha, coa_descripcion, coa_estado)"
		+ "VALUES (?, ?, ?, ?)";

	String READ_SQL = "SELECT coa_id, coa_espacio_id, coa_fecha, coa_descripcion, coa_estado"
		+ " FROM public.condicion_agroclimatica";

	String UPDATE_SQL = "UPDATE public.condicion_agroclimatica"
		+ " SET coa_espacio_id=?, coa_fecha=?, coa_descripcion=?, coa_estado=?"
		+ " WHERE coa_id=?";

	String DELETE_SQL = "DELETE FROM public.condicion_agroclimatica"
		+ " WHERE coa_id=?";


	@Override
	public int create(Condicion_agroclimatica condicion_agroclimatica) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { condicion_agroclimatica.getCoa_espacio_id(), condicion_agroclimatica.getCoa_fecha(), condicion_agroclimatica.getCoa_descripcion(), condicion_agroclimatica.getCoa_estado() });
	}

	@Override
	public List<Condicion_agroclimatica> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Condicion_agroclimatica.class));
	}

	@Override
	public int update(long coa_id, Condicion_agroclimatica condicion_agroclimatica) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { condicion_agroclimatica.getCoa_espacio_id(), condicion_agroclimatica.getCoa_fecha(), condicion_agroclimatica.getCoa_descripcion(), condicion_agroclimatica.getCoa_estado(), coa_id });
	}

	@Override
	public int delete(long coa_id) {
		return jdbcTemplate.update(DELETE_SQL, coa_id);
	}

}
