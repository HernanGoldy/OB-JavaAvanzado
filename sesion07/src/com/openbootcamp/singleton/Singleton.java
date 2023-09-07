package com.openbootcamp.singleton;

public class Singleton {

    // atributos (características)
    private static Singleton singleton;
    int contador;

    //constructor
    private Singleton() {}


    // métodos/funciones (comportamientos)
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton(); // devuelve una instancia de la clase Singleton
        }

        return singleton;
    }

    // getter/setter
    public int getContador() { return contador; }
    public void setContador(int contador) { this.contador = contador; }

}
