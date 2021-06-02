package mx.edu.utez.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.edu.utez.api.entity.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
