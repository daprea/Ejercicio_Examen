package com.DAM.EjercicoExamen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.DAM.EjercicoExamen.Repository.EmpleadoRepository;
import com.DAM.EjercicoExamen.model.Empleado;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	
	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	public List<Empleado> consultarEmpleados(){
		return empleadoRepository.findAll();
	}

}
