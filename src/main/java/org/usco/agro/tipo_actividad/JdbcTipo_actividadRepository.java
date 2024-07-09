package org.usco.agro.tipo_actividad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcTipo_actividadRepository implements Tipo_actividadRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.tipo_actividad"
		+ "(tia_categoria_actividad_id, tia_proceso_id, tia_nombre, tia_descripcion, tia_estado)"
		+ "VALUES (?, ?, ?, ?, ?)";

	String READ_SQL = "SELECT tia_id, tia_categoria_actividad_id, tia_proceso_id, tia_nombre, tia_descripcion, tia_estado"
		+ " FROM public.tipo_actividad";

	String UPDATE_SQL = "UPDATE public.tipo_actividad"
		+ " SET tia_categoria_actividad_id=?, tia_proceso_id=?, tia_nombre=?, tia_descripcion=?, tia_estado=?"
		+ " WHERE tia_id=?";

	String DELETE_SQL = "DELETE FROM public.tipo_actividad"
		+ " WHERE tia_id=?";


	@Override
	public int create(Tipo_actividad tipo_actividad) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { tipo_actividad.getTia_categoria_actividad_id(), tipo_actividad.getTia_proceso_id(), tipo_actividad.getTia_nombre(), tipo_actividad.getTia_descripcion(), tipo_actividad.getTia_estado() });
	}

	@Override
	public List<Tipo_actividad> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Tipo_actividad.class));
	}

	@Override
	public int update(long tia_id, Tipo_actividad tipo_actividad) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { tipo_actividad.getTia_categoria_actividad_id(), tipo_actividad.getTia_proceso_id(), tipo_actividad.getTia_nombre(), tipo_actividad.getTia_descripcion(), tipo_actividad.getTia_estado(), tia_id });
	}

	@Override
	public int delete(long tia_id) {
		return jdbcTemplate.update(DELETE_SQL, tia_id);
	}

}
