package org.usco.agro.marca;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcMarcaRepository implements MarcaRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.marca"
		+ "(mar_nombre, mar_descripcion, mar_estado)"
		+ "VALUES (?, ?, ?)";

	String READ_SQL = "SELECT mar_id, mar_nombre, mar_descripcion, mar_estado"
		+ " FROM public.marca";

	String UPDATE_SQL = "UPDATE public.marca"
		+ " SET mar_nombre=?, mar_descripcion=?, mar_estado=?"
		+ " WHERE mar_id=?";

	String DELETE_SQL = "DELETE FROM public.marca"
		+ " WHERE mar_id=?";


	@Override
	public int create(Marca marca) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { marca.getMar_nombre(), marca.getMar_descripcion(), marca.getMar_estado() });
	}

	@Override
	public List<Marca> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Marca.class));
	}

	@Override
	public int update(long mar_id, Marca marca) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { marca.getMar_nombre(), marca.getMar_descripcion(), marca.getMar_estado(), mar_id });
	}

	@Override
	public int delete(long mar_id) {
		return jdbcTemplate.update(DELETE_SQL, mar_id);
	}

}
