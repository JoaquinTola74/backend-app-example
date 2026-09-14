package com.oap.backend_crud.service;

import com.oap.backend_crud.entity.Persona;
import com.oap.backend_crud.repository.PersonaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonaServiceImp implements PersonaService {

    private final PersonaRepository personaRepository;

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
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona update(Persona persona) {
        Persona personaDb = findById(persona.getId());
        if (personaDb != null) {
            BeanUtils.copyProperties(persona, personaDb, "id");
            return personaRepository.save(personaDb);
        }
        return personaRepository.save(persona);
    }
}

