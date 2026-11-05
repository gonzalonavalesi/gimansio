package com.gimnasio.registro.dto.request;

import com.gimnasio.registro.model.RutinaEjercicio;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RutinaRequestDTO {

    @NotBlank(message = "el nombre es obligatorio")
    @Size(max = 60)
    private String nombre;

    @NotEmpty(message = "La rutina debe contener al menos un ejercicio")
    @Valid
    private List<RutinaEjercicioRequestDTO> ejercicios;
}
