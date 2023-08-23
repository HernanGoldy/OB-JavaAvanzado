package com.openbootcamp.models;

// POJO (Plain Old Java Object): Modelo de datos.

public class Bootcamper {

    // atributos (características)
    private String nombre;
    private double valor;

    // constructores
    public Bootcamper() {}
    public Bootcamper(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    // getters and setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
}
