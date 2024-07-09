package org.usco.agro.sede;

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
public class SedeController {

	@Autowired
	SedeRepository sedeRepository;

	@PostMapping("/sede")
	public ResponseEntity<String> createSede(@RequestBody Sede sede) {
		try {
			sedeRepository.create(
					new Sede(sede.getSed_grupo_id(), sede.getSed_tipo_sede_id(), sede.getSed_empresa_id(), sede.getSed_nombre(), sede.getSed_municipio_id(), sede.getSed_geolocalizacion(), sede.getSed_coordenadas(), sede.getSed_area(), sede.getSed_comuna(), sede.getSed_descripcion(), sede.getSed_estado()));
			return new ResponseEntity<>("Sede creado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/sede")
	public ResponseEntity<List<Sede>> getAllSedes() {
		try {
			ArrayList<Sede> sedes = new ArrayList<Sede>();

			sedeRepository.read().forEach(sedes::add);

			if (sedes.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(sedes, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/sede/{id}")
	public ResponseEntity<String> updateSede(@PathVariable("id") int id,
			@RequestBody Sede sede) {
		try {
			sedeRepository.update(id,
					new Sede(sede.getSed_grupo_id(), sede.getSed_tipo_sede_id(), sede.getSed_empresa_id(), sede.getSed_nombre(), sede.getSed_municipio_id(), sede.getSed_geolocalizacion(), sede.getSed_coordenadas(), sede.getSed_area(), sede.getSed_comuna(), sede.getSed_descripcion(), sede.getSed_estado()));
			return new ResponseEntity<>("Sede actualizado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/sede/{id}")
	public ResponseEntity<String> deleteSede(@PathVariable("id") int id) {
		try {
			sedeRepository.delete(id);
			return new ResponseEntity<>("Sede eliminado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
