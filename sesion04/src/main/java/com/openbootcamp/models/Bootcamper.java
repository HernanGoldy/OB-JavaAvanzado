package com.openbootcamp.models;

// POJO (Plain Old Java Object): Modelo de datos.

public class Bootcamper {

    // atributos (características)
    private String nombre;


    // constructores
    public Bootcamper() {}

    public Bootcamper(String nombre) {
        this.nombre = nombre;
    }


    // getters and setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}
