package com.bebolder.portalautoservicio.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "vacaciones")
public class VacacionesEntity {

    @Id
    @Column(name = "id_vacaciones")
    private Integer idVacaciones;

    @ManyToOne
    @JoinColumn(name = "solicitud_vacaciones_id", insertable = false, updatable = false)
    private SolicitudVacacionesEntity solicitudVacaciones;

    private String periodo;

    @Column(name = "dias_disfrutados")
    private Integer diasDisfrutados;
}
