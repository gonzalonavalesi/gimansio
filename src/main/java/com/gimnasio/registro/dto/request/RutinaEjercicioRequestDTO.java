package com.gimnasio.registro.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RutinaEjercicioRequestDTO {
    @NotNull(message = "El ID del ejercicio es obligatorio")
    private Long ejercicioId;
}
