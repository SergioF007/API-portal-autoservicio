package com.bebolder.portalautoservicio.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "vacaciones")
public class VacacionesEntity {

    @Id
    @Column(name = "id_vacaciones")
    private Integer idVacaciones;

    @ManyToOne
    @JoinColumn(name = "solicitud_vacaciones_id", insertable = false, updatable = false)
    private SolicitudVacacionesEntity solicitudVacaciones;

    private String periodo;

    @Column(name = "dias_disfrutados")
    private Integer diasDisfrutados;

    public Integer getIdVacaciones() {
        return idVacaciones;
    }

    public void setIdVacaciones(Integer idVacaciones) {
        this.idVacaciones = idVacaciones;
    }

    public SolicitudVacacionesEntity getSolicitudVacaciones() {
        return solicitudVacaciones;
    }

    public void setSolicitudVacaciones(SolicitudVacacionesEntity solicitudVacaciones) {
        this.solicitudVacaciones = solicitudVacaciones;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Integer getDiasDisfrutados() {
        return diasDisfrutados;
    }

    public void setDiasDisfrutados(Integer diasDisfrutados) {
        this.diasDisfrutados = diasDisfrutados;
    }
}
