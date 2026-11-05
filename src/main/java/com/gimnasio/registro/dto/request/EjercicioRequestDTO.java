package com.gimnasio.registro.dto.request;

import com.gimnasio.registro.enums.GrupoMuscular;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class EjercicioRequestDTO {
    @NotBlank(message = "el nombre es obligatorio")
    @Size(max = 30,message = "el nombre no puede superar los 30 caracteres")
    private String nombre;

    @NotNull(message = "el grupo muscular es obligatorio")
    private GrupoMuscular grupoMuscular;
}
