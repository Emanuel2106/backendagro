package org.usco.agro.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcUsuarioRepository implements UsuarioRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.usuario"
		+ "(usu_persona_id, usu_email, usu_password, usu_estado)"
		+ "VALUES (?, ?, ?, ?)";

	String READ_SQL = "SELECT usu_id, usu_persona_id, usu_email, usu_password, usu_estado"
		+ " FROM public.usuario";

	String UPDATE_SQL = "UPDATE public.usuario"
		+ " SET usu_persona_id=?, usu_email=?, usu_password=?, usu_estado=?"
		+ " WHERE usu_id=?";

	String DELETE_SQL = "DELETE FROM public.usuario"
		+ " WHERE usu_id=?";


	@Override
	public int create(Usuario usuario) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { usuario.getUsu_persona_id(), usuario.getUsu_email(), usuario.getUsu_password(), usuario.getUsu_estado() });
	}

	@Override
	public List<Usuario> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Usuario.class));
	}

	@Override
	public int update(long usu_id, Usuario usuario) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { usuario.getUsu_persona_id(), usuario.getUsu_email(), usuario.getUsu_password(), usuario.getUsu_estado(), usu_id });
	}

	@Override
	public int delete(long usu_id) {
		return jdbcTemplate.update(DELETE_SQL, usu_id);
	}

}
