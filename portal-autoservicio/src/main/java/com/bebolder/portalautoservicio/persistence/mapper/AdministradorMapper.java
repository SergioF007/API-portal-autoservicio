package com.bebolder.portalautoservicio.persistence.mapper;

import com.bebolder.portalautoservicio.domain.dto.AdministradorDto;
import com.bebolder.portalautoservicio.domain.dto.UsuarioDto;
import com.bebolder.portalautoservicio.persistence.entity.AdministradorEntity;
import com.bebolder.portalautoservicio.persistence.entity.UsuarioEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {EquipoMapper.class, SolicitudVacacionesMapper.class})
public interface AdministradorMapper {


    @Mappings({
            @Mapping(source = "idUsuario", target = "usuarioId"),
            @Mapping(source = "equipo", target = "equipoDto"),

    })
    AdministradorDto toUsuarioDto(AdministradorEntity administradorEntity);
    List<AdministradorDto> toUsuarios(List<AdministradorEntity> administradorEntities);


    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "roles", ignore = true),
            @Mapping(target = "solicitudVacaciones", ignore = true),

    })
    AdministradorEntity toUsuarioEntity(AdministradorDto administradorDto);

}
