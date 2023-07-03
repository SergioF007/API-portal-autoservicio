package com.bebolder.portalautoservicio.persistence.mapper;

import com.bebolder.portalautoservicio.domain.dto.AdministradorDto;
import com.bebolder.portalautoservicio.domain.dto.SupervisorDto;
import com.bebolder.portalautoservicio.persistence.entity.AdministradorEntity;
import com.bebolder.portalautoservicio.persistence.entity.SupervisorEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {EquipoMapper.class, SolicitudVacacionesMapper.class})
public interface SupervisorMapper {

    @Mappings({
            @Mapping(source = "idUsuario", target = "usuarioId"),
            @Mapping(source = "equipo", target = "equipoDto"),

    })
    SupervisorDto toSupervisorDto(SupervisorEntity supervisorEntity);
    List<SupervisorDto> toSupervisores(List<SupervisorEntity> supervisorEntities);


    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "roles", ignore = true),

    })
    SupervisorEntity toSupervisorEntity(SupervisorDto supervisorDto);


}
