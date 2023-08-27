package com.openbootcamp.singleton;

public class Aplicacion {

    // atributos (características)
    private static Aplicacion aplicacion;
    boolean isRunning = false;

    // métodos/funciones (comportamientos)
    public static Aplicacion getInstance() {
        if (aplicacion == null) {
            return aplicacion = new Aplicacion();
        }

        return aplicacion;
    }

    public void Run() {

        if (!isRunning) {
            System.out.println("Arrancando!");
            isRunning = true;
        } else {
            System.out.println("Ya estaba en ejecución!");
        }
    }
}
