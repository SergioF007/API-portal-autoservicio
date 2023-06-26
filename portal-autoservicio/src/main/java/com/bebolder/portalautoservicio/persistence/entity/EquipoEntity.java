package com.bebolder.portalautoservicio.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "equipos")
public class EquipoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equipo")
    private Integer idEquipo;

    @Column(name = "nombre_equipo")
    private String nombreEquipo;

    @Column(name = "supervisor_lider")
    private Integer supervisorEquipo;

    @OneToMany(mappedBy = "equipo", cascade = {CascadeType.ALL})
    private List<UsuarioEntity> usuarios;



}
