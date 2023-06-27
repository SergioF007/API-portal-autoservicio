package com.bebolder.portalautoservicio.persistence.crud;

import com.bebolder.portalautoservicio.persistence.entity.UsuarioRolEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioRolCrudRepository extends CrudRepository<UsuarioRolEntity, Integer> {

    // traer los usuario_id por con el rol_id
    @Query(value = "SELECT usuario_id FROM usuarios_roles WHERE rol_id = ? ", nativeQuery = true)
    List<Integer> getUserIdsByRol(int rolId);




}
