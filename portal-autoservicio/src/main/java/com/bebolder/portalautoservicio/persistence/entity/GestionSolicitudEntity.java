package com.bebolder.portalautoservicio.persistence.entity;

import javax.management.Notification;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "gestion_solicitudes")
public class GestionSolicitudEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "id_gestion_solicitudes")
    private Integer idGestionSolicitud;

    @Column(name = "aprobacion_supervisor")
    private boolean aprobacionSupervisor;

    @Column(name = "aprobacion_administracion")
    private boolean aprobacionAdministracion;

    @Column(name = "id_administrador")
    private Integer idAdministrador;


    @ManyToOne
    @JoinColumn(name = "usuario_id", insertable = false, updatable = false)
    private UsuarioEntity usuario;


    // Listar las notificaciones vinculadas a una gestionSolicitud
    // Relacion: Una gestionSolicitud puede tener de 1 a muchas solicitudes
    @OneToMany(mappedBy = "gestionSolicitud", cascade = {CascadeType.ALL})  // vamos a adicionarle que los notificaciones se van a guardar en cascada
    private List<NotificacionEntity> notificaciones;

    // relacion con el objeto de la clase  SolicitudVacacionesEntity
    // Relacion: por cada gestion_solicitudes hay una solicitud_vacaciones
    // creacion de lista de la solicudVaciones para asociarlas con un Usuarios
    @OneToOne(mappedBy = "gestionSolicitud", cascade = {CascadeType.ALL})
    private SolicitudVacacionesEntity solicitudVacaciones;


}
