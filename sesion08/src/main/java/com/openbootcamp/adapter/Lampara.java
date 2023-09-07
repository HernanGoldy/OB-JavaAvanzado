package com.openbootcamp.adapter;

public class Lampara implements Enchufable {
    boolean enchufado = false;

    // implementamos las funciones de la interfase
    @Override
    public void enciende() {
        enchufado = true;

        System.out.println("Lámpara encendida.");
    }

    @Override
    public void apaga() {
        enchufado = false;

        System.out.println("Lámpara apagada.");
    }

    @Override
    public boolean estaEnchufado() {
        return enchufado;
    }
}
