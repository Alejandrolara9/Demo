package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "USUARIO_COLJUEGOS")
@Getter
@Setter
public class UsuarioColjuegos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String correo;
    private String password;

    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro;

}
