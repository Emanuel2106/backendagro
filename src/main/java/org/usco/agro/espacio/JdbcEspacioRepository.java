package org.usco.agro.espacio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcEspacioRepository implements EspacioRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.espacio"
		+ "(esp_bloque_id, esp_tipo_espacio_id, esp_nombre, esp_geolocalizacion, esp_coordenadas, esp_descripcion, esp_estado)"
		+ "VALUES (?, ?, ?, ?, ?, ?, ?)";

	String READ_SQL = "SELECT esp_id, esp_bloque_id, esp_tipo_espacio_id, esp_nombre, esp_geolocalizacion, esp_coordenadas, esp_descripcion, esp_estado"
		+ " FROM public.espacio";

	String UPDATE_SQL = "UPDATE public.espacio"
		+ " SET esp_bloque_id=?, esp_tipo_espacio_id=?, esp_nombre=?, esp_geolocalizacion=?, esp_coordenadas=?, esp_descripcion=?, esp_estado=?"
		+ " WHERE esp_id=?";

	String DELETE_SQL = "DELETE FROM public.espacio"
		+ " WHERE esp_id=?";


	@Override
	public int create(Espacio espacio) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { espacio.getEsp_bloque_id(), espacio.getEsp_tipo_espacio_id(), espacio.getEsp_nombre(), espacio.getEsp_geolocalizacion(), espacio.getEsp_coordenadas(), espacio.getEsp_descripcion(), espacio.getEsp_estado() });
	}

	@Override
	public List<Espacio> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Espacio.class));
	}

	@Override
	public int update(long esp_id, Espacio espacio) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { espacio.getEsp_bloque_id(), espacio.getEsp_tipo_espacio_id(), espacio.getEsp_nombre(), espacio.getEsp_geolocalizacion(), espacio.getEsp_coordenadas(), espacio.getEsp_descripcion(), espacio.getEsp_estado(), esp_id });
	}

	@Override
	public int delete(long esp_id) {
		return jdbcTemplate.update(DELETE_SQL, esp_id);
	}

}
