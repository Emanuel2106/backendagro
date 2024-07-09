package org.usco.agro.grupo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcGrupoRepository implements GrupoRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.grupo"
		+ "(gru_nombre, gru_empresa_id, gru_descripcion, gru_estado)"
		+ "VALUES (?, ?, ?, ?)";

	String READ_SQL = "SELECT gru_id, gru_nombre, gru_empresa_id, gru_descripcion, gru_estado"
		+ " FROM public.grupo";

	String UPDATE_SQL = "UPDATE public.grupo"
		+ " SET gru_nombre=?, gru_empresa_id=?, gru_descripcion=?, gru_estado=?"
		+ " WHERE gru_id=?";

	String DELETE_SQL = "DELETE FROM public.grupo"
		+ " WHERE gru_id=?";


	@Override
	public int create(Grupo grupo) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { grupo.getGru_nombre(), grupo.getGru_empresa_id(), grupo.getGru_descripcion(), grupo.getGru_estado() });
	}

	@Override
	public List<Grupo> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Grupo.class));
	}

	@Override
	public int update(long gru_id, Grupo grupo) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { grupo.getGru_nombre(), grupo.getGru_empresa_id(), grupo.getGru_descripcion(), grupo.getGru_estado(), gru_id });
	}

	@Override
	public int delete(long gru_id) {
		return jdbcTemplate.update(DELETE_SQL, gru_id);
	}

}
