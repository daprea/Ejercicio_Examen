package com.DAM.EjercicoExamen.services;

import com.DAM.EjercicoExamen.model.Empleado;
import com.DAM.EjercicoExamen.model.EmpleadosProyecto;
import com.DAM.EjercicoExamen.repository.EmpleadoRepository;
import com.DAM.EjercicoExamen.repository.EmpleadosProyectoRepository;
import com.DAM.EjercicoExamen.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EmpleadoServicesImpl implements EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    @Autowired
    EmpleadosProyectoRepository empleadosProyectoRepository;

    @Autowired
    ProyectoRepository proyectoRepository;

    @Override
    public List<Empleado> buscarTodos() {
        return empleadoRepository.findAll();
    }

    @Override
    public EmpleadosProyecto asignar(Integer idProyecto, Integer idEmpleado) {
        EmpleadosProyecto empleadosProyecto = new EmpleadosProyecto();
        empleadosProyecto.setEmpleado(empleadoRepository.findById(idEmpleado).get());
        empleadosProyecto.setProyecto(proyectoRepository.findById(idProyecto).get());
        empleadosProyecto.setFechaIncorporacion(new Date());
        empleadosProyecto.setDiasPrevistos(30);
        return empleadosProyectoRepository.save(empleadosProyecto);
    }

}
