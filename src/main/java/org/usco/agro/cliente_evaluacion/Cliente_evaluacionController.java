package org.usco.agro.cliente_evaluacion;

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
public class Cliente_evaluacionController {

	@Autowired
	Cliente_evaluacionRepository cliente_evaluacionRepository;

	@PostMapping("/cliente_evaluacion")
	public ResponseEntity<String> createCliente_evaluacion(@RequestBody Cliente_evaluacion cliente_evaluacion) {
		try {
			cliente_evaluacionRepository.create(
					new Cliente_evaluacion(cliente_evaluacion.getCle_fecha(), cliente_evaluacion.getCle_persona_id(), cliente_evaluacion.getCle_evaluacion_id(), cliente_evaluacion.getCle_descripcion(), cliente_evaluacion.getCle_estado()));
			return new ResponseEntity<>("Cliente_evaluacion creado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/cliente_evaluacion")
	public ResponseEntity<List<Cliente_evaluacion>> getAllCliente_evaluacions() {
		try {
			ArrayList<Cliente_evaluacion> cliente_evaluacions = new ArrayList<Cliente_evaluacion>();

			cliente_evaluacionRepository.read().forEach(cliente_evaluacions::add);

			if (cliente_evaluacions.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(cliente_evaluacions, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/cliente_evaluacion/{id}")
	public ResponseEntity<String> updateCliente_evaluacion(@PathVariable("id") int id,
			@RequestBody Cliente_evaluacion cliente_evaluacion) {
		try {
			cliente_evaluacionRepository.update(id,
					new Cliente_evaluacion(cliente_evaluacion.getCle_fecha(), cliente_evaluacion.getCle_persona_id(), cliente_evaluacion.getCle_evaluacion_id(), cliente_evaluacion.getCle_descripcion(), cliente_evaluacion.getCle_estado()));
			return new ResponseEntity<>("Cliente_evaluacion actualizado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/cliente_evaluacion/{id}")
	public ResponseEntity<String> deleteCliente_evaluacion(@PathVariable("id") int id) {
		try {
			cliente_evaluacionRepository.delete(id);
			return new ResponseEntity<>("Cliente_evaluacion eliminado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
