package com.openbootcamp.decorator;

public class TelefonoBasico implements Telefono {
    @Override
    public void crear() {
        System.out.println("Soy un teléfono. Tengo estas características: ");
        tengoGSM();
        tengoSMS();
    }

    // methods
    public void tengoGSM() {
        System.out.println("    -> básico: Tengo GSM");
    }

    public void tengoSMS() {
        System.out.println("    -> básico: Tengo SMS");
    }
}
