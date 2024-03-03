package com.DAM.EjercicoExamen.services;

import com.DAM.EjercicoExamen.model.Proyecto;
import com.DAM.EjercicoExamen.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoServicesImpl implements ProyectoService {

    @Autowired
    ProyectoRepository proyectoRepository;
    @Override
    public List<Proyecto> buscarTodos() {
        return proyectoRepository.findAll();
    }

    @Override
    public List<Proyecto> buscarTodosPorDirector(Integer idDirector) {
        return proyectoRepository.buscarTodosPorDirector(idDirector);
    }

    @Override
    public Proyecto detalle(Integer idProyecto) {
        return proyectoRepository.findById(idProyecto).get();
    }

    @Override
    public Proyecto modificar(Proyecto proyecto) {
        return proyectoRepository.save(proyecto);
    }

    @Override
    public void borrar(Integer idProyecto) {
        proyectoRepository.deleteById(idProyecto);
    }

}
