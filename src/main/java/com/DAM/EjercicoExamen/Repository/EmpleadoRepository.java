package com.DAM.EjercicoExamen.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DAM.EjercicoExamen.model.Empleado;

public interface  EmpleadoRepository  extends JpaRepository <Empleado, Integer> {

}
