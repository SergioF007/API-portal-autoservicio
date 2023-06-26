package com.bebolder.portalautoservicio.persistence.entity;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "usuarios")
public abstract class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "tipo_documento")
    private String tipoDocumento;

    private String documento;

    private String nombre;

    private  String apellidos;

    private String celular;

    private String direccion;

    @Column(name = "fecha_ingreso")
    private LocalDate fechaIngreso;

    @Column(name = "fecha_retiro")
    private LocalDate fechaRetiro;

    @Column(name = "tipo_contrato")
    private String tipoContrato;

    private boolean estado;

    private String cargo;

    private String correo;


    // - Inicio Relaciones

    // relacion con Tabla equipos
    @ManyToOne
    @JoinColumn(name = "equipo_id", insertable = false, updatable = false )
    private EquipoEntity equipo;


    // relacion con tabla usuarios_roles para saber cuantos roles cuenta el usuario
    @OneToMany(mappedBy = "usuario", cascade = {CascadeType.ALL})
    private List<UsuarioRolEntity> roles;


    // Listar las gestiones de solicitud por ususarios
    // Relacion: Una usuario puede tener de 1 a muchas gestiones de solicitud
    @OneToMany(mappedBy = "usuario", cascade = {CascadeType.ALL})
    private List<GestionSolicitudEntity> gestionSolicitud;


    // - Fin Relaciones - Creo sus setter y getter correspondientes


    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
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

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
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

    public EquipoEntity getEquipo() {
        return equipo;
    }

    public void setEquipo(EquipoEntity equipo) {
        this.equipo = equipo;
    }

    public List<UsuarioRolEntity> getRoles() {
        return roles;
    }

    public void setRoles(List<UsuarioRolEntity> roles) {
        this.roles = roles;
    }

    public List<GestionSolicitudEntity> getGestionSolicitud() {
        return gestionSolicitud;
    }

    public void setGestionSolicitud(List<GestionSolicitudEntity> gestionSolicitud) {
        this.gestionSolicitud = gestionSolicitud;
    }
}
