package org.usco.agro.producto_categoria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcProducto_categoriaRepository implements Producto_categoriaRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.producto_categoria"
		+ "(prc_nombre, prc_descripcion, prc_estado)"
		+ "VALUES (?, ?, ?)";

	String READ_SQL = "SELECT prc_id, prc_nombre, prc_descripcion, prc_estado"
		+ " FROM public.producto_categoria";

	String UPDATE_SQL = "UPDATE public.producto_categoria"
		+ " SET prc_nombre=?, prc_descripcion=?, prc_estado=?"
		+ " WHERE prc_id=?";

	String DELETE_SQL = "DELETE FROM public.producto_categoria"
		+ " WHERE prc_id=?";


	@Override
	public int create(Producto_categoria producto_categoria) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { producto_categoria.getPrc_nombre(), producto_categoria.getPrc_descripcion(), producto_categoria.getPrc_estado() });
	}

	@Override
	public List<Producto_categoria> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Producto_categoria.class));
	}

	@Override
	public int update(long prc_id, Producto_categoria producto_categoria) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { producto_categoria.getPrc_nombre(), producto_categoria.getPrc_descripcion(), producto_categoria.getPrc_estado(), prc_id });
	}

	@Override
	public int delete(long prc_id) {
		return jdbcTemplate.update(DELETE_SQL, prc_id);
	}

}
