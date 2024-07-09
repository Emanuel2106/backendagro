package org.usco.agro.municipio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcMunicipioRepository implements MunicipioRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.municipio"
		+ "(mun_nombre, mun_departamento_id, mun_codigo, mun_acronimo)"
		+ "VALUES (?, ?, ?, ?)";

	String READ_SQL = "SELECT mun_id, mun_nombre, mun_departamento_id, mun_codigo, mun_acronimo"
		+ " FROM public.municipio";

	String UPDATE_SQL = "UPDATE public.municipio"
		+ " SET mun_nombre=?, mun_departamento_id=?, mun_codigo=?, mun_acronimo=?"
		+ " WHERE mun_id=?";

	String DELETE_SQL = "DELETE FROM public.municipio"
		+ " WHERE mun_id=?";


	@Override
	public int create(Municipio municipio) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { municipio.getMun_nombre(), municipio.getMun_departamento_id(), municipio.getMun_codigo(), municipio.getMun_acronimo() });
	}

	@Override
	public List<Municipio> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Municipio.class));
	}

	@Override
	public int update(long mun_id, Municipio municipio) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { municipio.getMun_nombre(), municipio.getMun_departamento_id(), municipio.getMun_codigo(), municipio.getMun_acronimo(), mun_id});
	}

	@Override
	public int delete(long mun_id) {
		return jdbcTemplate.update(DELETE_SQL, mun_id);
	}

}
