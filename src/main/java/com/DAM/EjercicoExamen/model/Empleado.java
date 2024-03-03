package com.DAM.EjercicoExamen.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name="Empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_empleado")
    private Integer idEmpleado;
    private String nombre;
    private String email;
    private Integer sueldo;
    private Integer categoria;




}
