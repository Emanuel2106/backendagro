package org.usco.agro.espacio_ocupacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcEspacio_ocupacionRepository implements Espacio_ocupacionRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.espacio_ocupacion"
		+ "(eso_espacio_id, eso_actividad_ocupacion_id, eso_fecha_inicio, eso_fecha_fin, eso_estado)"
		+ "VALUES (?, ?, ?, ?, ?)";

	String READ_SQL = "SELECT eso_id, eso_espacio_id, eso_actividad_ocupacion_id, eso_fecha_inicio, eso_fecha_fin, eso_estado"
		+ " FROM public.espacio_ocupacion";

	String UPDATE_SQL = "UPDATE public.espacio_ocupacion"
		+ " SET eso_espacio_id=?, eso_actividad_ocupacion_id=?, eso_fecha_inicio=?, eso_fecha_fin=?, eso_estado=?"
		+ " WHERE eso_id=?";

	String DELETE_SQL = "DELETE FROM public.espacio_ocupacion"
		+ " WHERE eso_id=?";


	@Override
	public int create(Espacio_ocupacion espacio_ocupacion) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { espacio_ocupacion.getEso_espacio_id(), espacio_ocupacion.getEso_actividad_ocupacion_id(), espacio_ocupacion.getEso_fecha_inicio(), espacio_ocupacion.getEso_fecha_fin(), espacio_ocupacion.getEso_estado() });
	}

	@Override
	public List<Espacio_ocupacion> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Espacio_ocupacion.class));
	}

	@Override
	public int update(long eso_id, Espacio_ocupacion espacio_ocupacion) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { espacio_ocupacion.getEso_espacio_id(), espacio_ocupacion.getEso_actividad_ocupacion_id(), espacio_ocupacion.getEso_fecha_inicio(), espacio_ocupacion.getEso_fecha_fin(), espacio_ocupacion.getEso_estado(), eso_id });
	}

	@Override
	public int delete(long eso_id) {
		return jdbcTemplate.update(DELETE_SQL, eso_id);
	}

}
