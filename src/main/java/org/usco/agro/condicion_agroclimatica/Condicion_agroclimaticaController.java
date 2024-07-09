package org.usco.agro.condicion_agroclimatica;

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
public class Condicion_agroclimaticaController {

	@Autowired
	Condicion_agroclimaticaRepository condicion_agroclimaticaRepository;

	@PostMapping("/condicion_agroclimatica")
	public ResponseEntity<String> createCondicion_agroclimatica(@RequestBody Condicion_agroclimatica condicion_agroclimatica) {
		try {
			condicion_agroclimaticaRepository.create(
					new Condicion_agroclimatica(condicion_agroclimatica.getCoa_espacio_id(), condicion_agroclimatica.getCoa_fecha(), condicion_agroclimatica.getCoa_descripcion(), condicion_agroclimatica.getCoa_estado()));
			return new ResponseEntity<>("Condicion_agroclimatica creado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/condicion_agroclimatica")
	public ResponseEntity<List<Condicion_agroclimatica>> getAllCondicion_agroclimaticas() {
		try {
			ArrayList<Condicion_agroclimatica> condicion_agroclimaticas = new ArrayList<Condicion_agroclimatica>();

			condicion_agroclimaticaRepository.read().forEach(condicion_agroclimaticas::add);

			if (condicion_agroclimaticas.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(condicion_agroclimaticas, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/condicion_agroclimatica/{id}")
	public ResponseEntity<String> updateCondicion_agroclimatica(@PathVariable("id") int id,
			@RequestBody Condicion_agroclimatica condicion_agroclimatica) {
		try {
			condicion_agroclimaticaRepository.update(id,
					new Condicion_agroclimatica(condicion_agroclimatica.getCoa_espacio_id(), condicion_agroclimatica.getCoa_fecha(), condicion_agroclimatica.getCoa_descripcion(), condicion_agroclimatica.getCoa_estado()));
			return new ResponseEntity<>("Condicion_agroclimatica actualizado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/condicion_agroclimatica/{id}")
	public ResponseEntity<String> deleteCondicion_agroclimatica(@PathVariable("id") int id) {
		try {
			condicion_agroclimaticaRepository.delete(id);
			return new ResponseEntity<>("Condicion_agroclimatica eliminado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
