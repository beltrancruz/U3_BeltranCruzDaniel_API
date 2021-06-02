package mx.edu.utez.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utez.api.entity.Persona;
import mx.edu.utez.api.repository.PersonaRepository;

@Service
public class PersonaService {

	@Autowired
	private PersonaRepository pr;
	
	public Persona save(Persona persona) {
		return pr.save(persona);
	}
	
	public List<Persona> findAll(){
		return pr.findAll();
	}
	
	public Persona findById(long id) {
		Optional<Persona> p = pr.findById(id);
		return p.isPresent()?p.get():null;
	}
	
	public boolean deleteById(long id) {
		if(findById(id)!=null)
			pr.deleteById(id);
		return findById(id)==null;
	}
	
}
