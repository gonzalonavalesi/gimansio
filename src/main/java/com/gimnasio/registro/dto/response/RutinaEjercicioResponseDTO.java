package com.gimnasio.registro.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RutinaEjercicioResponseDTO {
    private Long id;
    private Long ejercicioId;
    private String nombreEjercicio;
    private Integer orden;
}