package com.bebolder.portalautoservicio.persistence.repository;

import com.bebolder.portalautoservicio.domain.dto.AdministradorDto;
import com.bebolder.portalautoservicio.domain.dto.UsuarioDto;
import com.bebolder.portalautoservicio.domain.repository.AdministradorDtoRepository;
import com.bebolder.portalautoservicio.persistence.crud.AdministradorCrudRepository;
import com.bebolder.portalautoservicio.persistence.entity.AdministradorEntity;
import com.bebolder.portalautoservicio.persistence.entity.UsuarioEntity;
import com.bebolder.portalautoservicio.persistence.mapper.AdministradorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AdministradorRepository implements AdministradorDtoRepository {

    @Autowired
    private AdministradorCrudRepository administradorCrudRepository;

    @Autowired
    private UsuarioRolRepositroy usuarioRolRepositroy;

    @Autowired
    private AdministradorMapper mapper;
    // trear todos los usuarios

    @Override
    public List<UsuarioDto> getAll() {

        List<UsuarioEntity> usuarios = (List<UsuarioEntity>) administradorCrudRepository.findAll();
        return mapper.toUsuarios(usuarios);
    }

    // traer los Usuarios segun su rolId
    @Override
    public Optional<List<UsuarioDto>> getUsersByRol(int rolId) {

        List<Integer> userIds = usuarioRolRepositroy.getByRolId(rolId);
        List<UsuarioEntity> usuarios = administradorCrudRepository.getUsersByRol(userIds);
        return Optional.of(mapper.toUsuarios(usuarios));

    }

    // Crear o Actulizar y estamos aplicando el metodo de CrudRepository
    @Override
    public AdministradorDto save(AdministradorDto administradorDto) {
        AdministradorEntity usuario = mapper.toUsuarioEntity(administradorDto);
        // se esta esta converesion porque save esperea es un objeto de AdministradorEntity no de AdministradorDto
        return mapper.toUsuarioDto(administradorCrudRepository.save(usuario));
    }


}
