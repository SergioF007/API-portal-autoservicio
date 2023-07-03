package com.bebolder.portalautoservicio.persistence.mapper;

import com.bebolder.portalautoservicio.domain.dto.AdministradorDto;
import com.bebolder.portalautoservicio.domain.dto.EmpleadoDto;
import com.bebolder.portalautoservicio.persistence.entity.AdministradorEntity;
import com.bebolder.portalautoservicio.persistence.entity.EmpleadoEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {EquipoMapper.class, SolicitudVacacionesMapper.class})
public interface EmpleadoMapper {

    @Mappings({
            @Mapping(source = "idUsuario", target = "usuarioId"),
            @Mapping(source = "equipo", target = "equipoDto"),

    })
    EmpleadoDto toEmpleadoDto(EmpleadoEntity empleadoEntity);
    List<EmpleadoDto> toEmpleados(List<EmpleadoEntity> empleadoEntities);


    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "roles", ignore = true),

    })
    EmpleadoEntity toEmpleadoEntity(EmpleadoDto empleadoDto);
}
