package com.DAM.EjercicoExamen.controller;

import com.DAM.EjercicoExamen.model.Proyecto;
import com.DAM.EjercicoExamen.services.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyectos")
public class ProyectoController {

    @Autowired
    ProyectoService proyectoService;

    @GetMapping("/all")
    public ResponseEntity<List<Proyecto>> todosProyectos(){
        return new ResponseEntity<>(proyectoService.buscarTodos(), HttpStatus.OK);
    }

    @GetMapping("/proyectosDelDirector/{id}")
    public ResponseEntity<List<Proyecto>> todosEmpleados(@PathVariable Integer id) {
        return new ResponseEntity<>(proyectoService.buscarTodosPorDirector(id), HttpStatus.OK);
    }

    @GetMapping("/detalle/{id}")
    public ResponseEntity<Proyecto> detalle(@PathVariable Integer id) {
        return new ResponseEntity<>(proyectoService.detalle(id), HttpStatus.OK);
    }

    @PostMapping("/modificar")
    public ResponseEntity<Proyecto> modificar(@RequestBody Proyecto proyecto) {
        return new ResponseEntity<>(proyectoService.modificar(proyecto), HttpStatus.OK);
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<Proyecto> borrar(@PathVariable Integer id) {
        proyectoService.borrar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
