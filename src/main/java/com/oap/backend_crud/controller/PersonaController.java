package com.oap.backend_crud.controller;

import com.oap.backend_crud.entity.Persona;
import com.oap.backend_crud.service.PersonaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @PostMapping("personas")
    public Persona save(@RequestBody Persona persona){
        return personaService.save(persona);
    }
    @GetMapping("personas")
    public List<Persona> findAll(){
        List<Persona> personas = personaService.findAll();
        return personas.stream().filter(p -> p.getNombre().equals("MARIA")).collect(Collectors.toList());
    }
    @GetMapping("personas/{id}")
    public Persona findAllById(@PathVariable Integer id){
        return personaService.findById(id);
    }
    @DeleteMapping("personas/{id}")
    public void deleteById(@PathVariable Integer id){
        personaService.deleteById(id);
    }
    @PutMapping("personas")
    public Persona update(@RequestBody Persona persona){
        Persona personaDb=personaService.findById(persona.getId());
        personaDb.setCi(persona.getCi());
        personaDb.setNombre(persona.getNombre());
        personaDb.setAp_paterno(persona.getAp_paterno());
        personaDb.setAp_materno(persona.getAp_materno());
        personaDb.setExpedido(persona.getExpedido());
        personaDb.setCelular(persona.getCelular());
        personaDb.setCod_uni_canero(persona.getCod_uni_canero());
        personaDb.setEstado(persona.getEstado());
        return personaService.save(personaDb);
    }
}
