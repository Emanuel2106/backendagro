package org.usco.agro.departamento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcDepartamentoRepository implements DepartamentoRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.departamento"
		+ "(dep_nombre, dep_pais_id, dep_codigo, dep_acronimo)"
		+ "VALUES (?, ?, ?, ?)";

	String READ_SQL = "SELECT dep_id, dep_nombre, dep_pais_id, dep_codigo, dep_acronimo"
		+ " FROM public.departamento";

	String UPDATE_SQL = "UPDATE public.departamento"
		+ " SET dep_nombre=?, dep_pais_id=?, dep_codigo=?, dep_acronimo=?"
		+ " WHERE dep_id=?";

	String DELETE_SQL = "DELETE FROM public.departamento"
		+ " WHERE dep_id=?";


	@Override
	public int create(Departamento departamento) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { departamento.getDep_nombre(), departamento.getDep_pais_id(), departamento.getDep_codigo(), departamento.getDep_acronimo() });
	}

	@Override
	public List<Departamento> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Departamento.class));
	}

	@Override
	public int update(long dep_id, Departamento departamento) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { departamento.getDep_nombre(), departamento.getDep_pais_id(), departamento.getDep_codigo(), departamento.getDep_acronimo(), dep_id });
	}

	@Override
	public int delete(long dep_id) {
		return jdbcTemplate.update(DELETE_SQL, dep_id);
	}

}
