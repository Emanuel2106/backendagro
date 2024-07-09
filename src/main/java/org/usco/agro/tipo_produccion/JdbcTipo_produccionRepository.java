package org.usco.agro.tipo_produccion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcTipo_produccionRepository implements Tipo_produccionRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.tipo_produccion"
		+ "(tip_nombre, tip_descripcion, tip_estado)"
		+ "VALUES (?, ?, ?)";

	String READ_SQL = "SELECT tip_id, tip_nombre, tip_descripcion, tip_estado"
		+ " FROM public.tipo_produccion";

	String UPDATE_SQL = "UPDATE public.tipo_produccion"
		+ " SET tip_nombre=?, tip_descripcion=?, tip_estado=?"
		+ " WHERE tip_id=?";

	String DELETE_SQL = "DELETE FROM public.tipo_produccion"
		+ " WHERE tip_id=?";


	@Override
	public int create(Tipo_produccion tipo_produccion) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { tipo_produccion.getTip_nombre(), tipo_produccion.getTip_descripcion(), tipo_produccion.getTip_estado() });
	}

	@Override
	public List<Tipo_produccion> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Tipo_produccion.class));
	}

	@Override
	public int update(long tip_id, Tipo_produccion tipo_produccion) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { tipo_produccion.getTip_nombre(), tipo_produccion.getTip_descripcion(), tipo_produccion.getTip_estado(), tip_id });
	}

	@Override
	public int delete(long tip_id) {
		return jdbcTemplate.update(DELETE_SQL, tip_id);
	}

}
