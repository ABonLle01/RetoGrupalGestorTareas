package com.example.retogrupalgestiontareas.domain.entities.profesor;

import com.example.retogrupalgestiontareas.domain.entities.alumno.Alumno;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "profesor")
public class Profesor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_profesor;

    private String nombre;
    private String apellidos;
    private String password;
    private String email;

    @OneToMany(mappedBy = "profesor", fetch = FetchType.EAGER)
    private List<Alumno> alumnos;
    @Override
    public String toString( ) {
        return "Teacher{" +
                "id_profesor=" + id_profesor +
                ", nombre='" + nombre +
                ", apellidos='" + apellidos +
                ", password='" + password +
                ", email='" + email +
                ", alumnos=" + alumnos.size() +
                '}';
    }


}
