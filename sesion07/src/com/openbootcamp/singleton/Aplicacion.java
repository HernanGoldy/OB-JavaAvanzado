package com.openbootcamp.singleton;

public class Aplicacion {

    // atributos (características)
    boolean isRunning = false;

    // métodos/funciones (comportamientos)
    public void run() {

        if (!isRunning) {
            isRunning = true;
        }
    }
}
