package com.bebolder.portalautoservicio.persistence.mapper;

import com.bebolder.portalautoservicio.domain.dto.GestionSolicitudDto;
import com.bebolder.portalautoservicio.domain.dto.SolicitudVacacionesDto;
import com.bebolder.portalautoservicio.persistence.entity.GestionSolicitudEntity;
import com.bebolder.portalautoservicio.persistence.entity.SolicitudVacacionesEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {GestionSolicitudMapper.class, AdministradorMapper.class})
public interface SolicitudVacacionesMapper {

    @Mapping(source = "idSolicitudVacaciones", target = "solicitudVacacionesId")
    SolicitudVacacionesDto toGestionSolicitudDto(SolicitudVacacionesEntity gestionSolicitudEntity);

    @InheritInverseConfiguration
    @Mapping(target = "usuario", ignore = true)
    SolicitudVacacionesEntity toGestionSolicitudEntity(SolicitudVacacionesDto gestionSolicitudDto);

}
