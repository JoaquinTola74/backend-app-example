package com.oap.backend_crud.controller;

import com.oap.backend_crud.entity.Persona;
import com.oap.backend_crud.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
@RequiredArgsConstructor
public class PersonaController {

    private final PersonaService personaService;

    @PostMapping
    public Persona save(@RequestBody Persona persona) {
        return personaService.save(persona);
    }

    @GetMapping
    public List<Persona> findAll() {
        return personaService.findAll();
    }

    @GetMapping("/{id}")
    public Persona findById(@PathVariable Integer id) {
        return personaService.findById(id);
    }

    @PutMapping
    public Persona update(@RequestBody Persona persona) {
        return personaService.update(persona);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        personaService.deleteById(id);
    }
}

