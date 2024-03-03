package com.DAM.EjercicoExamen.services;

import com.DAM.EjercicoExamen.model.Empleado;
import com.DAM.EjercicoExamen.model.EmpleadosProyecto;

import java.util.List;

public interface EmpleadoService {
    List<Empleado> buscarTodos();

    EmpleadosProyecto asignar(Integer idProyecto, Integer idEmpleado);
}
