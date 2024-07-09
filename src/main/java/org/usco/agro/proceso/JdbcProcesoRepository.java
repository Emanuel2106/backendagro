package org.usco.agro.proceso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcProcesoRepository implements ProcesoRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.proceso"
		+ "(pro_tipo_produccion_id, pro_nombre, pro_descripcion, pro_estado)"
		+ "VALUES (?, ?, ?, ?)";

	String READ_SQL = "SELECT pro_id, pro_tipo_produccion_id, pro_nombre, pro_descripcion, pro_estado"
		+ " FROM public.proceso";

	String UPDATE_SQL = "UPDATE public.proceso"
		+ " SET pro_tipo_produccion_id=?, pro_nombre=?, pro_descripcion=?, pro_estado=?"
		+ " WHERE pro_id=?";

	String DELETE_SQL = "DELETE FROM public.proceso"
		+ " WHERE pro_id=?";


	@Override
	public int create(Proceso proceso) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { proceso.getPro_tipo_produccion_id(), proceso.getPro_nombre(), proceso.getPro_descripcion(), proceso.getPro_estado() });
	}

	@Override
	public List<Proceso> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Proceso.class));
	}

	@Override
	public int update(long pro_id, Proceso proceso) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { proceso.getPro_tipo_produccion_id(), proceso.getPro_nombre(), proceso.getPro_descripcion(), proceso.getPro_estado(), pro_id });
	}

	@Override
	public int delete(long pro_id) {
		return jdbcTemplate.update(DELETE_SQL, pro_id);
	}

}
