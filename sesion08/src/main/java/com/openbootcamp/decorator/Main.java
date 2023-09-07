package com.openbootcamp.decorator;

public class Main {
    public static void main(String[] args) {
        // TelefonoBasico telBasico = new TelefonoBasico();
        // telBasico.crear();

        TelefonoInteligente ti = new TelefonoInteligente(new TelefonoBasico());
        ti.crear();

        TelefonoNextGen tng = new TelefonoNextGen(
                new TelefonoInteligente(
                        new TelefonoBasico()
                )
        );

        tng.crear();
    }
}
