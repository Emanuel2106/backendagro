package org.usco.agro.sesion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcSesionRepository implements SesionRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.sesion"
		+ "(ses_usuario_id, ses_fecha_hora_start, ses_fecha_hora_end, ses_direccion_ip, ses_estado)"
		+ "VALUES (?, ?, ?, ?, ?)";

	String READ_SQL = "SELECT ses_id, ses_usuario_id, ses_fecha_hora_start, ses_fecha_hora_end, ses_direccion_ip, ses_estado"
		+ " FROM public.sesion";

	String UPDATE_SQL = "UPDATE public.sesion"
		+ " SET ses_usuario_id=?, ses_fecha_hora_start=?, ses_fecha_hora_end=?, ses_direccion_ip=?, ses_estado=?"
		+ " WHERE ses_id=?";

	String DELETE_SQL = "DELETE FROM public.sesion"
		+ " WHERE ses_id=?";


	@Override
	public int create(Sesion sesion) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { sesion.getSes_usuario_id(), sesion.getSes_fecha_hora_start(), sesion.getSes_fecha_hora_end(), sesion.getSes_direccion_ip(), sesion.getSes_estado() });
	}

	@Override
	public List<Sesion> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Sesion.class));
	}

	@Override
	public int update(long ses_id, Sesion sesion) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { sesion.getSes_usuario_id(), sesion.getSes_fecha_hora_start(), sesion.getSes_fecha_hora_end(), sesion.getSes_direccion_ip(), sesion.getSes_estado(), ses_id });
	}

	@Override
	public int delete(long ses_id) {
		return jdbcTemplate.update(DELETE_SQL, ses_id);
	}

}
