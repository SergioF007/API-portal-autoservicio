package com.bebolder.portalautoservicio.persistence.mapper;

import com.bebolder.portalautoservicio.domain.dto.EquipoDto;
import com.bebolder.portalautoservicio.persistence.entity.EquipoEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface EquipoMapper {

    @Mappings({
            @Mapping(source = "idEquipo", target = "equipoId"),
    })
    EquipoDto toEquipoDto(EquipoEntity equipoEntity);

    @InheritInverseConfiguration
    @Mapping(target = "usuarios", ignore = true)
    EquipoEntity toEquipoEntity(EquipoDto equipoDto);
}
