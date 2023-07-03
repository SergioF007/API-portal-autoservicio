package com.bebolder.portalautoservicio.domain.repository;

import com.bebolder.portalautoservicio.domain.dto.AdministradorDto;
import com.bebolder.portalautoservicio.domain.dto.SolicitudVacacionesDto;

import java.util.List;
import java.util.Optional;

public interface AdministradorDtoRepository {

    List<AdministradorDto> getAll();

    Optional<AdministradorDto> getUsuario(int usuarioId);

    Optional<List<AdministradorDto>> getUsersByRol(int rolId);

    AdministradorDto save(AdministradorDto administradorDto);

    void delete(int usuarioId);

}
