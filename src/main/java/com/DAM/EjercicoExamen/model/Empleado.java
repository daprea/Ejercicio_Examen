package com.DAM.EjercicoExamen.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name="empleados")
public class Empleado {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column (name="id_empleado")
	private Integer idEmpleado;

    private String nombre;
    private String email;
    private double sueldo;
    private int categoria;

} 