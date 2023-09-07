package com.openbootcamp.factory;

/*
Aquí implemento el patrón Factory.
 */

public class PrecioFactory {

    // atributos (características)
    Precio precio; // es una instancia

    // constructores
    private PrecioFactory() {};

    public PrecioFactory(String pais) {
        /*
        pais = España -> PrecioEUR
        pais != España -> PrecioUSD
        */

        if (pais.equalsIgnoreCase("España")) {
            System.out.println("España, precio en EUR");
            precio = new PrecioEUR();
        } else if (pais.equalsIgnoreCase("UK")) {
            System.out.println("UK, precio en GBP");
            precio = new PrecioGBP();
        }
        else {
            System.out.println("Otro país, precio en USD");
            precio = new PrecioUSD();
        }
    }

    // métodos/funciones (comportamientos)
    // para evitar tener que colocar en el main ".precio.getPrecio()" y solo colocar ".getPrecio()"
    public double getPrecio() {
        return precio.getPrecio();
    }
}
