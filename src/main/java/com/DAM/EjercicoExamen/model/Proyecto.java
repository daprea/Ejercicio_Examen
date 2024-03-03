package com.DAM.EjercicoExamen.model;

import java.sql.Date;

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
@Table(name="Proyectos")
public class Proyecto {


@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_proyecto")
	private Integer idProyecto;
	
	private String descripcion;
		
	private Date fechaInicio; 
	
	private Integer diasPrevistos;
	
	private Integer director;
	
	private String estado;
	
	
}
