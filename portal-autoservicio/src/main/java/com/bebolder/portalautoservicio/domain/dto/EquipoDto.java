package com.bebolder.portalautoservicio.domain.dto;

import java.util.List;

public class EquipoDto {

    private int equipoId;

    private String nombreEquipo;

    private int supervisorEquipo;

    public int getEquipoId() {
        return equipoId;
    }

    public void setEquipoId(int equipoId) {
        this.equipoId = equipoId;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getSupervisorEquipo() {
        return supervisorEquipo;
    }

    public void setSupervisorEquipo(int supervisorEquipo) {
        this.supervisorEquipo = supervisorEquipo;
    }
}
