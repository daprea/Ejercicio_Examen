package com.DAM.EjercicoExamen.repository;

import com.DAM.EjercicoExamen.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProyectoRepository extends JpaRepository<Proyecto, Integer> {

    @Query("SELECT p FROM Proyecto p WHERE p.director.idEmpleado=?1")
    List<Proyecto> buscarTodosPorDirector(Integer idDirector);
}
