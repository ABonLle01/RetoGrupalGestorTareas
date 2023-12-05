package com.example.retogrupalgestiontareas.domain;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "empresa")
public class Empresa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String responsable;
    private Integer telefono;
    private String email;
    private String observaciones;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;



}
