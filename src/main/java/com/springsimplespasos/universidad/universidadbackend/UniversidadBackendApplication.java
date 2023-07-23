package com.springsimplespasos.universidad.universidadbackend;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Alumno;
import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Direccion;
import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Persona;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.AlumnoDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UniversidadBackendApplication {

	@Autowired
	private AlumnoDAO servicio;

	public static void main(String[] args) {
		// String[] beanDefinitionNames = 
		SpringApplication.run(UniversidadBackendApplication.class, args).getBeanDefinitionNames();
		// for(String str : beanDefinitionNames){
		// 	System.out.println(str);
		// }

	}
	@Bean
	public CommandLineRunner runner(){
		return args -> {
			// Direccion direccion = new Direccion("Calle false", "12w3", "43590", "6","1","Santiago");
			// Persona alumno = new Alumno(null, "Hernesto", "Lopez", "ew1", direccion);
			// Persona save = servicio.save(alumno);
			// System.out.println(save.toString());

			// List<Persona> alumnos = (List<Persona>) servicio.findAll();
			// alumnos.forEach(System.out::println);

			
		};
	}

}
