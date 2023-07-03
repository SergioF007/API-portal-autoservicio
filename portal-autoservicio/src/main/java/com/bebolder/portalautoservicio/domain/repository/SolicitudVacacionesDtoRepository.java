package com.bebolder.portalautoservicio.domain.repository;

import com.bebolder.portalautoservicio.domain.dto.SolicitudVacacionesDto;

import java.util.List;
import java.util.Optional;

public interface SolicitudVacacionesDtoRepository {


    // Metodo para las mostrar las solicitudes de vacaciones por usuario, desde la mas reciente en adelante
    Optional<List<SolicitudVacacionesDto>> getByUsuarioId(int usuarioId);

    SolicitudVacacionesDto save(SolicitudVacacionesDto solicitudVacacionesDto);
}
