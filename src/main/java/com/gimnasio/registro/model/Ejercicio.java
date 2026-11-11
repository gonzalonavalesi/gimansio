package com.gimnasio.registro.model;

import com.gimnasio.registro.enums.GrupoMuscular;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
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
