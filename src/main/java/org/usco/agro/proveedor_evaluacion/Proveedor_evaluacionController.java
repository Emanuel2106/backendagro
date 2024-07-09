package org.usco.agro.proveedor_evaluacion;

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
public class Proveedor_evaluacionController {

	@Autowired
	Proveedor_evaluacionRepository proveedor_evaluacionRepository;

	@PostMapping("/proveedor_evaluacion")
	public ResponseEntity<String> createProveedor_evaluacion(@RequestBody Proveedor_evaluacion proveedor_evaluacion) {
		try {
			proveedor_evaluacionRepository.create(
					new Proveedor_evaluacion(proveedor_evaluacion.getPre_fecha_hora(), proveedor_evaluacion.getPre_proveedor_id(), proveedor_evaluacion.getPre_evaluacion_id(), proveedor_evaluacion.getPre_descripcion(), proveedor_evaluacion.getPre_estado()));
			return new ResponseEntity<>("Proveedor_evaluacion creado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/proveedor_evaluacion")
	public ResponseEntity<List<Proveedor_evaluacion>> getAllProveedor_evaluacions() {
		try {
			ArrayList<Proveedor_evaluacion> proveedor_evaluacions = new ArrayList<Proveedor_evaluacion>();

			proveedor_evaluacionRepository.read().forEach(proveedor_evaluacions::add);

			if (proveedor_evaluacions.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(proveedor_evaluacions, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/proveedor_evaluacion/{id}")
	public ResponseEntity<String> updateProveedor_evaluacion(@PathVariable("id") int id,
			@RequestBody Proveedor_evaluacion proveedor_evaluacion) {
		try {
			proveedor_evaluacionRepository.update(id,
					new Proveedor_evaluacion(proveedor_evaluacion.getPre_fecha_hora(), proveedor_evaluacion.getPre_proveedor_id(), proveedor_evaluacion.getPre_evaluacion_id(), proveedor_evaluacion.getPre_descripcion(), proveedor_evaluacion.getPre_estado()));
			return new ResponseEntity<>("Proveedor_evaluacion actualizado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/proveedor_evaluacion/{id}")
	public ResponseEntity<String> deleteProveedor_evaluacion(@PathVariable("id") int id) {
		try {
			proveedor_evaluacionRepository.delete(id);
			return new ResponseEntity<>("Proveedor_evaluacion eliminado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
