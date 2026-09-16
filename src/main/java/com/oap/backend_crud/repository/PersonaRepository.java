package com.oap.backend_crud.repository;

import com.oap.backend_crud.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Integer> {
    @Query(value = "SELECT * FROM persona ORDER BY id DESC LIMIT 10", nativeQuery = true)
    List<Persona> ultimos10lista();
}
