package com.gimnasio.registro.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "serie_registros")
public class SerieRegistro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "registro_diario_id", nullable = false)
    private RegistroDiario registroDiario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ejercicio_id", nullable = false)
    private Ejercicio ejercicio;

    @Column(name = "numero_serie", nullable = false)
    private Integer numeroSerie;

    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal peso;

    @Column(name = "repeticiones", nullable = false)
    private Integer repeticiones;

    private Integer dropset;

    private Integer restpause;
}

