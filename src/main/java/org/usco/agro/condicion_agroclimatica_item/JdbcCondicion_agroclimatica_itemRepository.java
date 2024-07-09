package org.usco.agro.condicion_agroclimatica_item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcCondicion_agroclimatica_itemRepository implements Condicion_agroclimatica_itemRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.condicion_agroclimatica_item"
		+ "(cai_condicion_agroclimatica_id, cai_variable_agroclimatica_id, cai_valor)"
		+ "VALUES (?, ?, ?)";

	String READ_SQL = "SELECT cai_id, cai_condicion_agroclimatica_id, cai_variable_agroclimatica_id, cai_valor"
		+ " FROM public.condicion_agroclimatica_item";

	String UPDATE_SQL = "UPDATE public.condicion_agroclimatica_item"
		+ " SET cai_condicion_agroclimatica_id=?, cai_variable_agroclimatica_id=?, cai_valor=?"
		+ " WHERE cai_id=?";

	String DELETE_SQL = "DELETE FROM public.condicion_agroclimatica_item"
		+ " WHERE cai_id=?";


	@Override
	public int create(Condicion_agroclimatica_item condicion_agroclimatica_item) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { condicion_agroclimatica_item.getCai_condicion_agroclimatica_id(), condicion_agroclimatica_item.getCai_variable_agroclimatica_id(), condicion_agroclimatica_item.getCai_valor() });
	}

	@Override
	public List<Condicion_agroclimatica_item> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Condicion_agroclimatica_item.class));
	}

	@Override
	public int update(long cai_id, Condicion_agroclimatica_item condicion_agroclimatica_item) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { condicion_agroclimatica_item.getCai_condicion_agroclimatica_id(), condicion_agroclimatica_item.getCai_variable_agroclimatica_id(), condicion_agroclimatica_item.getCai_valor(), cai_id });
	}

	@Override
	public int delete(long cai_id) {
		return jdbcTemplate.update(DELETE_SQL, cai_id);
	}

}
