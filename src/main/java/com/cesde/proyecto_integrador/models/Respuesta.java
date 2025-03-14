package com.cesde.proyecto_integrador.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "respuestas")
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contenido;
    private Date fechaEnvio;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario; // Quién respondió

    @ManyToOne
    @JoinColumn(name = "evaluacion_id")
    private Evaluacion evaluacion; // A qué evaluación responde

    public Respuesta() {}

    public Respuesta(Long id, String contenido, Date fechaEnvio, Usuario usuario, Evaluacion evaluacion) {
        this.id = id;
        this.contenido = contenido;
        this.fechaEnvio = fechaEnvio;
        this.usuario = usuario;
        this.evaluacion = evaluacion;
    }

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
    }

    @Override
    public String toString() {
        return "Respuesta{" +
                "id=" + id +
                ", contenido='" + contenido + '\'' +
                ", fechaEnvio=" + fechaEnvio +
                ", usuario=" + usuario.getNombre() +
                ", evaluacion=" + evaluacion.getTitulo() +
                '}';
    }
}
