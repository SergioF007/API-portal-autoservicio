package com.bebolder.portalautoservicio.persistence.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "solicitudes_vacaciones")
public class SolicitudVacacionesEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "id_solicitud_vacaciones")
    private Integer idSolicitudVacaciones;

    @Column(name = "cantidad_dias")
    private Integer cantidadDias;

    @Column(name = "inicio_vacaciones")
    private LocalDate inicioVacaciones;

    @Column(name = "fin_vacaciones")
    private LocalDate finVacaciones;

    @Column(name = "fecha_reintegro")
    private LocalDate fechaReintegro;

    private String observacion;

    @Column(name = "firma_empleado")
    private boolean firmaEmpleado;

    @Column(name = "firma_supervisor")
    private boolean firmaSupervisor;

    @JoinColumn(name = "usuario_id", insertable = false, updatable = false)
    private Integer usuarioId;

    // Incio Relaciones

    /*
    @ManyToOne
    @JoinColumn(name = "usuario_id", insertable = false, updatable = false)
    private AdministradorEntity usuario;


     */
    // relacion con el objeto de la clase  GestionSolicitudEntity
    // Relacion: por cada solicitud_vacaciones hay una  gestion_solicitudes
    @OneToOne
    @JoinColumn(name = "id_solicitud_vacaciones",  insertable = false, updatable = false)
    private GestionSolicitudEntity gestionSolicitud;

    public Integer getIdSolicitudVacaciones() {
        return idSolicitudVacaciones;
    }

    public void setIdSolicitudVacaciones(Integer idSolicitudVacaciones) {
        this.idSolicitudVacaciones = idSolicitudVacaciones;
    }

    public Integer getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(Integer cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public LocalDate getInicioVacaciones() {
        return inicioVacaciones;
    }

    public void setInicioVacaciones(LocalDate inicioVacaciones) {
        this.inicioVacaciones = inicioVacaciones;
    }

    public LocalDate getFinVacaciones() {
        return finVacaciones;
    }

    public void setFinVacaciones(LocalDate finVacaciones) {
        this.finVacaciones = finVacaciones;
    }

    public LocalDate getFechaReintegro() {
        return fechaReintegro;
    }

    public void setFechaReintegro(LocalDate fechaReintegro) {
        this.fechaReintegro = fechaReintegro;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public boolean isFirmaEmpleado() {
        return firmaEmpleado;
    }

    public void setFirmaEmpleado(boolean firmaEmpleado) {
        this.firmaEmpleado = firmaEmpleado;
    }

    public boolean isFirmaSupervisor() {
        return firmaSupervisor;
    }

    public void setFirmaSupervisor(boolean firmaSupervisor) {
        this.firmaSupervisor = firmaSupervisor;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }


    public GestionSolicitudEntity getGestionSolicitud() {
        return gestionSolicitud;
    }

    public void setGestionSolicitud(GestionSolicitudEntity gestionSolicitud) {
        this.gestionSolicitud = gestionSolicitud;
    }
}
