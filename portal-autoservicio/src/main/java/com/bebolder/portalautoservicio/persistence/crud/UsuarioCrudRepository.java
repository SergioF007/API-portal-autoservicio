package com.bebolder.portalautoservicio.persistence.crud;

import com.bebolder.portalautoservicio.persistence.entity.UsuarioEntity;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioCrudRepository extends CrudRepository<UsuarioEntity, Integer> {

}
