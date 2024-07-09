package org.usco.agro.costo_indirecto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcCosto_indirectoRepository implements Costo_indirectoRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.costo_indirecto"
		+ "(coi_espacio_id, coi_tipo_costo_indirecto_id, coi_fecha_inicio, coi_fecha_fin, coi_nombre, coi_precio, coi_descripcion, coi_estado)"
		+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

	String READ_SQL = "SELECT coi_id, coi_espacio_id, coi_tipo_costo_indirecto_id, coi_fecha_inicio, coi_fecha_fin, coi_nombre, coi_precio, coi_descripcion, coi_estado"
		+ " FROM public.costo_indirecto";

	String UPDATE_SQL = "UPDATE public.costo_indirecto"
		+ " SET coi_espacio_id=?, coi_tipo_costo_indirecto_id=?, coi_fecha_inicio=?, coi_fecha_fin=?, coi_nombre=?, coi_precio=?, coi_descripcion=?, coi_estado=?"
		+ " WHERE coi_id=?";

	String DELETE_SQL = "DELETE FROM public.costo_indirecto"
		+ " WHERE coi_id=?";


	@Override
	public int create(Costo_indirecto costo_indirecto) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { costo_indirecto.getCoi_espacio_id(), costo_indirecto.getCoi_tipo_costo_indirecto_id(), costo_indirecto.getCoi_fecha_inicio(), costo_indirecto.getCoi_fecha_fin(), costo_indirecto.getCoi_nombre(), costo_indirecto.getCoi_precio(), costo_indirecto.getCoi_descripcion(), costo_indirecto.getCoi_estado() });
	}

	@Override
	public List<Costo_indirecto> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Costo_indirecto.class));
	}

	@Override
	public int update(long coi_id, Costo_indirecto costo_indirecto) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { costo_indirecto.getCoi_espacio_id(), costo_indirecto.getCoi_tipo_costo_indirecto_id(), costo_indirecto.getCoi_fecha_inicio(), costo_indirecto.getCoi_fecha_fin(), costo_indirecto.getCoi_nombre(), costo_indirecto.getCoi_precio(), costo_indirecto.getCoi_descripcion(), costo_indirecto.getCoi_estado(), coi_id });
	}

	@Override
	public int delete(long coi_id) {
		return jdbcTemplate.update(DELETE_SQL, coi_id);
	}

}
