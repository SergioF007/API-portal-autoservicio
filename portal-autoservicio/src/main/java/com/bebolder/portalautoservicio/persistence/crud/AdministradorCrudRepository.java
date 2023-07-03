package com.bebolder.portalautoservicio.persistence.crud;

import com.bebolder.portalautoservicio.persistence.entity.AdministradorEntity;
import com.bebolder.portalautoservicio.persistence.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdministradorCrudRepository extends CrudRepository<AdministradorEntity, Integer> {



    //Listar los Usuarios que su Id esten la la lista UserIds
    @Query(value = "SELECT * FROM usuarios u WHERE u.id_usuario IN ?1", nativeQuery = true)
    List<AdministradorEntity> getUsersByRol(List<Integer> userIds);

}
