package com.gimnasio.registro.model;

import jakarta.persistence.*;
import lombok.*;

import java.lang.module.FindException;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "rutina_ejercicios")
public class RutinaEjercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ejercicio_id",nullable = false)
    private Ejercicio ejercicio;

    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name = "rutina_id",nullable = false)
    private Rutina rutina;

    @Column(nullable = false)
    private Integer orden;



}
