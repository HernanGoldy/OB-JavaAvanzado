package com.openbootcamp.decorator;

public class TelefonoDecorator implements Telefono {
    private Telefono telefono;

    // constructor -> aquí implementamos la interfaz del patrón decorador
    public TelefonoDecorator(Telefono telefono) {
        this.telefono = telefono;
    }

    @Override
    public void crear() {
        this.telefono.crear();
    }
}
