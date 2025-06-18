package com.example.sprintBootJuanfe13.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "nombres", length = 50)
    String nombres;

    @Column(name = "contraseñas", length = 20)
    String contraseña;

    @Column(name = "correo", length= 70)
    String correo;

    @Column(name = "edad")
    Integer edad;

    @Column(name = "fechaNacimiento")
    LocalDate fechaNacimiento;

    public Usuario() {
    }


    public Usuario(Integer id, String nombres, String contraseña, String correo, Integer edad, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombres = nombres;
        this.contraseña = contraseña;
        this.correo = correo;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }
    
}

