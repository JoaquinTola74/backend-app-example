package com.oap.backend_crud.entity;

import jakarta.persistence.*;
import java.text.DateFormat;

@Entity
@Table(name="persona")
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

    public Persona() {
    }

    public Persona(Integer id, String ci, Integer expedido, String nombre, String ap_paterno, String ap_materno, String celular, String cod_uni_canero, String estado) {
        this.id = id;
        this.ci = ci;
        this.expedido = expedido;
        this.nombre = nombre;
        this.ap_paterno = ap_paterno;
        this.ap_materno = ap_materno;

        this.celular = celular;
        this.cod_uni_canero = cod_uni_canero;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public String getCi() {
        return ci;
    }

    public Integer getExpedido() {
        return expedido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAp_paterno() {
        return ap_paterno;
    }

    public String getAp_materno() {
        return ap_materno;
    }



    public String getCelular() {
        return celular;
    }

    public String getCod_uni_canero() {
        return cod_uni_canero;
    }

    public String getEstado() {
        return estado;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setExpedido(Integer expedido) {
        this.expedido = expedido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }


    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setCod_uni_canero(String cod_uni_canero) {
        this.cod_uni_canero = cod_uni_canero;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
/*
* 1	id Primaria	int(11)			No	Ninguna		AUTO_INCREMENT	Cambiar Cambiar	Eliminar Eliminar
	2	ci	varchar(100)	utf8mb4_general_ci		No	Ninguna			Cambiar Cambiar	Eliminar Eliminar
	3	expedido Índice	int(11)			Sí	NULL			Cambiar Cambiar	Eliminar Eliminar
	4	nombre	varchar(255)	utf8mb4_general_ci		No	Ninguna			Cambiar Cambiar	Eliminar Eliminar
	5	ap_paterno	varchar(255)	utf8mb4_general_ci		Sí	NULL			Cambiar Cambiar	Eliminar Eliminar
	6	ap_materno	varchar(255)	utf8mb4_general_ci		No	Ninguna			Cambiar Cambiar	Eliminar Eliminar
	7	fecha_nac	date			Sí	NULL			Cambiar Cambiar	Eliminar Eliminar
	8	celular	varchar(100)	utf8mb4_general_ci		Sí	NULL			Cambiar Cambiar	Eliminar Eliminar
	9	cod_uni_canero	varchar(10)	utf8mb4_general_ci		Sí	NULL			Cambiar Cambiar	Eliminar Eliminar
	10	estado	char(3)	utf8mb4_general_ci		Sí	NULL			Cambiar Cambiar	Eliminar Eliminar
	11	fecha_reg	datetime			Sí	NULL			Cambiar Cambiar	Eliminar Eliminar
	12	fecha_mod	datetime
*
* */