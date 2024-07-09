package org.usco.agro.producto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcProductoRepository implements ProductoRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.producto"
		+ "(pro_nombre, pro_producto_categoria_id, pro_descripcion, pro_estado)"
		+ "VALUES (?, ?, ?, ?)";

	String READ_SQL = "SELECT pro_id, pro_nombre, pro_producto_categoria_id, pro_descripcion, pro_estado"
		+ " FROM public.producto";

	String UPDATE_SQL = "UPDATE public.producto"
		+ " SET pro_nombre=?, pro_producto_categoria_id=?, pro_descripcion=?, pro_estado=?"
		+ " WHERE pro_id=?";

	String DELETE_SQL = "DELETE FROM public.producto"
		+ " WHERE pro_id=?";


	@Override
	public int create(Producto producto) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { producto.getPro_nombre(), producto.getPro_producto_categoria_id(), producto.getPro_descripcion(), producto.getPro_estado() });
	}

	@Override
	public List<Producto> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Producto.class));
	}

	@Override
	public int update(long pro_id, Producto producto) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { producto.getPro_nombre(), producto.getPro_producto_categoria_id(), producto.getPro_descripcion(), producto.getPro_estado(), pro_id });
	}

	@Override
	public int delete(long pro_id) {
		return jdbcTemplate.update(DELETE_SQL, pro_id);
	}

}
