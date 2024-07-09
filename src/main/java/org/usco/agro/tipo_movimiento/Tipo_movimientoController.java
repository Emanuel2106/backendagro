package org.usco.agro.tipo_movimiento;

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
public class Tipo_movimientoController {

	@Autowired
	Tipo_movimientoRepository tipo_movimientoRepository;

	@PostMapping("/tipo_movimiento")
	public ResponseEntity<String> createTipo_movimiento(@RequestBody Tipo_movimiento tipo_movimiento) {
		try {
			tipo_movimientoRepository.create(
					new Tipo_movimiento(tipo_movimiento.getTim_nombre(), tipo_movimiento.getTim_descripcion(), tipo_movimiento.getTim_estado()));
			return new ResponseEntity<>("Tipo_movimiento creado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/tipo_movimiento")
	public ResponseEntity<List<Tipo_movimiento>> getAllTipo_movimientos() {
		try {
			ArrayList<Tipo_movimiento> tipo_movimientos = new ArrayList<Tipo_movimiento>();

			tipo_movimientoRepository.read().forEach(tipo_movimientos::add);

			if (tipo_movimientos.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(tipo_movimientos, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/tipo_movimiento/{id}")
	public ResponseEntity<String> updateTipo_movimiento(@PathVariable("id") int id,
			@RequestBody Tipo_movimiento tipo_movimiento) {
		try {
			tipo_movimientoRepository.update(id,
					new Tipo_movimiento(tipo_movimiento.getTim_nombre(), tipo_movimiento.getTim_descripcion(), tipo_movimiento.getTim_estado()));
			return new ResponseEntity<>("Tipo_movimiento actualizado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/tipo_movimiento/{id}")
	public ResponseEntity<String> deleteTipo_movimiento(@PathVariable("id") int id) {
		try {
			tipo_movimientoRepository.delete(id);
			return new ResponseEntity<>("Tipo_movimiento eliminado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
