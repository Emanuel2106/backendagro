package org.usco.agro.tipo_espacio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcTipo_espacioRepository implements Tipo_espacioRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.tipo_espacio"
		+ "(tie_nombre, tie_descripcion, tie_estado)"
		+ "VALUES (?, ?, ?)";

	String READ_SQL = "SELECT tie_id, tie_nombre, tie_descripcion, tie_estado"
		+ " FROM public.tipo_espacio";

	String UPDATE_SQL = "UPDATE public.tipo_espacio"
		+ " SET tie_nombre=?, tie_descripcion=?, tie_estado=?"
		+ " WHERE tie_id=?";

	String DELETE_SQL = "DELETE FROM public.tipo_espacio"
		+ " WHERE tie_id=?";


	@Override
	public int create(Tipo_espacio tipo_espacio) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { tipo_espacio.getTie_nombre(), tipo_espacio.getTie_descripcion(), tipo_espacio.getTie_estado() });
	}

	@Override
	public List<Tipo_espacio> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Tipo_espacio.class));
	}

	@Override
	public int update(long tie_id, Tipo_espacio tipo_espacio) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { tipo_espacio.getTie_nombre(), tipo_espacio.getTie_descripcion(), tipo_espacio.getTie_estado(), tie_id });
	}

	@Override
	public int delete(long tie_id) {
		return jdbcTemplate.update(DELETE_SQL, tie_id);
	}

}
