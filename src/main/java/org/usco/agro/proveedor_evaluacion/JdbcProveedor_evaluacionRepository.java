package org.usco.agro.proveedor_evaluacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcProveedor_evaluacionRepository implements Proveedor_evaluacionRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.proveedor_evaluacion"
		+ "(pre_fecha_hora, pre_proveedor_id, pre_evaluacion_id, pre_descripcion, pre_estado)"
		+ "VALUES (?, ?, ?, ?, ?)";

	String READ_SQL = "SELECT pre_id, pre_fecha_hora, pre_proveedor_id, pre_evaluacion_id, pre_descripcion, pre_estado"
		+ " FROM public.proveedor_evaluacion";

	String UPDATE_SQL = "UPDATE public.proveedor_evaluacion"
		+ " SET pre_fecha_hora=?, pre_proveedor_id=?, pre_evaluacion_id=?, pre_descripcion=?, pre_estado=?"
		+ " WHERE pre_id=?";

	String DELETE_SQL = "DELETE FROM public.proveedor_evaluacion"
		+ " WHERE pre_id=?";


	@Override
	public int create(Proveedor_evaluacion proveedor_evaluacion) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { proveedor_evaluacion.getPre_fecha_hora(), proveedor_evaluacion.getPre_proveedor_id(), proveedor_evaluacion.getPre_evaluacion_id(), proveedor_evaluacion.getPre_descripcion(), proveedor_evaluacion.getPre_estado() });
	}

	@Override
	public List<Proveedor_evaluacion> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Proveedor_evaluacion.class));
	}

	@Override
	public int update(long pre_id, Proveedor_evaluacion proveedor_evaluacion) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { proveedor_evaluacion.getPre_fecha_hora(), proveedor_evaluacion.getPre_proveedor_id(), proveedor_evaluacion.getPre_evaluacion_id(), proveedor_evaluacion.getPre_descripcion(), proveedor_evaluacion.getPre_estado(), pre_id });
	}

	@Override
	public int delete(long pre_id) {
		return jdbcTemplate.update(DELETE_SQL, pre_id);
	}

}
