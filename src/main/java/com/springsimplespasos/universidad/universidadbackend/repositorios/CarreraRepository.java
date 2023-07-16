package com.springsimplespasos.universidad.universidadbackend.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Carrera;

public interface CarreraRepository extends CrudRepository<Carrera, Integer>{
  
}