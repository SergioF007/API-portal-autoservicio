package com.bebolder.portalautoservicio.domain.dto;

import java.util.List;

public class RolDto {

    private Integer rolId;

    private String tipo;

    private List<UsuarioRolDto> usuarioRol;

    public Integer getRolId() {
        return rolId;
    }

    public void setRolId(Integer rolId) {
        this.rolId = rolId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<UsuarioRolDto> getUsuarioRol() {
        return usuarioRol;
    }

    public void setUsuarioRol(List<UsuarioRolDto> usuarioRol) {
        this.usuarioRol = usuarioRol;
    }
}
