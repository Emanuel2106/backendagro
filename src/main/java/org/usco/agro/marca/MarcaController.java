package org.usco.agro.marca;

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
public class MarcaController {

	@Autowired
	MarcaRepository marcaRepository;

	@PostMapping("/marca")
	public ResponseEntity<String> createMarca(@RequestBody Marca marca) {
		try {
			marcaRepository.create(
					new Marca(marca.getMar_nombre(), marca.getMar_descripcion(), marca.getMar_estado()));
			return new ResponseEntity<>("Marca creado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/marca")
	public ResponseEntity<List<Marca>> getAllMarcas() {
		try {
			ArrayList<Marca> marcas = new ArrayList<Marca>();

			marcaRepository.read().forEach(marcas::add);

			if (marcas.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(marcas, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/marca/{id}")
	public ResponseEntity<String> updateMarca(@PathVariable("id") int id,
			@RequestBody Marca marca) {
		try {
			marcaRepository.update(id,
					new Marca(marca.getMar_nombre(), marca.getMar_descripcion(), marca.getMar_estado()));
			return new ResponseEntity<>("Marca actualizado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/marca/{id}")
	public ResponseEntity<String> deleteMarca(@PathVariable("id") int id) {
		try {
			marcaRepository.delete(id);
			return new ResponseEntity<>("Marca eliminado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
