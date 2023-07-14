package com.springsimplespasos.universidad.universidadbackend.modelo.entidades;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@PrimaryKeyJoinColumn(name = "persona_id")
public class Profesor extends Persona{
    private BigDecimal sueldo;

    private Set<Carrera> carreras;

    public Profesor(){

    }

    public Profesor(Integer id, String nombre, String apellido, String dni, Direccion direccion, BigDecimal sueldo) {
        super(id, nombre, apellido, dni, direccion);
        this.sueldo = sueldo;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }
}
