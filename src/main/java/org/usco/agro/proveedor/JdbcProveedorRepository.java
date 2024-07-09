package org.usco.agro.proveedor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcProveedorRepository implements ProveedorRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.proveedor"
		+ "(pro_empresa_id, pro_fecha_creacion, pro_estado)"
		+ "VALUES (?, ?, ?)";

	String READ_SQL = "SELECT pro_id, pro_empresa_id, pro_fecha_creacion, pro_estado"
		+ " FROM public.proveedor";

	String UPDATE_SQL = "UPDATE public.proveedor"
		+ " SET pro_empresa_id=?, pro_fecha_creacion=?, pro_estado=?"
		+ " WHERE pro_id=?";

	String DELETE_SQL = "DELETE FROM public.proveedor"
		+ " WHERE pro_id=?";


	@Override
	public int create(Proveedor proveedor) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { proveedor.getPro_empresa_id(), proveedor.getPro_fecha_creacion(), proveedor.getPro_estado() });
	}

	@Override
	public List<Proveedor> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Proveedor.class));
	}

	@Override
	public int update(long pro_id, Proveedor proveedor) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { proveedor.getPro_empresa_id(), proveedor.getPro_fecha_creacion(), proveedor.getPro_estado(), pro_id });
	}

	@Override
	public int delete(long pro_id) {
		return jdbcTemplate.update(DELETE_SQL, pro_id);
	}

}
