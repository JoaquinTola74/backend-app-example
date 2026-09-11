package com.oap.backend_crud.service;

import com.oap.backend_crud.entity.Persona;

import java.util.List;

public interface PersonaService {
    Persona save(Persona persona);
    List<Persona> findAll();
    Persona findById(Integer id);
    void deleteById(Integer id);
    Persona update(Persona persona);
}
