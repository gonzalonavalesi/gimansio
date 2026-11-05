package com.gimnasio.registro.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "registro_diario")
public class RegistroDiario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @Column(name = "fecha",nullable = false)
    private LocalDate fecha;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="rutina_id",nullable = false)
    private Rutina rutina;

    @OneToMany(mappedBy = "registroDiario", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private List<SerieRegistro> series = new ArrayList<>();
}
