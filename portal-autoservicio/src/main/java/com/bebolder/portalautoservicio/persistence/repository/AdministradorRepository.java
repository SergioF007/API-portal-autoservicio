package com.bebolder.portalautoservicio.persistence.repository;

import com.bebolder.portalautoservicio.domain.dto.AdministradorDto;
import com.bebolder.portalautoservicio.domain.repository.AdministradorDtoRepository;
import com.bebolder.portalautoservicio.persistence.crud.AdministradorCrudRepository;
import com.bebolder.portalautoservicio.persistence.entity.AdministradorEntity;
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
    public List<AdministradorDto> getAll() {

        List<AdministradorEntity> usuarios = (List<AdministradorEntity>) administradorCrudRepository.findAll();
        return mapper.toUsuarios(usuarios);
    }
    @Override
    public Optional<AdministradorDto> getUsuario(int usuarioId) {
        return administradorCrudRepository.findById(usuarioId)
                .map(administradorEntity -> mapper.toUsuarioDto(administradorEntity));
    }

    // traer los Usuarios segun su rolId
    @Override
    public Optional<List<AdministradorDto>> getUsersByRol(int rolId) {

        List<Integer> userIds = usuarioRolRepositroy.getByRolId(rolId);
        List<AdministradorEntity> usuarios = administradorCrudRepository.getUsersByRol(userIds);
        return Optional.of(mapper.toUsuarios(usuarios));

    }

    // Crear o Actulizar y estamos aplicando el metodo de CrudRepository
    @Override
    public AdministradorDto save(AdministradorDto administradorDto) {
        AdministradorEntity usuario = mapper.toUsuarioEntity(administradorDto);
        // se esta esta converesion porque save esperea es un objeto de AdministradorEntity no de AdministradorDto
        return mapper.toUsuarioDto(administradorCrudRepository.save(usuario));
    }
    @Override
    public void delete(int usuarioId) {
        administradorCrudRepository.deleteById(usuarioId);
    }

}
