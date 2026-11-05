package com.gimnasio.registro.dto.response;

import com.gimnasio.registro.enums.GrupoMuscular;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class EjercicioResponseDTO {

    private Long id;

    private String nombre;

    private GrupoMuscular grupoMuscular;

}
