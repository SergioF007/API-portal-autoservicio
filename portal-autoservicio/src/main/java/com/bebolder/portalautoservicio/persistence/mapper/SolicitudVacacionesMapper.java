package com.bebolder.portalautoservicio.persistence.mapper;

import com.bebolder.portalautoservicio.domain.dto.SolicitudVacacionesDto;
import com.bebolder.portalautoservicio.persistence.entity.SolicitudVacacionesEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {GestionSolicitudMapper.class, AdministradorMapper.class})
public interface SolicitudVacacionesMapper {

    @Mapping(source = "idSolicitudVacaciones", target = "solicitudVacacionesId")
    SolicitudVacacionesDto toSolicitudVacacionesDto(SolicitudVacacionesEntity solicitudVacacionesEntity);
    List<SolicitudVacacionesDto> toSolicitudesVacacionesDto(List<SolicitudVacacionesEntity> solicitudesVacacionesEntities);

    @InheritInverseConfiguration
    @Mapping(target = "usuario", ignore = true)
    SolicitudVacacionesEntity toSolicitudVacacionesEntity(SolicitudVacacionesDto solicitudVacacionesDto);

}
