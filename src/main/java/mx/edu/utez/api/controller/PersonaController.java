package mx.edu.utez.api.controller;

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

import mx.edu.utez.api.entity.Persona;
import mx.edu.utez.api.service.PersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {

	@Autowired
	private PersonaService ps;
	
	@GetMapping("/get")
	public List<Persona> getAll(){
		return ps.findAll();
	}
	
	@GetMapping("/get/{id}")
	public Persona getOne(@PathVariable("id") long id) {
		return ps.findById(id);
	}

	@PostMapping("/post")
	public Persona post(@RequestBody Persona persona) {
		return ps.save(persona);
	}
	
	@PutMapping("/put")
	public Persona put(@RequestBody Persona persona) {
		return ps.save(persona);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id") long id) {
		return ps.deleteById(id);
	}
	
}
