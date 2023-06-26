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

    public Date getInicioVacaciones() {
        return inicioVacaciones;
    }

    public void setInicioVacaciones(Date inicioVacaciones) {
        this.inicioVacaciones = inicioVacaciones;
    }

    public Date getFinVacaciones() {
        return finVacaciones;
    }

    public void setFinVacaciones(Date finVacaciones) {
        this.finVacaciones = finVacaciones;
    }

    public Date getFechaReintegro() {
        return fechaReintegro;
    }

    public void setFechaReintegro(Date fechaReintegro) {
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

    public GestionSolicitudEntity getGestionSolicitud() {
        return gestionSolicitud;
    }

    public void setGestionSolicitud(GestionSolicitudEntity gestionSolicitud) {
        this.gestionSolicitud = gestionSolicitud;
    }

    public VacacionesEntity getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(VacacionesEntity vacaciones) {
        this.vacaciones = vacaciones;
    }
}
