package org.usco.agro.tipo_movimiento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcTipo_movimientoRepository implements Tipo_movimientoRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.tipo_movimiento"
		+ "(tim_nombre, tim_descripcion, tim_estado)"
		+ "VALUES (?, ?, ?)";

	String READ_SQL = "SELECT tim_id, tim_nombre, tim_descripcion, tim_estado"
		+ " FROM public.tipo_movimiento";

	String UPDATE_SQL = "UPDATE public.tipo_movimiento"
		+ " SET tim_nombre=?, tim_descripcion=?, tim_estado=?"
		+ " WHERE tim_id=?";

	String DELETE_SQL = "DELETE FROM public.tipo_movimiento"
		+ " WHERE tim_id=?";


	@Override
	public int create(Tipo_movimiento tipo_movimiento) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { tipo_movimiento.getTim_nombre(), tipo_movimiento.getTim_descripcion(), tipo_movimiento.getTim_estado() });
	}

	@Override
	public List<Tipo_movimiento> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Tipo_movimiento.class));
	}

	@Override
	public int update(long tim_id, Tipo_movimiento tipo_movimiento) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { tipo_movimiento.getTim_nombre(), tipo_movimiento.getTim_descripcion(), tipo_movimiento.getTim_estado(), tim_id });
	}

	@Override
	public int delete(long tim_id) {
		return jdbcTemplate.update(DELETE_SQL, tim_id);
	}

}
