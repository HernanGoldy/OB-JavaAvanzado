package com.openbootcamp.patronesCreacionales.prototype;

public class Coche {

    // atributos (características)
    public String marca;
    public String modelo;
    public int puertas;

    // costructores
    public Coche() {}

    public Coche clonar() {
        Coche clon = new Coche(); // creo una instancia de mí mismo

        clon.marca = marca;
        clon.modelo = modelo;
        clon.puertas = puertas;

        return clon;
    }
}
