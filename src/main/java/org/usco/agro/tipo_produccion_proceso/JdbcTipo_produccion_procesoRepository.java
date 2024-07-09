package org.usco.agro.tipo_produccion_proceso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcTipo_produccion_procesoRepository implements Tipo_produccion_procesoRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.tipo_produccion_proceso"
		+ "(tpp_tipo_produccion_id, tpp_proceso_id, tpp_descripcion, tpp_estado)"
		+ "VALUES (?, ?, ?, ?)";

	String READ_SQL = "SELECT tpp_id, tpp_tipo_produccion_id, tpp_proceso_id, tpp_descripcion, tpp_estado"
		+ " FROM public.tipo_produccion_proceso";

	String UPDATE_SQL = "UPDATE public.tipo_produccion_proceso"
		+ " SET tpp_tipo_produccion_id=?, tpp_proceso_id=?, tpp_descripcion=?, tpp_estado=?"
		+ " WHERE tpp_id=?";

	String DELETE_SQL = "DELETE FROM public.tipo_produccion_proceso"
		+ " WHERE tpp_id=?";


	@Override
	public int create(Tipo_produccion_proceso tipo_produccion_proceso) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { tipo_produccion_proceso.getTpp_tipo_produccion_id(), tipo_produccion_proceso.getTpp_proceso_id(), tipo_produccion_proceso.getTpp_descripcion(), tipo_produccion_proceso.getTpp_estado() });
	}

	@Override
	public List<Tipo_produccion_proceso> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Tipo_produccion_proceso.class));
	}

	@Override
	public int update(long tpp_id, Tipo_produccion_proceso tipo_produccion_proceso) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { tipo_produccion_proceso.getTpp_tipo_produccion_id(), tipo_produccion_proceso.getTpp_proceso_id(), tipo_produccion_proceso.getTpp_descripcion(), tipo_produccion_proceso.getTpp_estado(), tpp_id });
	}

	@Override
	public int delete(long tpp_id) {
		return jdbcTemplate.update(DELETE_SQL, tpp_id);
	}

}
