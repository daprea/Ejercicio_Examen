package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import Repository.EmpleadoRepository;
import model.Empleado;

public class EmpleadoServiceImpl implements EmpleadoService {
	
	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	public List<Empleado> consultarEmpleados(){
		return empleadoRepository.findAll();
	}

}
