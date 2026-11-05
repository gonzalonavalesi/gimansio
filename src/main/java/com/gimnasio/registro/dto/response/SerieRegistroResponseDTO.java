package com.gimnasio.registro.dto.response;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SerieRegistroResponseDTO {
    private Long id;
    private Long ejercicioId;
    private String nombreEjercicio;
    private Integer numeroSerie;
    private BigDecimal peso;
    private Integer repeticiones;
    private Integer dropset;
    private Integer restpause;
}