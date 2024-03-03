package service;

import org.springframework.beans.factory.annotation.Autowired;

import Repository.ProyectoRepository;
import model.Proyecto;

public class ProyectoServiceImpl implements ProyectoService {
	
	@Autowired
	private ProyectoRepository proyectoRepository;
	
	public Proyecto consultarProyecto(Integer id) {
		return proyectoRepository.findById(id).get();
	}
	
	

}
