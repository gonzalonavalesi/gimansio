package com.gimnasio.registro.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UsuarioRequestDTO {
    @NotBlank(message = "El nombre no puede estar vacio")
    @Size(max = 30, message = "el nombre no puede superar los 30 caracteres")
    private String nombre;

    @NotBlank(message = "El nombre no puede estar vacio")
    @Size(max = 30, message = "el apellido no puede superar los 30 caracteres")
    private String apellido;

    @NotBlank(message = "La contraseña es obligatoria")
    @Size(min = 6, max = 100, message = "La contraseña debe tener entre 6 y 100 caracteres")
    @Pattern(
            regexp = "^(?=.*[A-Z])(?=(?:.*\\d){2,}).*$",
            message = "La contraseña debe incluir al menos una letra mayúscula y al menos dos números"
    )
    private String password;
}
