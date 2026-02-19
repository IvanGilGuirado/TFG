package com.example.hellborn_backend.mapper;

import org.modelmapper.ModelMapper;

import com.example.hellborn_backend.DTO.DireccionUsuarioDTO;
import com.example.hellborn_backend.entity.DireccionUsuario;

public class DireccionUsuarioMapper {

    private final ModelMapper mapper = new ModelMapper();

    public DireccionUsuarioDTO toDTO(DireccionUsuario direccionUsuario) {
        return mapper.map(direccionUsuario, DireccionUsuarioDTO.class);
    }

    public DireccionUsuario toEntity(DireccionUsuarioDTO direccionUsuarioDTO) {
        return mapper.map(direccionUsuarioDTO, DireccionUsuario.class);
    }

}
