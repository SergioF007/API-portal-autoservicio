package com.bebolder.portalautoservicio.domain.dto;

import java.time.LocalDate;

public class SolicitudVacacionesDto {

    private int solicitudVacacionesId;

    private int cantidadDias;

    private LocalDate inicioVacaciones;

    private LocalDate finVacaciones;

    private LocalDate fechaReintegro;

    private String observacion;

    private boolean firmaEmpleado;

    private boolean firmaSupervisor;

    private int usuarioId;

    private GestionSolicitudDto gestionSolicitudDto;


    public int getSolicitudVacacionesId() {
        return solicitudVacacionesId;
    }

    public void setSolicitudVacacionesId(int solicitudVacacionesId) {
        this.solicitudVacacionesId = solicitudVacacionesId;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
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

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public GestionSolicitudDto getGestionSolicitudDto() {
        return gestionSolicitudDto;
    }

    public void setGestionSolicitudDto(GestionSolicitudDto gestionSolicitudDto) {
        this.gestionSolicitudDto = gestionSolicitudDto;
    }
}
