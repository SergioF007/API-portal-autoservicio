package com.bebolder.portalautoservicio.persistence.repository;

import com.bebolder.portalautoservicio.persistence.crud.AdministradorCrudRepository;
import com.bebolder.portalautoservicio.persistence.entity.AdministradorEntity;
import com.bebolder.portalautoservicio.persistence.entity.UsuarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AdministradorRepository {

    @Autowired
    private AdministradorCrudRepository administradorCrudRepository;

    @Autowired
    private UsuarioRolRepositroy usuarioRolRepositroy;
    // trear todos los usuarios

    public List<UsuarioEntity> getAll() {

        return (List<UsuarioEntity>) administradorCrudRepository.findAll();
    }

    // traer los Usuarios segun su rolId
    public Optional<List<UsuarioEntity>> getUsersByRol(int rolId) {

        List<Integer> userIds = usuarioRolRepositroy.getByRolId(rolId);
        return administradorCrudRepository.getUsersByRol(userIds);

    }

    // Crear o Actulizar y estamos aplicando el metodo de CrudRepository
    public UsuarioEntity save(UsuarioEntity usuario) {
        return administradorCrudRepository.save(usuario);
    }


}
