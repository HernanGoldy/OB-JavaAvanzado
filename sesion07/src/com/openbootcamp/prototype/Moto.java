package com.openbootcamp.prototype;

public class Moto implements Cloneable{
    // atributes
    public String marca;
    public String modelo;
    public int anio;

    // constructor
    public Moto() {}

    // si o si va esta excepción CloneNotSupportedException porque clone (parte de la interfaz Cloneable) devuelve un
    // tipo de dato object por lo que hay que hacer un cast
    public Moto clonar() throws CloneNotSupportedException {
        return (Moto)this.clone();
    }
}

