package com.gimnasio.registro.model;

import com.gimnasio.registro.enums.GrupoMuscular;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ejercicios")
public class Ejercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 30)
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false,length = 30)
    private GrupoMuscular grupoMuscular;

}
