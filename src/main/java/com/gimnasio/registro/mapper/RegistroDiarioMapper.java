package com.gimnasio.registro.mapper;

import com.gimnasio.registro.dto.response.RegistroDiarioResponseDTO;
import com.gimnasio.registro.dto.response.SerieRegistroResponseDTO;
import com.gimnasio.registro.model.RegistroDiario;
import com.gimnasio.registro.model.SerieRegistro;

import java.util.Collections;
import java.util.List;

public class RegistroDiarioMapper {

    // 1. Primero el sub-mappeo de cada serie realizada
    public static SerieRegistroResponseDTO toDTO(SerieRegistro entity) {
        if (entity == null) return null;

        return SerieRegistroResponseDTO.builder()
                .id(entity.getId())
                .ejercicioId(entity.getEjercicio() != null ? entity.getEjercicio().getId() : null)
                .nombreEjercicio(entity.getEjercicio() != null ? entity.getEjercicio().getNombre() : null)
                .numeroSerie(entity.getNumeroSerie())
                .peso(entity.getPeso())
                .repeticiones(entity.getRepeticiones())
                .dropset(entity.getDropset())
                .restpause(entity.getRestpause())
                .build();
    }

    // 2. Mappeo principal del registro diario
    public static RegistroDiarioResponseDTO toResponseDTO(RegistroDiario entity) {
        if (entity == null) return null;

        List<SerieRegistroResponseDTO> seriesDTO = entity.getSeries() != null
                ? entity.getSeries().stream()
                .map(RegistroDiarioMapper::toDTO)
                .toList()
                : Collections.emptyList();

        return RegistroDiarioResponseDTO.builder()
                .id(entity.getId())
                .usuarioId(entity.getUsuario() != null ? entity.getUsuario().getId() : null)
                .rutinaId(entity.getRutina() != null ? entity.getRutina().getId() : null)
                .nombreRutina(entity.getRutina() != null ? entity.getRutina().getNombre() : null)
                .fecha(entity.getFecha())
                .series(seriesDTO)
                .build();
    }
}