package org.usco.agro.presentacion;

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
public class PresentacionController {

	@Autowired
	PresentacionRepository presentacionRepository;

	@PostMapping("/presentacion")
	public ResponseEntity<String> createPresentacion(@RequestBody Presentacion presentacion) {
		try {
			presentacionRepository.create(
					new Presentacion(presentacion.getPre_nombre(), presentacion.getPre_descripcion(), presentacion.getPre_estado()));
			return new ResponseEntity<>("Presentacion creado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/presentacion")
	public ResponseEntity<List<Presentacion>> getAllPresentacions() {
		try {
			ArrayList<Presentacion> presentacions = new ArrayList<Presentacion>();

			presentacionRepository.read().forEach(presentacions::add);

			if (presentacions.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(presentacions, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/presentacion/{id}")
	public ResponseEntity<String> updatePresentacion(@PathVariable("id") int id,
			@RequestBody Presentacion presentacion) {
		try {
			presentacionRepository.update(id,
					new Presentacion(presentacion.getPre_nombre(), presentacion.getPre_descripcion(), presentacion.getPre_estado()));
			return new ResponseEntity<>("Presentacion actualizado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/presentacion/{id}")
	public ResponseEntity<String> deletePresentacion(@PathVariable("id") int id) {
		try {
			presentacionRepository.delete(id);
			return new ResponseEntity<>("Presentacion eliminado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
