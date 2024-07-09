package org.usco.agro.tipo_identificacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcTipo_identificacionRepository implements Tipo_identificacionRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.tipo_identificacion"
		+ "(tii_nombre, tii_descripcion, tii_estado)"
		+ "VALUES (?, ?, ?)";

	String READ_SQL = "SELECT tii_id, tii_nombre, tii_descripcion, tii_estado"
		+ " FROM public.tipo_identificacion";

	String UPDATE_SQL = "UPDATE public.tipo_identificacion"
		+ " SET tii_nombre=?, tii_descripcion=?, tii_estado=?"
		+ " WHERE tii_id=?";

	String DELETE_SQL = "DELETE FROM public.tipo_identificacion"
		+ " WHERE tii_id=?";


	@Override
	public int create(Tipo_identificacion tipo_identificacion) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { tipo_identificacion.getTii_nombre(), tipo_identificacion.getTii_descripcion(), tipo_identificacion.getTii_estado() });
	}

	@Override
	public List<Tipo_identificacion> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Tipo_identificacion.class));
	}

	@Override
	public int update(long tii_id, Tipo_identificacion tipo_identificacion) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { tipo_identificacion.getTii_nombre(), tipo_identificacion.getTii_descripcion(), tipo_identificacion.getTii_estado(), tii_id });
	}

	@Override
	public int delete(long tii_id) {
		return jdbcTemplate.update(DELETE_SQL, tii_id);
	}

}
