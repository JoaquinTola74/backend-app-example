package com.oap.backend_crud.repository;

import com.oap.backend_crud.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Integer> {

}
