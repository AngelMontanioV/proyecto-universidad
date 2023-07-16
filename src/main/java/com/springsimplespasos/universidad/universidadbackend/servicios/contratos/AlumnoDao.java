package com.springsimplespasos.universidad.universidadbackend.servicios.contratos;


import java.util.Optional;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Persona;


public interface AlumnoDao {
    Optional<Persona> finById(Integer id);
    Persona save(Persona carrera);
    Iterable<Persona> findAll();
    void deleteById(Integer id);
}
