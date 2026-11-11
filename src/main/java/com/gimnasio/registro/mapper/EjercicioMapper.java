package com.gimnasio.registro.mapper;

import com.gimnasio.registro.dto.request.EjercicioRequestDTO;
import com.gimnasio.registro.dto.response.EjercicioResponseDTO;
import com.gimnasio.registro.model.Ejercicio;

public class EjercicioMapper {

    public static Ejercicio toEntity (EjercicioRequestDTO dto){
        if(dto==null)return null;

        return Ejercicio.builder()
                .grupoMuscular(dto.getGrupoMuscular())
                .nombre(dto.getNombre())
                .build();
    }

    public static EjercicioResponseDTO toDTO(Ejercicio ejercicio){
        if(ejercicio==null)return null;

        return EjercicioResponseDTO.builder()
                .grupoMuscular(ejercicio.getGrupoMuscular())
                .id(ejercicio.getId())
                .nombre(ejercicio.getNombre())
                .build();
    }
}
