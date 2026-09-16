package com.oap.backend_crud.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="persona")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ci;
    private Integer expedido;
    private String nombre;
    private String ap_paterno;
    private String ap_materno;
    private String celular;
    private String cod_uni_canero;
    private String estado;
}