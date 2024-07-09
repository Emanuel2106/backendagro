package org.usco.agro.presentacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcPresentacionRepository implements PresentacionRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.presentacion"
		+ "(pre_nombre, pre_descripcion, pre_estado)"
		+ "VALUES (?, ?, ?)";

	String READ_SQL = "SELECT pre_id, pre_nombre, pre_descripcion, pre_estado"
		+ " FROM public.presentacion";

	String UPDATE_SQL = "UPDATE public.presentacion"
		+ " SET pre_nombre=?, pre_descripcion=?, pre_estado=?"
		+ " WHERE pre_id=?";

	String DELETE_SQL = "DELETE FROM public.presentacion"
		+ " WHERE pre_id=?";


	@Override
	public int create(Presentacion presentacion) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { presentacion.getPre_nombre(), presentacion.getPre_descripcion(), presentacion.getPre_estado() });
	}

	@Override
	public List<Presentacion> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Presentacion.class));
	}

	@Override
	public int update(long pre_id, Presentacion presentacion) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { presentacion.getPre_nombre(), presentacion.getPre_descripcion(), presentacion.getPre_estado(), pre_id });
	}

	@Override
	public int delete(long pre_id) {
		return jdbcTemplate.update(DELETE_SQL, pre_id);
	}

}
