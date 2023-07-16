package com.springsimplespasos.universidad.universidadbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Carrera;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.CarreraDAO;


@Component
public class CarreraComandos implements CommandLineRunner{

  @Autowired
  private CarreraDAO servicio;  
  
  @Override
  public void run(String... args) throws Exception {
//    Carrera ingSistemas = new Carrera(null, "Ingenieria en Sistemas", 50, 5);
//    Carrera save = servicio.save(ingSistemas);
//    System.out.println(save.toString());
  }
  
}
