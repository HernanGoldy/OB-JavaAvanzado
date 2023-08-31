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
        } else {
            System.out.println("Otro país, precio en USD");
            precio = new PrecioUSD();
        }
    }
}
