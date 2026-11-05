package com.gimnasio.registro.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rutinas")
@Builder
public class Rutina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 60)
    private String nombre;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "usuario_id",nullable = false)
    private Usuario usuario;

    @OneToMany(mappedBy = "rutina",cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private List<RutinaEjercicio> ejercicios=new ArrayList<>();

    @Column(nullable = false)
    private Integer orden;

}
