package com.gimnasio.registro.mapper;

import com.gimnasio.registro.dto.request.UsuarioRequestDTO;
import com.gimnasio.registro.dto.response.UsuarioResponseDTO;
import com.gimnasio.registro.model.Usuario;


public class UsuarioMapper {

    public static Usuario toEntity(UsuarioRequestDTO dto){
        if(dto==null) return null;

        return Usuario.builder()
                .apellido(dto.getApellido())
                .nombre(dto.getNombre())
                .password(dto.getPassword())
                .email(dto.getEmail())
                .build();
    }

    public static UsuarioResponseDTO toDTO(Usuario usuario){
        if(usuario==null) return null;

        return UsuarioResponseDTO.builder()
                .apellido(usuario.getApellido())
                .nombre(usuario.getNombre())
                .email(usuario.getEmail())
                .id(usuario.getId()).build();
    }
}
