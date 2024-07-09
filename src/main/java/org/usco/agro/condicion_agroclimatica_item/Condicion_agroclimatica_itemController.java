package org.usco.agro.condicion_agroclimatica_item;

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
public class Condicion_agroclimatica_itemController {

	@Autowired
	Condicion_agroclimatica_itemRepository condicion_agroclimatica_itemRepository;

	@PostMapping("/condicion_agroclimatica_item")
	public ResponseEntity<String> createCondicion_agroclimatica_item(@RequestBody Condicion_agroclimatica_item condicion_agroclimatica_item) {
		try {
			condicion_agroclimatica_itemRepository.create(
					new Condicion_agroclimatica_item(condicion_agroclimatica_item.getCai_condicion_agroclimatica_id(), condicion_agroclimatica_item.getCai_variable_agroclimatica_id(), condicion_agroclimatica_item.getCai_valor()));
			return new ResponseEntity<>("Condicion_agroclimatica_item creado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/condicion_agroclimatica_item")
	public ResponseEntity<List<Condicion_agroclimatica_item>> getAllCondicion_agroclimatica_items() {
		try {
			ArrayList<Condicion_agroclimatica_item> condicion_agroclimatica_items = new ArrayList<Condicion_agroclimatica_item>();

			condicion_agroclimatica_itemRepository.read().forEach(condicion_agroclimatica_items::add);

			if (condicion_agroclimatica_items.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(condicion_agroclimatica_items, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/condicion_agroclimatica_item/{id}")
	public ResponseEntity<String> updateCondicion_agroclimatica_item(@PathVariable("id") int id,
			@RequestBody Condicion_agroclimatica_item condicion_agroclimatica_item) {
		try {
			condicion_agroclimatica_itemRepository.update(id,
					new Condicion_agroclimatica_item(condicion_agroclimatica_item.getCai_condicion_agroclimatica_id(), condicion_agroclimatica_item.getCai_variable_agroclimatica_id(), condicion_agroclimatica_item.getCai_valor()));
			return new ResponseEntity<>("Condicion_agroclimatica_item actualizado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/condicion_agroclimatica_item/{id}")
	public ResponseEntity<String> deleteCondicion_agroclimatica_item(@PathVariable("id") int id) {
		try {
			condicion_agroclimatica_itemRepository.delete(id);
			return new ResponseEntity<>("Condicion_agroclimatica_item eliminado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
