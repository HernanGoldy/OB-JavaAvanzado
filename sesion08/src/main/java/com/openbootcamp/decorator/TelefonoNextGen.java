package com.openbootcamp.decorator;

public class TelefonoNextGen extends TelefonoDecorator {
    public TelefonoNextGen(Telefono telefono) {
        super(telefono);
    }

    @Override
    public void crear() {
        super.crear();
        System.out.println("    -> nextgen: Tengo también 5G");
        System.out.println("    -> nextgen: Tengo también VoLTE");
    }
}
