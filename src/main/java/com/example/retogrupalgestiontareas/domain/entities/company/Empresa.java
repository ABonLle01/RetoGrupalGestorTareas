package com.example.retogrupalgestiontareas.domain.entities.company;

import java.io.Serializable;

import com.example.retogrupalgestiontareas.domain.entities.user.Usuario;
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
    private List<Student> student;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", responsable='" + responsable + '\'' +
                ", telefono=" + telefono +
                ", email='" + email + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", student=" + student +
                ", usuario=" + usuario +
                '}';
    }
}
