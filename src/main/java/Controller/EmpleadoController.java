package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Empleado;
import service.EmpleadoService;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
	
	@Autowired
	EmpleadoService empleadoService;
	
	
	@GetMapping("/test")
    public  ResponseEntity<List<Empleado>> test(){
        return new ResponseEntity<>(HttpStatus.OK);

    }
	
	@GetMapping("/ConsultarEmpleados")
    public List<Empleado> consultarEmpleados(){
        return empleadoService.consultarEmpleados();

    }
    
    
    //@PostMapping("/asignarEmpleados")
    
	
}

//Consultar todos los proyectos
//Consultar todos los proyectos de un director
//Consultar el detalle de un proyecto
//Modificar/editar el proyecto
//Borrar proyecto
//Consultar todos los empleados
//Asignar empleado a proyecto