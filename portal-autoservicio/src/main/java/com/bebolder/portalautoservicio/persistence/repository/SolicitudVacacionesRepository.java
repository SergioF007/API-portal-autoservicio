package com.bebolder.portalautoservicio.persistence.repository;

import com.bebolder.portalautoservicio.domain.dto.SolicitudVacacionesDto;
import com.bebolder.portalautoservicio.persistence.crud.SolicitudVacacionesCrudRepository;
import com.bebolder.portalautoservicio.persistence.entity.SolicitudVacacionesEntity;
import com.bebolder.portalautoservicio.persistence.mapper.SolicitudVacacionesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SolicitudVacacionesRepository {

    @Autowired
    private SolicitudVacacionesCrudRepository solicitudVacacionesCrudRepository;

    @Autowired
    private SolicitudVacacionesMapper mapper;


    public Optional<List<SolicitudVacacionesDto>> getByUsuarioId(int usuarioId) {
        List<SolicitudVacacionesEntity> solicitudVacacionesEntities = solicitudVacacionesCrudRepository.findByUsuarioIdOrderByIdSolicitudVacacionesDesc(usuarioId);
        return Optional.of((mapper.toSolicitudesVacacionesDto(solicitudVacacionesEntities)));
    }

}
