package com.gimnasio.registro.mapper;

import com.gimnasio.registro.dto.request.RutinaRequestDTO;
import com.gimnasio.registro.dto.response.RutinaEjercicioResponseDTO;
import com.gimnasio.registro.dto.response.RutinaResponseDTO;
import com.gimnasio.registro.model.Rutina;
import com.gimnasio.registro.model.RutinaEjercicio;

import java.util.Collections;
import java.util.List;

public class RutinaMapper {

    public static RutinaEjercicioResponseDTO toDTO(RutinaEjercicio rutina){
        if(rutina== null)return null;

        return RutinaEjercicioResponseDTO.builder()
                .id(rutina.getId())
                .ejercicioId(rutina.getEjercicio() != null ? rutina.getEjercicio().getId() : null)
                .nombreEjercicio(rutina.getEjercicio() != null ? rutina.getEjercicio().getNombre() : null)
                .orden(rutina.getOrden())
                .build();
    }

    public static RutinaResponseDTO toResponseDTO(Rutina entity) {
        if (entity == null) return null;

        List<RutinaEjercicioResponseDTO> ejerciciosDTO = entity.getEjercicios() != null
                ? entity.getEjercicios().stream()
                .map(RutinaMapper::toDTO)
                .toList()
                : Collections.emptyList();

        return RutinaResponseDTO.builder()
                .id(entity.getId())
                .nombre(entity.getNombre())
                .usuarioId(entity.getUsuario() != null ? entity.getUsuario().getId() : null)
                .ejercicios(ejerciciosDTO)
                .build();
    }
}
