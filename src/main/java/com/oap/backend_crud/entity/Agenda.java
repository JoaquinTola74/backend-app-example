package com.oap.backend_crud.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Table(name="agenda")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tipo_actividad;
    private String descripcion;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime fecha;

    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_persona")
    @JsonIgnore
    private Persona persona;
}
