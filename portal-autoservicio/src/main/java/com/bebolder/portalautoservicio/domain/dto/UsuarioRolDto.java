package com.bebolder.portalautoservicio.domain.dto;

public class UsuarioRolDto {

    private Integer usuarioId;

    private Integer rolID;

    private UsuarioDto usuario;

    private RolDto rol;

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Integer getRolID() {
        return rolID;
    }

    public void setRolID(Integer rolID) {
        this.rolID = rolID;
    }

    public UsuarioDto getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDto usuario) {
        this.usuario = usuario;
    }

    public RolDto getRol() {
        return rol;
    }

    public void setRol(RolDto rol) {
        this.rol = rol;
    }
}
