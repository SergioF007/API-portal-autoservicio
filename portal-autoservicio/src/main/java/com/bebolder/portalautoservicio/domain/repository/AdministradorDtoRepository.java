package com.bebolder.portalautoservicio.domain.repository;

import com.bebolder.portalautoservicio.domain.dto.AdministradorDto;

import java.util.List;
import java.util.Optional;

public interface AdministradorDtoRepository {

    List<AdministradorDto> getAll();

    Optional<List<AdministradorDto>> getUsersByRol(int rolId);

    AdministradorDto save(AdministradorDto administradorDto);
}
