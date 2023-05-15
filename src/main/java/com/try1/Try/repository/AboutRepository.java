package com.try1.Try.repository;

import com.try1.Try.model.About;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutRepository extends JpaRepository<About,Integer>{
    
}
