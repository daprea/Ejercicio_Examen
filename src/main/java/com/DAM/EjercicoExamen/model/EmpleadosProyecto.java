package com.DAM.EjercicoExamen.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@Entity
@Table(name="empleados_en_proyecto")
public class EmpleadosProyecto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_entrada")
	private Integer idEntrada;

    @ManyToOne
    @JoinColumn(name = "id_proyecto", referencedColumnName = "id_proyecto")
    private Proyecto proyecto;

    @ManyToOne
    @JoinColumn(name = "id_empleado", referencedColumnName = "id_empleado")
    private Empleado empleado;

    @Column(name="dias_previstos")
    private Integer diasPrevistos;

    @Column(name="fecha_incorporacion")
    private Date fechaIncorporacion;




} 