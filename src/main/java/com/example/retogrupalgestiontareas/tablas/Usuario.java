package com.example.retogrupalgestiontareas.tablas;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "usuario")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private Integer DNI;
    private String rol;
    private LocalDate fecha_nac;
    private String email;
    private String tutor;
    private String password;
    private Integer totalhorasfct;
    private Integer totalhorasdual;
    private Integer restantesdual;
    private Integer restaurantesfct;
    private String observaciones;

    @OneToMany(mappedBy = "id_empresa",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Empresa> enterprises = new ArrayList<>(0);

}
