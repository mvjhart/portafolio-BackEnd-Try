package com.try1.Try.controller;

import com.try1.Try.model.Proyecto;
import com.try1.Try.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://portafolio-frontend-mariani.web.app")
@RequestMapping("/proyectos")
public class ProyectoController {

    @Autowired
    IProyectoService proServ;

    @CrossOrigin(origins = "https://portafolio-frontend-mariani.web.app/proyectos")
    @GetMapping("/lista")
    @ResponseBody   
    public List<Proyecto> verProyectos(){   
        return proServ.verProyectos();
    }

    @CrossOrigin(origins = "https://portafolio-frontend-mariani.web.app/proyectos")    
    @PostMapping("/agregar")
    public void agregarProyecto(@RequestBody Proyecto p){
        proServ.agregarProyecto(p);
    }
    
    @CrossOrigin(origins = "https://portafolio-frontend-mariani.web.app/proyectos")       
    @DeleteMapping ("/borrar/{id}")
    public void borrarProyecto(@PathVariable Integer id){
        
        proServ.borrarProyecto(id);
    }
    
    @CrossOrigin(origins = "https://portafolio-frontend-mariani.web.app/proyectos")   
    @PutMapping("/update/{id}")
    public void updateProyecto(@PathVariable Integer id, @RequestBody Proyecto p){ 
        proServ.updateProyecto(id,p);
    }
}
