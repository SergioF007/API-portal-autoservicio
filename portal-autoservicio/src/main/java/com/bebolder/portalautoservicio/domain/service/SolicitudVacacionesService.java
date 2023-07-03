package com.bebolder.portalautoservicio.domain.service;

import com.bebolder.portalautoservicio.domain.dto.SolicitudVacacionesDto;
import com.bebolder.portalautoservicio.domain.repository.SolicitudVacacionesDtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SolicitudVacacionesService {

    @Autowired
    private SolicitudVacacionesDtoRepository solicitudVacacionesDtoRepository;

    /*
    public Optional<List<SolicitudVacacionesDto>> getByUsuarioId(int usuarioId) {
        return administradorDtoRepository.getSolicitudesVacacionesByUsuario(usuarioId);
    }

    */

    public Optional<List<SolicitudVacacionesDto>> getByUsuarioId(int usuariosId) {
        return solicitudVacacionesDtoRepository.getByUsuarioId(usuariosId);
    }

    public SolicitudVacacionesDto save(SolicitudVacacionesDto solicitudVacacionesDto) {

        return solicitudVacacionesDtoRepository.save(solicitudVacacionesDto);
    }


}
