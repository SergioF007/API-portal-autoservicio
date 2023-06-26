package com.bebolder.portalautoservicio.persistence.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "solicitudes_vacaciones")
public class SolicitudVacacionesEntity {

    @Id
    @Column(name = "id_solicitud_vacaciones")
    private Integer idSolicitudVacaciones;

    @Column(name = "cantidad_dias")
    private Integer cantidadDias;

    @Column(name = "inicio_vacaciones")
    private Date inicioVacaciones;

    @Column(name = "fin_vacaciones")
    private Date finVacaciones;

    @Column(name = "fecha_reintegro")
    private Date fechaReintegro;

    private String observacion;

    @Column(name = "firma_empleado")
    private boolean firmaEmpleado;

    @Column(name = "firma_supervisor")
    private boolean firmaSupervisor;

    @OneToOne(mappedBy = "solicitudVacaciones")
    @JoinColumn(name = "gestion_solicitudes_id", insertable = false, updatable = false)
    private GestionSolicitudEntity gestionSolicitud;

    @OneToMany(mappedBy = "solicitudVacaciones")
    private VacacionesEntity vacaciones;


    
}
