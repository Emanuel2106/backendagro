package org.usco.agro.empresa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcEmpresaRepository implements EmpresaRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.empresa"
		+ "(emp_tipo_identificacion_id, emp_identificacion, emp_nombre, emp_persona_id, emp_descripcion, emp_estado)"
		+ "VALUES (?, ?, ?, ?, ?, ?)";

	String READ_SQL = "SELECT emp_id, emp_tipo_identificacion_id, emp_identificacion, emp_nombre, emp_persona_id, emp_descripcion, emp_estado"
		+ " FROM public.empresa";

	String UPDATE_SQL = "UPDATE public.empresa"
		+ " SET emp_tipo_identificacion_id=?, emp_identificacion=?, emp_nombre=?, emp_persona_id=?, emp_descripcion=?, emp_estado=?"
		+ " WHERE emp_id=?";

	String DELETE_SQL = "DELETE FROM public.empresa"
		+ " WHERE emp_id=?";


	@Override
	public int create(Empresa empresa) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { empresa.getEmp_tipo_identificacion_id(), empresa.getEmp_identificacion(), empresa.getEmp_nombre(), empresa.getEmp_persona_id(), empresa.getEmp_descripcion(), empresa.getEmp_estado() });
	}

	@Override
	public List<Empresa> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Empresa.class));
	}

	@Override
	public int update(long emp_id, Empresa empresa) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { empresa.getEmp_tipo_identificacion_id(), empresa.getEmp_identificacion(), empresa.getEmp_nombre(), empresa.getEmp_persona_id(), empresa.getEmp_descripcion(), empresa.getEmp_estado(), emp_id });
	}

	@Override
	public int delete(long emp_id) {
		return jdbcTemplate.update(DELETE_SQL, emp_id);
	}

}
