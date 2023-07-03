package com.bebolder.portalautoservicio.persistence.mapper;

import com.bebolder.portalautoservicio.domain.dto.SolicitudVacacionesDto;
import com.bebolder.portalautoservicio.persistence.entity.SolicitudVacacionesEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {GestionSolicitudMapper.class})
public interface SolicitudVacacionesMapper {

    @Mappings({
            @Mapping(source = "idSolicitudVacaciones", target = "solicitudVacacionesId"),
            @Mapping(source = "gestionSolicitud", target = "gestionSolicitudDto")

    })
    SolicitudVacacionesDto toSolicitudVacacionesDto(SolicitudVacacionesEntity solicitudVacacionesEntity);
    List<SolicitudVacacionesDto> toSolicitudesVacacionesDto(List<SolicitudVacacionesEntity> solicitudesVacacionesEntities);

    //@Mapping(target = "usuario", ignore = true)
    @InheritInverseConfiguration
    SolicitudVacacionesEntity toSolicitudVacacionesEntity(SolicitudVacacionesDto solicitudVacacionesDto);

}
