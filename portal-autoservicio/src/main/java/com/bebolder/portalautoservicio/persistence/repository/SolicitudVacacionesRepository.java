package com.bebolder.portalautoservicio.persistence.repository;

import com.bebolder.portalautoservicio.domain.dto.SolicitudVacacionesDto;
import com.bebolder.portalautoservicio.domain.repository.SolicitudVacacionesDtoRepository;
import com.bebolder.portalautoservicio.persistence.crud.SolicitudVacacionesCrudRepository;
import com.bebolder.portalautoservicio.persistence.entity.SolicitudVacacionesEntity;
import com.bebolder.portalautoservicio.persistence.mapper.SolicitudVacacionesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SolicitudVacacionesRepository implements SolicitudVacacionesDtoRepository {

    @Autowired
    private SolicitudVacacionesCrudRepository solicitudVacacionesCrudRepository;

    @Autowired
    private SolicitudVacacionesMapper mapper;

    // Metodo para las mostrar las solicitudes de vacaciones por usuario, desde la mas reciente en adelante
    @Override
    public Optional<List<SolicitudVacacionesDto>> getByUsuarioId(int usuarioId) {
        List<SolicitudVacacionesEntity> solicitudVacacionesEntities = solicitudVacacionesCrudRepository.findByUsuarioIdOrderByIdSolicitudVacacionesDesc(usuarioId);
        return Optional.of((mapper.toSolicitudesVacacionesDto(solicitudVacacionesEntities)));
    }


    @Override
    public SolicitudVacacionesDto save(SolicitudVacacionesDto solicitudVacacionesDto) {

        SolicitudVacacionesEntity solicitudVacaciones = mapper.toSolicitudVacacionesEntity(solicitudVacacionesDto);

        return mapper.toSolicitudVacacionesDto(solicitudVacacionesCrudRepository.save(solicitudVacaciones));
    }


}
