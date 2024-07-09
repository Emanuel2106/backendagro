package org.usco.agro.almacen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcAlmacenRepository implements AlmacenRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.almacen"
		+ "(alm_nombre, alm_sede_id, alm_geolocalizacion, alm_coordenadas, alm_descripcion, alm_estado)"
		+ "VALUES (?, ?, ?, ?, ?, ?)";

	String READ_SQL = "SELECT alm_id, alm_nombre, alm_sede_id, alm_geolocalizacion, alm_coordenadas, alm_descripcion, alm_estado"
		+ " FROM public.almacen";

	String UPDATE_SQL = "UPDATE public.almacen"
		+ " SET alm_nombre=?, alm_sede_id=?, alm_geolocalizacion=?, alm_coordenadas=?, alm_descripcion=?, alm_estado=?"
		+ " WHERE alm_id=?";

	String DELETE_SQL = "DELETE FROM public.almacen"
		+ " WHERE alm_id=?";


	@Override
	public int create(Almacen almacen) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { almacen.getAlm_nombre(), almacen.getAlm_sede_id(), almacen.getAlm_geolocalizacion(), almacen.getAlm_coordenadas(), almacen.getAlm_descripcion(), almacen.getAlm_estado() });
	}

	@Override
	public List<Almacen> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Almacen.class));
	}

	@Override
	public int update(long alm_id, Almacen almacen) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { almacen.getAlm_nombre(), almacen.getAlm_sede_id(), almacen.getAlm_geolocalizacion(), almacen.getAlm_coordenadas(), almacen.getAlm_descripcion(), almacen.getAlm_estado(), alm_id });
	}

	@Override
	public int delete(long alm_id) {
		return jdbcTemplate.update(DELETE_SQL, alm_id);
	}

}
