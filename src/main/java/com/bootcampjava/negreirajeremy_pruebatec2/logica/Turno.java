package com.bootcampjava.negreirajeremy_pruebatec2.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Turno implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String estado;
    private LocalDateTime hora;

    public Turno() {
        // Constructor por defecto requerido por JPA
    }

    // Constructor para crear un Turno con hora
    public Turno(LocalDateTime hora) {
        this.estado = "En espera";
        this.hora = hora;
    }

    public Long getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public boolean estaEsperando() {
        return "En espera".equals(estado);
    }

    public boolean estaAtendido() {
        return "Ya atendido".equals(estado);
    }

    public void marcarComoAtendido() {
        this.estado = "Ya atendido";
    }

    @Override
    public String toString() {
        return "Turno{" + "id=" + id + ", estado=" + estado + ", hora=" + hora + '}';
    }
}

