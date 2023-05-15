package com.try1.Try.security.repository;

import com.try1.Try.security.enums.RolNombre;
import com.try1.Try.security.model.Rol;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);  
}
