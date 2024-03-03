package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Proyecto;
import service.ProyectoService;

@RestController
@RequestMapping("/proyecto")

public class ProyectoController {

    @Autowired 
    ProyectoService  proyectoService;

    @GetMapping("/consultarProyecto")
    public Proyecto consultarProyecto(Integer id) {
    	return proyectoService.consultarProyecto(id);

    }
    
   //@GetMapping("/todoslosProyectos")
    

   //@GetMapping("/detalleProyecto")


   //@PostMapping("/editarProyecto")


   //@DeletedMapping("/borrarProyecto")

  
	
}