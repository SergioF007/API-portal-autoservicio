package com.bebolder.portalautoservicio.persistence.mapper;

import com.bebolder.portalautoservicio.domain.dto.GestionSolicitudDto;
import com.bebolder.portalautoservicio.persistence.entity.GestionSolicitudEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.lang.annotation.Target;

@Mapper(componentModel = "spring", uses = {SolicitudVacacionesMapper.class})
public interface GestionSolicitudMapper {

    @Mapping(source = "idGestionSolicitud", target = "gestionSolicitudId")
    GestionSolicitudDto toGestionSolicitudDto(GestionSolicitudEntity gestionSolicitud);

    @InheritInverseConfiguration
    @Mappings({
        @Mapping(target = "solicitudVacaciones", ignore = true),
        @Mapping(target = "notificaciones", ignore = true),
        @Mapping(target = "vacaciones", ignore = true),
    })
    GestionSolicitudEntity toGestionSolicitudEntity(GestionSolicitudDto gestionSolicitudDto);

}
