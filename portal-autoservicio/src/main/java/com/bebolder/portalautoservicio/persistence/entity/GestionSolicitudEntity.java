package com.bebolder.portalautoservicio.persistence.entity;

import javax.management.Notification;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "gestion_solicitudes")
public class GestionSolicitudEntity {

    @Id
    @Column(name = "id_gestion_solicitud")
    private Integer idGestionSolicitud;

    @Column(name = "solicitud_vacaciones_id")
    private Integer solicitudVacacionesId;

    @Column(name = "aprobacion_supervisor")
    private Boolean aprobacionSupervisor;

    @Column(name = "aprobacion_administrador")
    private Boolean aprobacionAdministrador;

    private String estado;

    private LocalDateTime fecha;

    // tomar la solicitud de vacaciones asociada a la gestion solicitud
    //@JoinColumn(name = "solicitud_vacaciones_id", insertable = false, updatable = false)

    /*
    @OneToOne(mappedBy = "gestionSolicitud")
    private SolicitudVacacionesEntity solicitudVacaciones;


     */

    // Listar las notificaciones vinculadas a una gestionSolicitud
    // Relacion: Una gestionSolicitud puede tener de 1 a muchas solicitudes

    /*
    @OneToMany(mappedBy = "gestionSolicitud")  // vamos a adicionarle que los notificaciones se van a guardar en cascada
    private List<NotificacionEntity> notificaciones;

    // Relacion: listar las vacaciones por gestion de solicitud
    @OneToMany(mappedBy = "gestionSolicitud")
    private List<VacacionesEntity> vacaciones;

     */

    public Integer getIdGestionSolicitud() {
        return idGestionSolicitud;
    }

    public void setIdGestionSolicitud(Integer idGestionSolicitud) {
        this.idGestionSolicitud = idGestionSolicitud;
    }

    public Integer getSolicitudVacacionesId() {
        return solicitudVacacionesId;
    }

    public void setSolicitudVacacionesId(Integer solicitudVacacionesId) {
        this.solicitudVacacionesId = solicitudVacacionesId;
    }

    public Boolean getAprobacionSupervisor() {
        return aprobacionSupervisor;
    }

    public void setAprobacionSupervisor(Boolean aprobacionSupervisor) {
        this.aprobacionSupervisor = aprobacionSupervisor;
    }

    public Boolean getAprobacionAdministrador() {
        return aprobacionAdministrador;
    }

    public void setAprobacionAdministrador(Boolean aprobacionAdministrador) {
        this.aprobacionAdministrador = aprobacionAdministrador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }


}
