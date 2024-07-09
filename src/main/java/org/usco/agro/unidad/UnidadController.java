package org.usco.agro.unidad;

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
public class UnidadController {

	@Autowired
	UnidadRepository unidadRepository;

	@PostMapping("/unidad")
	public ResponseEntity<String> createUnidad(@RequestBody Unidad unidad) {
		try {
			unidadRepository.create(
					new Unidad(unidad.getUni_nombre(), unidad.getUni_descripcion(), unidad.getUni_estado()));
			return new ResponseEntity<>("Unidad creado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/unidad")
	public ResponseEntity<List<Unidad>> getAllUnidads() {
		try {
			ArrayList<Unidad> unidads = new ArrayList<Unidad>();

			unidadRepository.read().forEach(unidads::add);

			if (unidads.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(unidads, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/unidad/{id}")
	public ResponseEntity<String> updateUnidad(@PathVariable("id") int id,
			@RequestBody Unidad unidad) {
		try {
			unidadRepository.update(id,
					new Unidad(unidad.getUni_nombre(), unidad.getUni_descripcion(), unidad.getUni_estado()));
			return new ResponseEntity<>("Unidad actualizado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/unidad/{id}")
	public ResponseEntity<String> deleteUnidad(@PathVariable("id") int id) {
		try {
			unidadRepository.delete(id);
			return new ResponseEntity<>("Unidad eliminado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
