package org.usco.agro.sede;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcSedeRepository implements SedeRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.sede"
		+ "(sed_grupo_id, sed_tipo_sede_id, sed_empresa_id, sed_nombre, sed_municipio_id, sed_geolocalizacion, sed_coordenadas, sed_area, sed_comuna, sed_descripcion, sed_estado)"
		+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	String READ_SQL = "SELECT sed_id, sed_grupo_id, sed_tipo_sede_id, sed_empresa_id, sed_nombre, sed_municipio_id, sed_geolocalizacion, sed_coordenadas, sed_area, sed_comuna, sed_descripcion, sed_estado"
		+ " FROM public.sede";

	String UPDATE_SQL = "UPDATE public.sede"
		+ " SET sed_grupo_id=?, sed_tipo_sede_id=?, sed_empresa_id=?, sed_nombre=?, sed_municipio_id=?, sed_geolocalizacion=?, sed_coordenadas=?, sed_area=?, sed_comuna=?, sed_descripcion=?, sed_estado=?"
		+ " WHERE sed_id=?";

	String DELETE_SQL = "DELETE FROM public.sede"
		+ " WHERE sed_id=?";


	@Override
	public int create(Sede sede) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { sede.getSed_grupo_id(), sede.getSed_tipo_sede_id(), sede.getSed_empresa_id(), sede.getSed_nombre(), sede.getSed_municipio_id(), sede.getSed_geolocalizacion(), sede.getSed_coordenadas(), sede.getSed_area(), sede.getSed_comuna(), sede.getSed_descripcion(), sede.getSed_estado() });
	}

	@Override
	public List<Sede> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Sede.class));
	}

	@Override
	public int update(long sed_id, Sede sede) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { sede.getSed_grupo_id(), sede.getSed_tipo_sede_id(), sede.getSed_empresa_id(), sede.getSed_nombre(), sede.getSed_municipio_id(), sede.getSed_geolocalizacion(), sede.getSed_coordenadas(), sede.getSed_area(), sede.getSed_comuna(), sede.getSed_descripcion(), sede.getSed_estado(), sed_id });
	}

	@Override
	public int delete(long sed_id) {
		return jdbcTemplate.update(DELETE_SQL, sed_id);
	}

}
