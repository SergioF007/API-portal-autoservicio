package com.bebolder.portalautoservicio.persistence.repository;

import com.bebolder.portalautoservicio.persistence.crud.UsuarioRolCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioRolRepositroy {

    @Autowired
    private UsuarioRolCrudRepository usuarioRolCrudRepository;



    public List<Integer> getByRolId(int rolId) {
        return usuarioRolCrudRepository.getUserIdsByRol(rolId);
    }


}
