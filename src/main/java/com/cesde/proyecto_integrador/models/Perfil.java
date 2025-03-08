package com.cesde.proyecto_integrador.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "perfiles")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String telefono;
    private String urlFoto;
    public Perfil(Long id, LocalDate fechaNacimiento, String direccion, String telefono, String urlFoto) {
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.urlFoto = urlFoto;
    }

    
}
