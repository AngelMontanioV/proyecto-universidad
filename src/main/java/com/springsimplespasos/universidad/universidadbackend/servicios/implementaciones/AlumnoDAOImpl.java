package com.springsimplespasos.universidad.universidadbackend.servicios.implementaciones;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Persona;
import com.springsimplespasos.universidad.universidadbackend.repositorios.PersonaRepository;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.AlumnoDao;

@Service
public class AlumnoDAOImpl implements AlumnoDao{

  @Autowired
  @Qualifier("repositorioAlumnos")
  private PersonaRepository repository;
  
  @Override
  public void deleteById(Integer id) {
    repository.deleteById(id);
    
  }

  @Override
  public Optional<Persona> finById(Integer id) {
    return repository.findById(id);
  }

  @Override
  public Iterable<Persona> findAll() {
    return repository.findAll();
  }

  @Override
  public Persona save(Persona carrera) {
    return repository.save(carrera);
  }
  
}
