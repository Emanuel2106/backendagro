package org.usco.agro.kardex_item;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class Kardex_itemController {

	@Autowired
	Kardex_itemRepository kardex_itemRepository;

	@PostMapping("/kardex_item")
	public ResponseEntity<String> createKardex_item(@RequestBody Kardex_item kardex_item) {
		try {
			kardex_itemRepository.create(
					new Kardex_item(kardex_item.getKai_kardex_id(), kardex_item.getKai_producto_presentacion_id(), kardex_item.getKai_cantidad(), kardex_item.getKai_precio(), kardex_item.getKai_estado()));
			return new ResponseEntity<>("Kardex_item creado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/kardex_item")
	public ResponseEntity<List<Kardex_item>> getAllKardex_items() {
		try {
			ArrayList<Kardex_item> kardex_items = new ArrayList<Kardex_item>();

			kardex_itemRepository.read().forEach(kardex_items::add);

			if (kardex_items.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(kardex_items, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/kardex_item/{id}")
	public ResponseEntity<String> updateKardex_item(@PathVariable("id") int id,
			@RequestBody Kardex_item kardex_item) {
		try {
			kardex_itemRepository.update(id,
					new Kardex_item(kardex_item.getKai_kardex_id(), kardex_item.getKai_producto_presentacion_id(), kardex_item.getKai_cantidad(), kardex_item.getKai_precio(), kardex_item.getKai_estado()));
			return new ResponseEntity<>("Kardex_item actualizado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/kardex_item/{id}")
	public ResponseEntity<String> deleteKardex_item(@PathVariable("id") int id) {
		try {
			kardex_itemRepository.delete(id);
			return new ResponseEntity<>("Kardex_item eliminado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
