package com.bebolder.portalautoservicio.domain.dto;

import java.time.LocalDate;

public class SolicitudVacacionesDto {

    private Integer SolicitudVacacionesId;

    private Integer cantidadDias;

    private LocalDate inicioVacaciones;

    private LocalDate finVacaciones;

    private LocalDate fechaReintegro;

    private String observacion;

    private boolean firmaEmpleado;

    private boolean firmaSupervisor;

    private Integer gestionSolicitudId;

    private GestionSolicitudDto gestionSolicitud;

    public Integer getSolicitudVacacionesId() {
        return SolicitudVacacionesId;
    }

    public void setSolicitudVacacionesId(Integer solicitudVacacionesId) {
        SolicitudVacacionesId = solicitudVacacionesId;
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

    public Integer getGestionSolicitudId() {
        return gestionSolicitudId;
    }

    public void setGestionSolicitudId(Integer gestionSolicitudId) {
        this.gestionSolicitudId = gestionSolicitudId;
    }


}
