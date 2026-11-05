package com.gimnasio.registro.dto.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UsuarioResponseDTO {
    private Long id;
    private String correo;
    private String nombre;
    private String apellido;
}
