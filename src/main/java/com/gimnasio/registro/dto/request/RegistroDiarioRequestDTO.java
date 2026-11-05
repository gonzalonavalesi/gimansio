package com.gimnasio.registro.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegistroDiarioRequestDTO {

    @NotNull(message = "El ID de rutina es obligatorio")
    private Long rutinaId;

    private LocalDate fecha;

    @NotEmpty(message = "Debe registrar al menos una serie")
    @Valid
    private List<SerieRegistroRequestDTO> series;
}