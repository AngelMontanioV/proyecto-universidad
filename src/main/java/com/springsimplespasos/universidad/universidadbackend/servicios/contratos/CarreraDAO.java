package com.springsimplespasos.universidad.universidadbackend.servicios.contratos;

import java.util.Optional;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Carrera;

public interface CarreraDAO {
  Optional<Carrera> finById(Integer id);
  Carrera save(Carrera carrera);
  Iterable<Carrera> findAll();
  void deleteById(Integer id);
  
}
