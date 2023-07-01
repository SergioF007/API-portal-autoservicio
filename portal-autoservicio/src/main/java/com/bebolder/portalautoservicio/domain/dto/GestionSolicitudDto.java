package com.bebolder.portalautoservicio.domain.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class GestionSolicitudDto {

    private int gestionSolicitudId;

    private int solicitudVacacionesId;

    private boolean aprobacionSupervisor;

    private boolean aprobacionAdministrador;

    private String estado;

    private LocalDateTime fecha;

    public int getGestionSolicitudId() {
        return gestionSolicitudId;
    }

    public void setGestionSolicitudId(int gestionSolicitudId) {
        this.gestionSolicitudId = gestionSolicitudId;
    }

    public int getSolicitudVacacionesId() {
        return solicitudVacacionesId;
    }

    public void setSolicitudVacacionesId(int solicitudVacacionesId) {
        this.solicitudVacacionesId = solicitudVacacionesId;
    }

    public boolean isAprobacionSupervisor() {
        return aprobacionSupervisor;
    }

    public void setAprobacionSupervisor(boolean aprobacionSupervisor) {
        this.aprobacionSupervisor = aprobacionSupervisor;
    }

    public boolean isAprobacionAdministrador() {
        return aprobacionAdministrador;
    }

    public void setAprobacionAdministrador(boolean aprobacionAdministrador) {
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
