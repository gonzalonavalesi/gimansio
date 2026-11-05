package com.gimnasio.registro.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SerieRegistroRequestDTO {

    @NotNull(message = "El ID del ejercicio es obligatorio")
    private Long ejercicioId;

    @NotNull(message = "El número de serie es obligatorio")
    @Min(value = 1, message = "El número de serie debe ser mayor a 0")
    private Integer numeroSerie;

    @NotNull(message = "El peso es obligatorio")
    private BigDecimal peso;

    @NotNull(message = "Las repeticiones son obligatorias")
    @Min(value = 1, message = "Debe haber al menos 1 repetición")
    private Integer repeticiones;

    private Integer dropset;
    private Integer restpause;
}