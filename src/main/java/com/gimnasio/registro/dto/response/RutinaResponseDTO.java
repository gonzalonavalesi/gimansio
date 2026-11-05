package com.gimnasio.registro.dto.response;

import com.gimnasio.registro.dto.request.RutinaEjercicioRequestDTO;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RutinaResponseDTO {
    private Long id;
    private String nombre;
    private Long usuarioId;
    private List<RutinaEjercicioResponseDTO> ejercicios;
}
