package com.cesde.proyecto_integrador.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "evaluaciones")
public class Evaluacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descripcion;
    private Date fechaCreacion;
    private Date fechaLimite;

    @ManyToOne
    @JoinColumn(name = "creador_id")
    private Usuario creador; // El profesor o administrador que crea la evaluación

    public Evaluacion() {}

    public Evaluacion(Long id, String titulo, String descripcion, Date fechaCreacion, Date fechaLimite, Usuario creador) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.fechaLimite = fechaLimite;
        this.creador = creador;
    }

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public Usuario getCreador() {
        return creador;
    }

    public void setCreador(Usuario creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Evaluacion{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaLimite=" + fechaLimite +
                ", creador=" + creador.getNombre() + // Mostrar el nombre del creador
                '}';
    }
}
