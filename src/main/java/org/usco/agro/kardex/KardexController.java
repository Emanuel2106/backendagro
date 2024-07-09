package org.usco.agro.kardex;

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
public class KardexController {

	@Autowired
	KardexRepository kardexRepository;

	@PostMapping("/kardex")
	public ResponseEntity<String> createKardex(@RequestBody Kardex kardex) {
		try {
			kardexRepository.create(
					new Kardex(kardex.getKar_fecha_hora(), kardex.getKar_almacen_id(), kardex.getKar_produccion_id(), kardex.getKar_tipo_movimiento_id(), kardex.getKar_descripcion(), kardex.getKar_estado()));
			return new ResponseEntity<>("Kardex creado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/kardex")
	public ResponseEntity<List<Kardex>> getAllKardexs() {
		try {
			ArrayList<Kardex> kardexs = new ArrayList<Kardex>();

			kardexRepository.read().forEach(kardexs::add);

			if (kardexs.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(kardexs, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/kardex/{id}")
	public ResponseEntity<String> updateKardex(@PathVariable("id") int id,
			@RequestBody Kardex kardex) {
		try {
			kardexRepository.update(id,
					new Kardex(kardex.getKar_fecha_hora(), kardex.getKar_almacen_id(), kardex.getKar_produccion_id(), kardex.getKar_tipo_movimiento_id(), kardex.getKar_descripcion(), kardex.getKar_estado()));
			return new ResponseEntity<>("Kardex actualizado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/kardex/{id}")
	public ResponseEntity<String> deleteKardex(@PathVariable("id") int id) {
		try {
			kardexRepository.delete(id);
			return new ResponseEntity<>("Kardex eliminado con exito", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
