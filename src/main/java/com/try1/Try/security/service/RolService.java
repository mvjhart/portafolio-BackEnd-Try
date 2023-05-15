package com.try1.Try.security.service;

import com.try1.Try.security.enums.RolNombre;
import com.try1.Try.security.model.Rol;
import com.try1.Try.security.repository.RolRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RolService {
    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        rolRepository.save(rol);
    }
    
    public boolean rolExists(Integer id){
        return rolRepository.existsById(id);
    }
}
