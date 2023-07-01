package com.bebolder.portalautoservicio.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "vacaciones")
public class VacacionesEntity {

    @Id
    @Column(name = "id_vacaciones")
    private Integer idVacaciones;

    @Column(name = "gestion_solicitud_id")
    private Integer gestionSolicitudId;
    private String periodo;

    @Column(name = "dias_disfrutados")
    private Integer diasDisfrutados;

    // Relaciones
    @ManyToOne
    @JoinColumn(name = "gestion_solicitud_id", insertable = false, updatable = false)
    private GestionSolicitudEntity gestionSolicitud;

    public Integer getIdVacaciones() {
        return idVacaciones;
    }

    public void setIdVacaciones(Integer idVacaciones) {
        this.idVacaciones = idVacaciones;
    }

    public Integer getGestionSolicitudId() {
        return gestionSolicitudId;
    }

    public void setGestionSolicitudId(Integer gestionSolicitudId) {
        this.gestionSolicitudId = gestionSolicitudId;
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

    public GestionSolicitudEntity getGestionSolicitud() {
        return gestionSolicitud;
    }

    public void setGestionSolicitud(GestionSolicitudEntity gestionSolicitud) {
        this.gestionSolicitud = gestionSolicitud;
    }
}
