package com.openbootcamp.adapter;

public class PowerAdapter implements Enchufable {
    public Lightbuld lightbuld = new Lightbuld();

    // implementamos las funciones de la interfase
    @Override
    public void enciende() {
        lightbuld.turnOn(220);
    }

    @Override
    public void apaga() {
        lightbuld.turnOff();
    }

    @Override
    public boolean estaEnchufado() {
        return lightbuld.isPoweredOn();
    }
}
