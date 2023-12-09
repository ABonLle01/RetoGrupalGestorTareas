package com.example.retogrupalgestiontareas.domain.entities.user;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.retogrupalgestiontareas.domain.entities.company.Empresa;
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
    private String rol;
    private String dni;
    private LocalDate fecha_nac;
    private Integer telefono;
    private String email;
    private String tutor;
    private String password;
    private Integer totalhorasdual;
    private Integer totalhorasfct;
    private Integer restantesdual;
    private Integer restantesfct;
    private String observaciones;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_empresa", referencedColumnName = "id")
//    private Empresa company;

    @OneToMany(mappedBy = "student")
    private List<DiaryActivity> diary_activities;

    @ManyToOne
    @JoinColumn(name = "company")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "tutor")
    private Teacher tutor;

    @Override
    public String toString() {
        return "Usuario{" +
                "ID = " + id +
                ", Nombre = " + nombre +
                ", Apellido = " + apellido +
                ", Rol = " + rol +
                ", DNI = " + dni +
                ", Nacimiento = " + fecha_nac +
                ", Telefono = " + telefono +
                ", Correo = " + email +
                ", Tutor = " + tutor +
                ", Contraseña = " + password +
                ", Total horas de dual = " + totalhorasdual +
                ", Total horas de fct = " + totalhorasfct +
                ", Horas restantes dual = " + restantesdual +
                ", Horas restantes fct=" + restantesfct +
                ", Observaciones = " + observaciones +
                ", Empresa = " + company.getNombre() +
                '}';
    }

}
