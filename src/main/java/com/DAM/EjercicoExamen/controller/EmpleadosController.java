package com.DAM.EjercicoExamen.controller;

import com.DAM.EjercicoExamen.model.Empleado;
import com.DAM.EjercicoExamen.model.EmpleadosProyecto;
import com.DAM.EjercicoExamen.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadosController {

    @Autowired
    EmpleadoService empleadoService;

    @GetMapping("/all")
    public ResponseEntity<List<Empleado>> todosEmpleados(){
       return new ResponseEntity<>(empleadoService.buscarTodos(), HttpStatus.OK);
    }

    @PostMapping("/asignar/{idProyecto}/{idEmpleado}")
    public ResponseEntity<EmpleadosProyecto> asignar(@PathVariable Integer idProyecto, @PathVariable Integer idEmpleado) {
        return new ResponseEntity<>(empleadoService.asignar(idProyecto, idEmpleado), HttpStatus.OK);
    }
}
