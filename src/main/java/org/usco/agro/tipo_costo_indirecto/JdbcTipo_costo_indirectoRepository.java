package org.usco.agro.tipo_costo_indirecto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcTipo_costo_indirectoRepository implements Tipo_costo_indirectoRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.tipo_costo_indirecto"
		+ "(tci_nombre, tci_descripcion, tci_estado)"
		+ "VALUES (?, ?, ?)";

	String READ_SQL = "SELECT tci_id, tci_nombre, tci_descripcion, tci_estado"
		+ " FROM public.tipo_costo_indirecto";

	String UPDATE_SQL = "UPDATE public.tipo_costo_indirecto"
		+ " SET tci_nombre=?, tci_descripcion=?, tci_estado=?"
		+ " WHERE tci_id=?";

	String DELETE_SQL = "DELETE FROM public.tipo_costo_indirecto"
		+ " WHERE tci_id=?";


	@Override
	public int create(Tipo_costo_indirecto tipo_costo_indirecto) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { tipo_costo_indirecto.getTci_nombre(), tipo_costo_indirecto.getTci_descripcion(), tipo_costo_indirecto.getTci_estado() });
	}

	@Override
	public List<Tipo_costo_indirecto> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Tipo_costo_indirecto.class));
	}

	@Override
	public int update(long tci_id, Tipo_costo_indirecto tipo_costo_indirecto) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { tipo_costo_indirecto.getTci_nombre(), tipo_costo_indirecto.getTci_descripcion(), tipo_costo_indirecto.getTci_estado(), tci_id });
	}

	@Override
	public int delete(long tci_id) {
		return jdbcTemplate.update(DELETE_SQL, tci_id);
	}

}
