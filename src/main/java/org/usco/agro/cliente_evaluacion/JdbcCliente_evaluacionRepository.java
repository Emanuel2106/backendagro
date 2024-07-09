package org.usco.agro.cliente_evaluacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcCliente_evaluacionRepository implements Cliente_evaluacionRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.cliente_evaluacion"
		+ "(cle_fecha, cle_persona_id, cle_evaluacion_id, cle_descripcion, cle_estado)"
		+ "VALUES (?, ?, ?, ?, ?)";

	String READ_SQL = "SELECT cle_id, cle_fecha, cle_persona_id, cle_evaluacion_id, cle_descripcion, cle_estado"
		+ " FROM public.cliente_evaluacion";

	String UPDATE_SQL = "UPDATE public.cliente_evaluacion"
		+ " SET cle_fecha=?, cle_persona_id=?, cle_evaluacion_id=?, cle_descripcion=?, cle_estado=?"
		+ " WHERE cle_id=?";

	String DELETE_SQL = "DELETE FROM public.cliente_evaluacion"
		+ " WHERE cle_id=?";


	@Override
	public int create(Cliente_evaluacion cliente_evaluacion) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { cliente_evaluacion.getCle_fecha(), cliente_evaluacion.getCle_persona_id(), cliente_evaluacion.getCle_evaluacion_id(), cliente_evaluacion.getCle_descripcion(), cliente_evaluacion.getCle_estado() });
	}

	@Override
	public List<Cliente_evaluacion> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Cliente_evaluacion.class));
	}

	@Override
	public int update(long cle_id, Cliente_evaluacion cliente_evaluacion) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { cliente_evaluacion.getCle_fecha(), cliente_evaluacion.getCle_persona_id(), cliente_evaluacion.getCle_evaluacion_id(), cliente_evaluacion.getCle_descripcion(), cliente_evaluacion.getCle_estado(), cle_id });
	}

	@Override
	public int delete(long cle_id) {
		return jdbcTemplate.update(DELETE_SQL, cle_id);
	}

}
