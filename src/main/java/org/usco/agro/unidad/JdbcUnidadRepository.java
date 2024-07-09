package org.usco.agro.unidad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcUnidadRepository implements UnidadRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.unidad"
		+ "(uni_nombre, uni_descripcion, uni_estado)"
		+ "VALUES (?, ?, ?)";

	String READ_SQL = "SELECT uni_id, uni_nombre, uni_descripcion, uni_estado"
		+ " FROM public.unidad";

	String UPDATE_SQL = "UPDATE public.unidad"
		+ " SET uni_nombre=?, uni_descripcion=?, uni_estado=?"
		+ " WHERE uni_id=?";

	String DELETE_SQL = "DELETE FROM public.unidad"
		+ " WHERE uni_id=?";


	@Override
	public int create(Unidad unidad) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { unidad.getUni_nombre(), unidad.getUni_descripcion(), unidad.getUni_estado() });
	}

	@Override
	public List<Unidad> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Unidad.class));
	}

	@Override
	public int update(long uni_id, Unidad unidad) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { unidad.getUni_nombre(), unidad.getUni_descripcion(), unidad.getUni_estado(), uni_id });
	}

	@Override
	public int delete(long uni_id) {
		return jdbcTemplate.update(DELETE_SQL, uni_id);
	}

}
