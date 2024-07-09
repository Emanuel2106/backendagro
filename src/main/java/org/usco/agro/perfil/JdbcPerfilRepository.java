package org.usco.agro.perfil;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcPerfilRepository implements PerfilRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.perfil"
		+ "(per_nombre, per_descripcion, per_estado)"
		+ "VALUES (?, ?, ?)";

	String READ_SQL = "SELECT per_id, per_nombre, per_descripcion, per_estado"
		+ " FROM public.perfil";

	String UPDATE_SQL = "UPDATE public.perfil"
		+ " SET per_nombre=?, per_descripcion=?, per_estado=?"
		+ " WHERE per_id=?";

	String DELETE_SQL = "DELETE FROM public.perfil"
		+ " WHERE per_id=?";


	@Override
	public int create(Perfil perfil) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { perfil.getPer_nombre(), perfil.getPer_descripcion(), perfil.getPer_estado() });
	}

	@Override
	public List<Perfil> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Perfil.class));
	}

	@Override
	public int update(long per_id, Perfil perfil) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { perfil.getPer_nombre(), perfil.getPer_descripcion(), perfil.getPer_estado(), per_id });
	}

	@Override
	public int delete(long per_id) {
		return jdbcTemplate.update(DELETE_SQL, per_id);
	}

}
