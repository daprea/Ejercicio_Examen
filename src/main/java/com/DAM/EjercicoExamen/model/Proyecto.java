package com.DAM.EjercicoExamen.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@Entity
@Table(name="proyectos")
public class Proyecto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_proyecto")
	private Integer idProyecto;

    private String descripcion;

    @Column(name="fecha_inicio")
    private Date fechaInicio;

    @Column(name="dias_previstos")
    private int dissPrevistos;

    @ManyToOne
    @JoinColumn(name = "director", referencedColumnName = "id_empleado")
    private Empleado director;

    private String estado;



} 