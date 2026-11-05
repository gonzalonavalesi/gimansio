package com.gimnasio.registro.dto.response;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegistroDiarioResponseDTO {
    private Long id;
    private Long usuarioId;
    private Long rutinaId;
    private String nombreRutina;
    private LocalDate fecha;
    private List<SerieRegistroResponseDTO> series;
}