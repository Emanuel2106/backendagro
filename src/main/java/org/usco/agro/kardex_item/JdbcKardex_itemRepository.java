package org.usco.agro.kardex_item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcKardex_itemRepository implements Kardex_itemRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	String CREATE_SQL = "INSERT INTO public.kardex_item"
		+ "(kai_kardex_id,  kai_producto_presentacion_id, kai_cantidad, kai_precio, kai_estado)"
		+ "VALUES (?, ?, ?, ?, ?, ?)";

	String READ_SQL = "SELECT kai_id, kai_kardex_id,kai_producto_presentacion_id, kai_cantidad, kai_precio, kai_estado"
		+ " FROM public.kardex_item";

	String UPDATE_SQL = "UPDATE public.kardex_item"
		+ " SET kai_kardex_id=?, kai_producto_presentacion_id=?, kai_cantidad=?, kai_precio=?, kai_estado=?"
		+ " WHERE kai_id=?";

	String DELETE_SQL = "DELETE FROM public.kardex_item"
		+ " WHERE kai_id=?";


	@Override
	public int create(Kardex_item kardex_item) {
		return jdbcTemplate.update(CREATE_SQL,
				new Object[] { kardex_item.getKai_kardex_id(), kardex_item.getKai_producto_presentacion_id(), kardex_item.getKai_cantidad(), kardex_item.getKai_precio(), kardex_item.getKai_estado() });
	}

	@Override
	public List<Kardex_item> read() {
		return jdbcTemplate.query(READ_SQL, BeanPropertyRowMapper.newInstance(Kardex_item.class));
	}

	@Override
	public int update(long kai_id, Kardex_item kardex_item) {
		return jdbcTemplate.update(UPDATE_SQL, new Object[] { kardex_item.getKai_kardex_id(), kardex_item.getKai_producto_presentacion_id(), kardex_item.getKai_cantidad(), kardex_item.getKai_precio(), kardex_item.getKai_estado(), kai_id });
	}

	@Override
	public int delete(long kai_id) {
		return jdbcTemplate.update(DELETE_SQL, kai_id);
	}

}
