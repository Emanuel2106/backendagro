package org.usco.agro.categoria_actividad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcCategoria_actividadRepository implements Categoria_actividadRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.categoria_actividad"
		+ "(caa_nombre, caa_descripcion, caa_estado)"
		+ "VALUES (?, ?, ?)";

	String READ_SQL = "SELECT caa_id, caa_nombre, caa_descripcion, caa_estado"
		+ " FROM public.categoria_actividad";

	String UPDATE_SQL = "UPDATE public.categoria_actividad"
		+ " SET caa_nombre=?, caa_descripcion=?, caa_estado=?"
		+ " WHERE caa_id=?";

	String DELETE_SQL = "DELETE FROM public.categoria_actividad"
		+ " WHERE caa_id=?";


	@Override
	public int create(Categoria_actividad categoria_actividad) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { categoria_actividad.getCaa_nombre(), categoria_actividad.getCaa_descripcion(), categoria_actividad.getCaa_estado() });
	}

	@Override
	public List<Categoria_actividad> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Categoria_actividad.class));
	}

	@Override
	public int update(long caa_id, Categoria_actividad categoria_actividad) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { categoria_actividad.getCaa_nombre(), categoria_actividad.getCaa_descripcion(), categoria_actividad.getCaa_estado(), caa_id });
	}

	@Override
	public int delete(long caa_id) {
		return jdbcTemplate.update(DELETE_SQL, caa_id);
	}

}
