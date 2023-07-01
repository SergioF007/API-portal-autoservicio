package com.bebolder.portalautoservicio.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "notificaciones")
public class NotificacionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_notificaion")
    private Integer idNotificacion;

    @Column(name = "gestion_solicitud_id")
    private Integer gestionSolicitudId;

    private String mensaje;

    // Relaciones

    // atributo relacion con el objeto de la clase gestionSolicitudEntity
    // Relacion: desde muchas hasta una NOTIFICAION puede tener una GESTION DE SOLICTUD
    @ManyToOne
    @JoinColumn(name = "gestion_solicitud_id", insertable = false, updatable = false)
    private GestionSolicitudEntity gestionSolicitud;

    public Integer getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(Integer idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public Integer getGestionSolicitudId() {
        return gestionSolicitudId;
    }

    public void setGestionSolicitudId(Integer gestionSolicitudId) {
        this.gestionSolicitudId = gestionSolicitudId;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public GestionSolicitudEntity getGestionSolicitud() {
        return gestionSolicitud;
    }

    public void setGestionSolicitud(GestionSolicitudEntity gestionSolicitud) {
        this.gestionSolicitud = gestionSolicitud;
    }
}
