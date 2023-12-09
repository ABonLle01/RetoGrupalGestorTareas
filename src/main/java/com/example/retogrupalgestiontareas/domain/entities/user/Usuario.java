package com.example.retogrupalgestiontareas.domain.entities.alumno;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import com.example.retogrupalgestiontareas.domain.entities.activity.Actividad;
import com.example.retogrupalgestiontareas.domain.entities.company.Empresa;
import com.example.retogrupalgestiontareas.domain.entities.profesor.Profesor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "alumno")
public class Alumno implements Serializable {
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
    private String password;
    private Integer totalhorasdual;
    private Integer totalhorasfct;
    private Integer restantesdual;
    private Integer restantesfct;
    private String observaciones;

    @OneToMany(mappedBy = "alumno")
    private List<Actividad> activities;

    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;

    @ManyToOne
    @JoinColumn(name = "tutor")
    private Profesor profesor;

    @Override
    public String toString() {

        return "Alumno{" +
                "ID = " + id +
                ", Nombre = " + nombre +
                ", Apellido = " + apellido +
                ", Rol = " + rol +
                ", DNI = " + dni +
                ", Nacimiento = " + fecha_nac +
                ", Telefono = " + telefono +
                ", Correo = " + email +
                ", Tutor = " + profesor.getNombre() +
                ", Contraseña = " + password +
                ", Total horas de dual = " + totalhorasdual +
                ", Total horas de fct = " + totalhorasfct +
                ", Horas restantes dual = " + restantesdual +
                ", Horas restantes fct=" + restantesfct +
                ", Observaciones = " + observaciones +
                ", Empresa = " + empresa.getNombre() +
                '}';
    }
}
