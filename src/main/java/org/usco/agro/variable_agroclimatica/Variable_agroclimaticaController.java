package org.usco.agro.variable_agroclimatica;

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
public class Variable_agroclimaticaController {

	@Autowired
	Variable_agroclimaticaRepository variable_agroclimaticaRepository;

	@PostMapping("/variable_agroclimatica")
	public ResponseEntity<String> createVariable_agroclimatica(@RequestBody Variable_agroclimatica variable_agroclimatica) {
		try {
			variable_agroclimaticaRepository.create(
					new Variable_agroclimatica(variable_agroclimatica.getVaa_nombre(), variable_agroclimatica.getVaa_unidad(), variable_agroclimatica.getVaa_descripcion(), variable_agroclimatica.getVaa_estado()));
			return new ResponseEntity<>("Variable_agroclimatica creado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/variable_agroclimatica")
	public ResponseEntity<List<Variable_agroclimatica>> getAllVariable_agroclimaticas() {
		try {
			ArrayList<Variable_agroclimatica> variable_agroclimaticas = new ArrayList<Variable_agroclimatica>();

			variable_agroclimaticaRepository.read().forEach(variable_agroclimaticas::add);

			if (variable_agroclimaticas.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(variable_agroclimaticas, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/variable_agroclimatica/{id}")
	public ResponseEntity<String> updateVariable_agroclimatica(@PathVariable("id") int id,
			@RequestBody Variable_agroclimatica variable_agroclimatica) {
		try {
			variable_agroclimaticaRepository.update(id,
					new Variable_agroclimatica(variable_agroclimatica.getVaa_nombre(), variable_agroclimatica.getVaa_unidad(), variable_agroclimatica.getVaa_descripcion(), variable_agroclimatica.getVaa_estado()));
			return new ResponseEntity<>("Variable_agroclimatica actualizado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/variable_agroclimatica/{id}")
	public ResponseEntity<String> deleteVariable_agroclimatica(@PathVariable("id") int id) {
		try {
			variable_agroclimaticaRepository.delete(id);
			return new ResponseEntity<>("Variable_agroclimatica eliminado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
