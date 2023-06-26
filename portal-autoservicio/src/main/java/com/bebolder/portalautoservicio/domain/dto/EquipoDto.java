package com.bebolder.portalautoservicio.domain.dto;

import java.util.List;

public class EquipoDto {

    private Integer idEquipo;

    private String nombreEquipo;

    private Integer supervisorEquipo;

    private List<UsuarioDto> usuarios;

    public Integer getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public Integer getSupervisorEquipo() {
        return supervisorEquipo;
    }

    public void setSupervisorEquipo(Integer supervisorEquipo) {
        this.supervisorEquipo = supervisorEquipo;
    }

    public List<UsuarioDto> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<UsuarioDto> usuarios) {
        this.usuarios = usuarios;
    }
}
