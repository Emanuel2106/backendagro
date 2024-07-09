package org.usco.agro.variable_agroclimatica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcVariable_agroclimaticaRepository implements Variable_agroclimaticaRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.variable_agroclimatica"
		+ "(vaa_nombre, vaa_unidad, vaa_descripcion, vaa_estado)"
		+ "VALUES (?, ?, ?, ?)";

	String READ_SQL = "SELECT vaa_id, vaa_nombre, vaa_unidad, vaa_descripcion, vaa_estado"
		+ " FROM public.variable_agroclimatica";

	String UPDATE_SQL = "UPDATE public.variable_agroclimatica"
		+ " SET vaa_nombre=?, vaa_unidad=?, vaa_descripcion=?, vaa_estado=?"
		+ " WHERE vaa_id=?";

	String DELETE_SQL = "DELETE FROM public.variable_agroclimatica"
		+ " WHERE vaa_id=?";


	@Override
	public int create(Variable_agroclimatica variable_agroclimatica) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { variable_agroclimatica.getVaa_nombre(), variable_agroclimatica.getVaa_unidad(), variable_agroclimatica.getVaa_descripcion(), variable_agroclimatica.getVaa_estado() });
	}

	@Override
	public List<Variable_agroclimatica> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Variable_agroclimatica.class));
	}

	@Override
	public int update(long vaa_id, Variable_agroclimatica variable_agroclimatica) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { variable_agroclimatica.getVaa_nombre(), variable_agroclimatica.getVaa_unidad(), variable_agroclimatica.getVaa_descripcion(), variable_agroclimatica.getVaa_estado(), vaa_id });
	}

	@Override
	public int delete(long vaa_id) {
		return jdbcTemplate.update(DELETE_SQL, vaa_id);
	}

}
