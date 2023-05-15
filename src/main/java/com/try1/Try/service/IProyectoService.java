package com.try1.Try.service;

import com.try1.Try.model.Proyecto;
import java.util.List;

public interface IProyectoService {

    public List<Proyecto> verProyectos();
    public void agregarProyecto(Proyecto p);
    public void borrarProyecto(Integer id);
    public boolean proyectoExists(Integer id);
    public void updateProyecto(Integer id,Proyecto p);
    
}
