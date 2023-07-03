package com.bebolder.portalautoservicio.persistence.crud;


import com.bebolder.portalautoservicio.persistence.entity.SolicitudVacacionesEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SolicitudVacacionesCrudRepository extends CrudRepository<SolicitudVacacionesEntity, Integer> {


    List<SolicitudVacacionesEntity> findByUsuarioIdOrderByIdSolicitudVacacionesDesc(int usuarioId);


}
