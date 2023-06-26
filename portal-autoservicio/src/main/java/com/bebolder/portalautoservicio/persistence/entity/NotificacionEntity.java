package com.bebolder.portalautoservicio.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "notificaciones")
public class NotificacionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_notificaion")
    private Integer idNotificacion;


    // atributo relacion con el objeto de la clase gestionSolicitudEntity
    // Relacion: desde muchas hasta una NOTIFICAION puede tener una GESTION DE SOLICTUD
    @ManyToOne
    @JoinColumn(name = "gestion_solicitudes_id", insertable = false, updatable = false)
    private GestionSolicitudEntity gestionSolicitud;

    private String mensaje;





    public Integer getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(Integer idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public GestionSolicitudEntity getGestionSolicitud() {
        return gestionSolicitud;
    }

    public void setGestionSolicitud(GestionSolicitudEntity gestionSolicitud) {
        this.gestionSolicitud = gestionSolicitud;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
