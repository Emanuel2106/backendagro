package org.usco.agro.bloque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcBloqueRepository implements BloqueRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.bloque"
		+ "(blo_sede_id, blo_tipo_bloque_id, blo_nombre, blo_geolocalizacion, blo_coordenadas, blo_numero_pisos, blo_descripcion, blo_estado)"
		+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

	String READ_SQL = "SELECT blo_id, blo_sede_id, blo_tipo_bloque_id, blo_nombre, blo_geolocalizacion, blo_coordenadas, blo_numero_pisos, blo_descripcion, blo_estado"
		+ " FROM public.bloque";

	String UPDATE_SQL = "UPDATE public.bloque"
		+ " SET blo_sede_id=?, blo_tipo_bloque_id=?, blo_nombre=?, blo_geolocalizacion=?, blo_coordenadas=?, blo_numero_pisos=?, blo_descripcion=?, blo_estado=?"
		+ " WHERE blo_id=?";

	String DELETE_SQL = "DELETE FROM public.bloque"
		+ " WHERE blo_id=?";


	@Override
	public int create(Bloque bloque) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { bloque.getBlo_sede_id(), bloque.getBlo_tipo_bloque_id(), bloque.getBlo_nombre(), bloque.getBlo_geolocalizacion(), bloque.getBlo_coordenadas(), bloque.getBlo_numero_pisos(), bloque.getBlo_descripcion(), bloque.getBlo_estado() });
	}

	@Override
	public List<Bloque> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Bloque.class));
	}

	@Override
	public int update(long blo_id, Bloque bloque) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { bloque.getBlo_sede_id(), bloque.getBlo_tipo_bloque_id(), bloque.getBlo_nombre(), bloque.getBlo_geolocalizacion(), bloque.getBlo_coordenadas(), bloque.getBlo_numero_pisos(), bloque.getBlo_descripcion(), bloque.getBlo_estado(), blo_id });
	}

	@Override
	public int delete(long blo_id) {
		return jdbcTemplate.update(DELETE_SQL, blo_id);
	}

}
