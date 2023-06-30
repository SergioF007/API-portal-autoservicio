package com.bebolder.portalautoservicio.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "usuarios_roles")
public class UsuarioRolEntity {

    @Id
    @Column(name = "usuario_id")
    private Integer usuarioId;

    @Column(name = "rol_id")
    private Integer rolId;

    @ManyToOne
    @JoinColumn(name = "usuario_id", insertable = false, updatable = false)
    private AdministradorEntity usuario;

    @ManyToOne
    @JoinColumn(name = "rol_id", insertable = false, updatable = false)
    private RolEntity rol;

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Integer getRolId() {
        return rolId;
    }

    public void setRolId(Integer rolId) {
        this.rolId = rolId;
    }

    public AdministradorEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(AdministradorEntity usuario) {
        this.usuario = usuario;
    }

    public RolEntity getRol() {
        return rol;
    }

    public void setRol(RolEntity rol) {
        this.rol = rol;
    }
}
