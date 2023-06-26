package com.bebolder.portalautoservicio.domain.dto;

import java.time.LocalDate;
import java.util.List;

public abstract class UsuarioDto {

    private Integer usuarioId;

    private String tipoDocumento;

    private String documento;

    private String nombre;

    private String apellidos;

    private String celular;

    private LocalDate direccion;

    private LocalDate fechaIngreso;

    private LocalDate fechaRetiro;

    private boolean estado;

    private String cargo;

    private String correo;

    private EquipoDto equipo;

    private List<UsuarioRolDto> roles;

    private List<GestionSolicitudDto> gestionSolicitud;

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public LocalDate getDireccion() {
        return direccion;
    }

    public void setDireccion(LocalDate direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(LocalDate fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public EquipoDto getEquipo() {
        return equipo;
    }

    public void setEquipo(EquipoDto equipo) {
        this.equipo = equipo;
    }

    public List<UsuarioRolDto> getRoles() {
        return roles;
    }

    public void setRoles(List<UsuarioRolDto> roles) {
        this.roles = roles;
    }

    public List<GestionSolicitudDto> getGestionSolicitud() {
        return gestionSolicitud;
    }

    public void setGestionSolicitud(List<GestionSolicitudDto> gestionSolicitud) {
        this.gestionSolicitud = gestionSolicitud;
    }
}
