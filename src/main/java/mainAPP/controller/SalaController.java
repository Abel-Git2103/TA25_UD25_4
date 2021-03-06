package mainAPP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mainAPP.dto.Sala;
import mainAPP.service.SalaServiceImpl;

@RestController
@RequestMapping("/api")
public class SalaController {

	@Autowired
	SalaServiceImpl salaServiceImpl;

	@GetMapping("/salas")
	public List<Sala> listarSala() {
		return salaServiceImpl.listarSala();
	}

	@PostMapping("/salas")
	public Sala salvarSala(@RequestBody Sala sala) {

		return salaServiceImpl.guardarSala(sala);
	}

	@GetMapping("/salas/{id}")
	public Sala cajaXID(@PathVariable(name = "id") Integer codigo) {

		Sala sala_xid = new Sala();

		sala_xid = salaServiceImpl.salaXID(codigo);

		System.out.println("Sala XID: " + sala_xid);

		return sala_xid;
	}

	@PutMapping("/salas/{id}")
	public Sala actualizarSala(@PathVariable(name = "id") Integer codigo, @RequestBody Sala sala) {

		Sala sala_seleccionada = new Sala();
		Sala sala_actualizada = new Sala();

		sala_seleccionada = salaServiceImpl.salaXID(codigo);

		sala_seleccionada.setNombre(sala.getNombre());
		sala_seleccionada.setPelicula(sala.getPelicula());

		sala_actualizada = salaServiceImpl.actualizarSala(sala_seleccionada);

		System.out.println("La sala actualizada es: " + sala_actualizada);

		return sala_actualizada;
	}

	@DeleteMapping("/salas/{id}")
	public void eliminarSala(@PathVariable(name = "id") Integer codigo) {
		salaServiceImpl.eliminarSala(codigo);
	}
}
