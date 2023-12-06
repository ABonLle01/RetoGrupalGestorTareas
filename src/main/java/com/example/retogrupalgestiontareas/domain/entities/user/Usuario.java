package com.example.retogrupalgestiontareas.domain.entities.user;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.retogrupalgestiontareas.domain.entities.Empresa;
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
    private Integer dni;
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

    @OneToMany(mappedBy = "id_empresa",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Empresa> companies = new ArrayList<>(0);

    /*
        Hibernate gestionará la relación entre Usuario y Actividad a través de las anotaciones @ManyToOne y @JoinColumn
        en la clase Actividad. Esto permite que un usuario tenga muchas actividades,
        pero cada actividad pertenece a un solo usuario.
    */

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
                ", Empresa = "/*todo: añadir empresa del usuario*/+
                '}';
    }
}
