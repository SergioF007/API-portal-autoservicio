package com.bebolder.portalautoservicio.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "roles")
public class RolEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Integer idRol;

    private String tipo;

    //Relacion para listar Usuarios por rol
    @OneToMany( mappedBy = "rol", cascade = {CascadeType.ALL})
    private List<UsuarioRolEntity> usuariosRol;

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<UsuarioRolEntity> getUsuariosRol() {
        return usuariosRol;
    }

    public void setUsuariosRol(List<UsuarioRolEntity> usuariosRol) {
        this.usuariosRol = usuariosRol;
    }
}
