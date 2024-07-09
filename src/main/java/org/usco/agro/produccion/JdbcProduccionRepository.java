package org.usco.agro.produccion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcProduccionRepository implements ProduccionRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.produccion"
		+ "(pro_nombre, pro_tipo_produccion_id, pro_descripcion, pro_fecha_inicio, pro_fecha_final, pro_espacio_id, pro_estado)"
		+ "VALUES (?, ?, ?, ?, ?, ?, ?)";

	String READ_SQL = "SELECT pro_id, pro_nombre, pro_tipo_produccion_id, pro_descripcion, pro_fecha_inicio, pro_fecha_final, pro_espacio_id, pro_estado"
		+ " FROM public.produccion";

	String UPDATE_SQL = "UPDATE public.produccion"
		+ " SET pro_nombre=?, pro_tipo_produccion_id=?, pro_descripcion=?, pro_fecha_inicio=?, pro_fecha_final=?, pro_espacio_id=?, pro_estado=?"
		+ " WHERE pro_id=?";

	String DELETE_SQL = "DELETE FROM public.produccion"
		+ " WHERE pro_id=?";


	@Override
	public int create(Produccion produccion) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { produccion.getPro_nombre(), produccion.getPro_tipo_produccion_id(), produccion.getPro_descripcion(), produccion.getPro_fecha_inicio(), produccion.getPro_fecha_final(), produccion.getPro_espacio_id(), produccion.getPro_estado() });
	}

	@Override
	public List<Produccion> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Produccion.class));
	}

	@Override
	public int update(long pro_id, Produccion produccion) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { produccion.getPro_nombre(), produccion.getPro_tipo_produccion_id(), produccion.getPro_descripcion(), produccion.getPro_fecha_inicio(), produccion.getPro_fecha_final(), produccion.getPro_espacio_id(), produccion.getPro_estado(), pro_id });
	}

	@Override
	public int delete(long pro_id) {
		return jdbcTemplate.update(DELETE_SQL, pro_id);
	}

}
