package com.springsimplespasos.universidad.universidadbackend.servicios.implementaciones;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Persona;
import com.springsimplespasos.universidad.universidadbackend.repositorios.PersonaRepository;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.AlumnoDAO;

@Service
public class AlumnoDAOImpl extends GenericDAOImpl<Persona, PersonaRepository> implements AlumnoDAO{
  
  @Autowired
  public AlumnoDAOImpl(@Qualifier("repositorioAlumnos")PersonaRepository repository) {
    super(repository);
  }
  

  
}
