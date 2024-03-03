package com.DAM.EjercicoExamen.service;

import jakarta.websocket.server.ServerEndpoint;
import org.springframework.beans.factory.annotation.Autowired;

import com.DAM.EjercicoExamen.Repository.ProyectoRepository;
import com.DAM.EjercicoExamen.model.Proyecto;
import org.springframework.stereotype.Service;

@Service
public class ProyectoServiceImpl implements ProyectoService {
	
	@Autowired
	private ProyectoRepository proyectoRepository;
	
	public Proyecto consultarProyecto(Integer id) {
		return proyectoRepository.findById(id).get();
	}
	
	

}
