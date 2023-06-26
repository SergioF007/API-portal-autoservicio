package com.bebolder.portalautoservicio.domain.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GestionSolicitudDto {

    private Integer GestionSolicitud;

    private boolean aprobacionSupervisor;

    private boolean aprobacionAdministrador;

    private String estado;

    private LocalDateTime fecha;

    private Integer usuarioId;

    private UsuarioDto usuario;

    private SolicitudVacacionesDto solicitudVacaciones;

    public Integer getGestionSolicitud() {
        return GestionSolicitud;
    }

    public void setGestionSolicitud(Integer gestionSolicitud) {
        GestionSolicitud = gestionSolicitud;
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

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public UsuarioDto getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDto usuario) {
        this.usuario = usuario;
    }

    public SolicitudVacacionesDto getSolicitudVacaciones() {
        return solicitudVacaciones;
    }

    public void setSolicitudVacaciones(SolicitudVacacionesDto solicitudVacaciones) {
        this.solicitudVacaciones = solicitudVacaciones;
    }
}
