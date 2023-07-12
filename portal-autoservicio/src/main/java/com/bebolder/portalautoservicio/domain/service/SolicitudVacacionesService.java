package com.bebolder.portalautoservicio.domain.service;

import com.bebolder.portalautoservicio.domain.dto.SolicitudVacacionesDto;
import com.bebolder.portalautoservicio.domain.repository.SolicitudVacacionesDtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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

        // Validar la solicitud de vacaciones con las reglas de negocio

        validarFechaInicio(solicitudVacacionesDto);


        //si todas las validaciones pasan se procede a guardar la solicitud de vacaciones
        try {
            return solicitudVacacionesDtoRepository.save(solicitudVacacionesDto);

        } catch (Exception e) {
            throw new ValidacionException("Error al guardar la solicitud de vacaciones");
        }
    }

    private void validarFechaInicio(SolicitudVacacionesDto solicitudVacacionesDto) {
        LocalDate fechaCreacion = LocalDate.now();
        LocalDate fechaInicio = solicitudVacacionesDto.getInicioVacaciones();

        long diasDiferencia = ChronoUnit.DAYS.between(fechaCreacion, fechaInicio);
        if (diasDiferencia <= 15) {
            throw new ValidacionException("La fecha de inicio de las vacaciones debe ser al menos 15 dias antes de la fecha de creación de la solicitud.");
        }
    }

    public class ValidacionException extends RuntimeException {
        public ValidacionException(String mensaje) {
            super(mensaje);
        }
    }

}
