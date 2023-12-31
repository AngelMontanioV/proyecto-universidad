package com.springsimplespasos.universidad.universidadbackend;

import java.util.Optional;

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

      Optional<Carrera> oCarrera =  servicio.findById(1);
      if(oCarrera.isPresent()) {
        Carrera carrera = oCarrera.get();
        System.out.println(carrera.toString());
        // carrera.setNombre("Ingenieria en Sistemas");
        // servicio.save(carrera);
      }else{
        System.out.println("No se encontro la carrera");
      }
  }
  
}
