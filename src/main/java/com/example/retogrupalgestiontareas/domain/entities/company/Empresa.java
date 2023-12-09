package com.example.retogrupalgestiontareas.domain.entities.company;

import java.io.Serializable;
import java.util.List;

import com.example.retogrupalgestiontareas.domain.entities.alumno.Alumno;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
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

    @OneToMany(mappedBy = "empresa", fetch = FetchType.EAGER)
    private List<Alumno> alumno;

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", responsable='" + responsable + '\'' +
                ", telefono=" + telefono +
                ", email='" + email + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", Alumno=" + alumno +
                '}';
    }
//    @Override
//    public String toString() {
//        return "Empresa{" +
//                "id=" + id +
//                ", nombre='" + nombre + '\'' +
//                ", responsable='" + responsable + '\'' +
//                ", telefono=" + telefono +
//                ", email='" + email + '\'' +
//                ", observaciones='" + observaciones + '\'' +
//                ", alumno=" + getAlumno() +
//                '}';
//    }
}
