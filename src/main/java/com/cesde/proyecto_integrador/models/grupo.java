package com.cesde.proyecto_integrador.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "grupos")
public class grupo {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String area;

    public grupo(Long id, String nombre, String area) {
        this.id = id;
        this.nombre = nombre;
        this.area = area;
    }
    
}
