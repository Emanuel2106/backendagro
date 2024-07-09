package org.usco.agro.persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcPersonaRepository implements PersonaRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.persona"
		+ "(per_tipo_identificacion, per_identificacion, per_nombre, per_apellido, per_genero, per_fecha_nacimiento, per_estrato, per_direccion, per_email_personal, per_celular, per_estado)"
		+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	String READ_SQL = "SELECT per_id, per_tipo_identificacion, per_identificacion, per_nombre, per_apellido, per_genero, per_fecha_nacimiento, per_estrato, per_direccion, per_email_personal, per_celular, per_estado"
		+ " FROM public.persona";

	String UPDATE_SQL = "UPDATE public.persona"
		+ " SET per_tipo_identificacion=?, per_identificacion=?, per_nombre=?, per_apellido=?, per_genero=?, per_fecha_nacimiento=?, per_estrato=?, per_direccion=?, per_email_personal=?, per_celular=?, per_estado=?"
		+ " WHERE per_id=?";

	String DELETE_SQL = "DELETE FROM public.persona"
		+ " WHERE per_id=?";


	@Override
	public int create(Persona persona) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { persona.getPer_tipo_identificacion(), persona.getPer_identificacion(), persona.getPer_nombre(), persona.getPer_apellido(), persona.getPer_genero(), persona.getPer_fecha_nacimiento(), persona.getPer_estrato(), persona.getPer_direccion(), persona.getPer_email_personal(), persona.getPer_celular(), persona.getPer_estado() });
	}

	@Override
	public List<Persona> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Persona.class));
	}

	@Override
	public int update(long per_id, Persona persona) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { persona.getPer_tipo_identificacion(), persona.getPer_identificacion(), persona.getPer_nombre(), persona.getPer_apellido(), persona.getPer_genero(), persona.getPer_fecha_nacimiento(), persona.getPer_estrato(), persona.getPer_direccion(), persona.getPer_email_personal(), persona.getPer_celular(), persona.getPer_estado(), per_id });
	}

	@Override
	public int delete(long per_id) {
		return jdbcTemplate.update(DELETE_SQL, per_id);
	}

}
