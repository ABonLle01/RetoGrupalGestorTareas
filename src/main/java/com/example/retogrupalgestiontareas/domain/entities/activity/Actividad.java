package com.example.retogrupalgestiontareas.domain.entities.activity;

import java.io.Serializable;
import java.time.LocalDate;

import com.example.retogrupalgestiontareas.domain.entities.alumn.Alumno;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "actividad")
public class Actividad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private Integer horas;
    private LocalDate fecha;
    private String tipo;
    private String observaciones;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Alumno alumno;


    @Override
    public String toString() {
        return "Actividad{" +
                "ID = " + id +
                ", Nombre = " + nombre +
                ", Horas = " + horas +
                ", Fecha = " + fecha +
                ", Tipo = " + tipo +
                ", Observaciones = " + observaciones +
                ", Usuario = " + alumno.getNombre() +
                '}';
    }


}
