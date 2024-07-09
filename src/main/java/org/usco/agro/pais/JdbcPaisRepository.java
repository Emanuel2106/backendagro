package org.usco.agro.pais;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcPaisRepository implements PaisRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.pais"
		+ "(pai_nombre, pai_codigo, pai_acronimo)"
		+ "VALUES (?, ?, ?)";

	String READ_SQL = "SELECT pai_id, pai_nombre, pai_codigo, pai_acronimo"
		+ " FROM public.pais";

	String UPDATE_SQL = "UPDATE public.pais"
		+ " SET pai_nombre=?, pai_codigo=?, pai_acronimo=?"
		+ " WHERE pai_id=?";

	String DELETE_SQL = "DELETE FROM public.pais"
		+ " WHERE pai_id=?";


	@Override
	public int create(Pais pais) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { pais.getPai_nombre(), pais.getPai_codigo(), pais.getPai_acronimo() });
	}

	@Override
	public List<Pais> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Pais.class));
	}

	@Override
	public int update(long pai_id, Pais pais) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { pais.getPai_nombre(), pais.getPai_codigo(), pais.getPai_acronimo(), pai_id });
	}

	@Override
	public int delete(long pai_id) {
		return jdbcTemplate.update(DELETE_SQL, pai_id);
	}

}
