package org.usco.agro.kardex;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcKardexRepository implements KardexRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.kardex"
		+ "(kar_fecha_hora, kar_almacen_id, kar_produccion_id, kar_tipo_movimiento_id, kar_descripcion, kar_estado)"
		+ "VALUES (?, ?, ?, ?, ?, ?, ?)";

	String READ_SQL = "SELECT kar_id, kar_fecha_hora, kar_almacen_id, kar_produccion_id, kar_tipo_movimiento_id, kar_descripcion, kar_estado"
		+ " FROM public.kardex";

	String UPDATE_SQL = "UPDATE public.kardex"
		+ " SET kar_fecha_hora=?, kar_almacen_id=?, kar_produccion_id=?, kar_tipo_movimiento_id=?, kar_descripcion=?, kar_estado=?"
		+ " WHERE kar_id=?";

	String DELETE_SQL = "DELETE FROM public.kardex"
		+ " WHERE kar_id=?";


	@Override
	public int create(Kardex kardex) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { kardex.getKar_fecha_hora(), kardex.getKar_almacen_id(), kardex.getKar_produccion_id(), kardex.getKar_tipo_movimiento_id(), kardex.getKar_descripcion(), kardex.getKar_estado() });
	}

	@Override
	public List<Kardex> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Kardex.class));
	}

	@Override
	public int update(long kar_id, Kardex kardex) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { kardex.getKar_fecha_hora(), kardex.getKar_almacen_id(), kardex.getKar_produccion_id(), kardex.getKar_tipo_movimiento_id(), kardex.getKar_descripcion(), kardex.getKar_estado(), kar_id });
	}

	@Override
	public int delete(long kar_id) {
		return jdbcTemplate.update(DELETE_SQL, kar_id);
	}

}
