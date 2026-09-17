package com.oap.backend_crud.service;

import com.oap.backend_crud.entity.Persona;
import com.oap.backend_crud.repository.PersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImp implements PersonaService{

    private final PersonaRepository personaRepository;

    public PersonaServiceImp(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    //private Persona persona;

    @Override
    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    @Override
    public Persona findById(Integer id) {
        return personaRepository.findById(id).get();
    }

    @Override
    public void deleteById(Integer id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona update(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public List<Persona> ultimos() {
        return List.of();
    }
}
