package com.bebolder.portalautoservicio.persistence.crud;

import com.bebolder.portalautoservicio.persistence.entity.AdministradorEntity;
import com.bebolder.portalautoservicio.persistence.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AdministradorCrudRepository extends CrudRepository<UsuarioEntity, Integer> {



    //Listar los Usuarios que su Id esten la la lista UserIds
    @Query(value = "SELECT u FROM usuarios u WHERE u.id_usuario IN ?1")
    Optional<List<UsuarioEntity>> getUsersByRol(List<Integer> userIds);




}
