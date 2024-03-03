package com.DAM.EjercicoExamen.services;

import com.DAM.EjercicoExamen.model.Proyecto;

import java.util.List;

public interface ProyectoService {
    List<Proyecto> buscarTodos();

    List<Proyecto> buscarTodosPorDirector(Integer idDirector);

    Proyecto detalle(Integer idProyecto);

    Proyecto modificar(Proyecto proyecto);

    void borrar(Integer idProyecto);
}
