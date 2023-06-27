package com.bebolder.portalautoservicio.domain.repository;

import com.bebolder.portalautoservicio.domain.dto.AdministradorDto;
import com.bebolder.portalautoservicio.domain.dto.UsuarioDto;

import java.util.List;
import java.util.Optional;

public interface AdministradorDtoRepository {

    List<UsuarioDto> getAll();

    Optional<List<UsuarioDto>> getUsersByRol(int rolId);

    AdministradorDto save(AdministradorDto administradorDto);
}
