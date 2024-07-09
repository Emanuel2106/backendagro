package org.usco.agro.producto_presentacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcProducto_presentacionRepository implements Producto_presentacionRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.producto_presentacion"
		+ "(prp_producto_id, prp_nombre, prp_unidad_id, prp_descripcion, prp_estado, prp_cantidad, prp_marca_id, prp_presentacion_id)"
		+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

	String READ_SQL = "SELECT prp_id, prp_producto_id, prp_nombre, prp_unidad_id, prp_descripcion, prp_estado, prp_cantidad, prp_marca_id, prp_presentacion_id"
		+ " FROM public.producto_presentacion";

	String UPDATE_SQL = "UPDATE public.producto_presentacion"
		+ " SET prp_producto_id=?, prp_nombre=?, prp_unidad_id=?, prp_descripcion=?, prp_estado=?, prp_cantidad=?, prp_marca_id=?, prp_presentacion_id=?"
		+ " WHERE prp_id=?";

	String DELETE_SQL = "DELETE FROM public.producto_presentacion"
		+ " WHERE prp_id=?";


	@Override
	public int create(Producto_presentacion producto_presentacion) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { producto_presentacion.getPrp_producto_id(), producto_presentacion.getPrp_nombre(), producto_presentacion.getPrp_unidad_id(), producto_presentacion.getPrp_descripcion(), producto_presentacion.getPrp_estado(),producto_presentacion.getPrp_cantidad(), producto_presentacion.getPrp_marca_id(), producto_presentacion.getPrp_presentacion_id() });
	}

	@Override
	public List<Producto_presentacion> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Producto_presentacion.class));
	}

	@Override
	public int update(long prp_id, Producto_presentacion producto_presentacion) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { producto_presentacion.getPrp_producto_id(), producto_presentacion.getPrp_nombre(), producto_presentacion.getPrp_unidad_id(), producto_presentacion.getPrp_descripcion(), producto_presentacion.getPrp_estado(),producto_presentacion.getPrp_cantidad(), producto_presentacion.getPrp_marca_id(), producto_presentacion.getPrp_presentacion_id(), prp_id });
	}

	@Override
	public int delete(long prp_id) {
		return jdbcTemplate.update(DELETE_SQL, prp_id);
	}

}
