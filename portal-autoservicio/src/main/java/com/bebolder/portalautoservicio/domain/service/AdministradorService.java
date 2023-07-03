package com.bebolder.portalautoservicio.domain.service;

import com.bebolder.portalautoservicio.domain.dto.AdministradorDto;
import com.bebolder.portalautoservicio.domain.dto.SolicitudVacacionesDto;
import com.bebolder.portalautoservicio.domain.repository.AdministradorDtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdministradorService {

    @Autowired
    private AdministradorDtoRepository administradorDtoRepository;



    public List<AdministradorDto> getAll() {

        return administradorDtoRepository.getAll();

    }

    public Optional<List<AdministradorDto>> getUserByRol(int rolId) {
        return administradorDtoRepository.getUsersByRol(rolId);
    }

    public Optional<AdministradorDto> getUsuario(int usuarioId) {
        return administradorDtoRepository.getUsuario(usuarioId);
    }

    public AdministradorDto save(AdministradorDto administradorDto) {

        return administradorDtoRepository.save(administradorDto);
    }

    public boolean delete(int usuarioId) {
        // primero valimado si encontrmaos el usuario y luego si lo elimnamos
        return getUsuario(usuarioId)
                .map(administradorDto -> {administradorDtoRepository.delete(usuarioId);
                return true;
                }).orElse(false);
    }


}
