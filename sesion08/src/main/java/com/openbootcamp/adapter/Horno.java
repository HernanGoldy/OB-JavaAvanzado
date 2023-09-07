package com.openbootcamp.adapter;

public class Horno implements Enchufable {
    boolean enchufado = false;

    // implementamos las funciones de la interfase
    @Override
    public void enciende() {
        enchufado = true;

        System.out.println("Horno encendido.");
    }

    @Override
    public void apaga() {
        enchufado = false;

        System.out.println("Horno apagado.");
    }

    @Override
    public boolean estaEnchufado() {
        return enchufado;
    }
}
