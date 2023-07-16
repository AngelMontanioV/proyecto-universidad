package com.springsimplespasos.universidad.universidadbackend;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Alumno;
import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Direccion;
import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Persona;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.AlumnoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UniversidadBackendApplication {

	@Autowired
	private AlumnoDao servicio;

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
			Direccion direccion = new Direccion("Calle falsa", "12", "43500", "1","1","Hidalgo");
			Persona alumno = new Alumno(null, "Raul", "Perez", "1111", direccion);
			Persona save = servicio.save(alumno);
			System.out.println(save.toString());
		};
	}

}
