package org.usco.agro.usuario_perfil;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcUsuario_perfilRepository implements Usuario_perfilRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.usuario_perfil"
		+ "(usp_usuario_id, usp_perfil_id, usp_estado)"
		+ "VALUES (?, ?, ?)";

	String READ_SQL = "SELECT usp_id, usp_usuario_id, usp_perfil_id, usp_estado"
		+ " FROM public.usuario_perfil";

	String UPDATE_SQL = "UPDATE public.usuario_perfil"
		+ " SET usp_usuario_id=?, usp_perfil_id=?, usp_estado=?"
		+ " WHERE usp_id=?";

	String DELETE_SQL = "DELETE FROM public.usuario_perfil"
		+ " WHERE usp_id=?";


	@Override
	public int create(Usuario_perfil usuario_perfil) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { usuario_perfil.getUsp_usuario_id(), usuario_perfil.getUsp_perfil_id(), usuario_perfil.getUsp_estado() });
	}

	@Override
	public List<Usuario_perfil> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Usuario_perfil.class));
	}

	@Override
	public int update(long usp_id, Usuario_perfil usuario_perfil) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { usuario_perfil.getUsp_usuario_id(), usuario_perfil.getUsp_perfil_id(), usuario_perfil.getUsp_estado(), usp_id });
	}

	@Override
	public int delete(long usp_id) {
		return jdbcTemplate.update(DELETE_SQL, usp_id);
	}

}
