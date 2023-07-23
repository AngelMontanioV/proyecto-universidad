package com.springsimplespasos.universidad.universidadbackend.servicios.implementaciones;

import java.util.Optional;


import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.GenericDAO;

public class GenericDAOImpl <E, R extends CrudRepository<E, Integer>> implements GenericDAO<E>{

  protected final R repository;

  public GenericDAOImpl(R repository) {
    this.repository = repository;
  }

  @Override
  @Transactional
  public void deleteById(Integer id) {
    repository.deleteById(id);
  }

  @Override
  @Transactional(readOnly = true)
  public Optional<E> findById(Integer id) {
    return repository.findById(id);
  }

  @Override
  @Transactional(readOnly = true)
  public Iterable<E> findAll() {
    return repository.findAll();
  }

  @Override
  @Transactional
  public E save(E entidad) {
    return repository.save(entidad);
  }
  
}
