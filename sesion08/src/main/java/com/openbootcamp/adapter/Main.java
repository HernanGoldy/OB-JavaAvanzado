package com.openbootcamp.adapter;

public class Main {
    public static void main(String[] args) {
        Horno horno = new Horno();
        Lampara lampara = new Lampara();
        PowerAdapter lightbuld = new PowerAdapter();

        enciende(horno);
        // enciende(lampara);
        enciende(lightbuld);

        System.out.println(estaEnchufado(horno));
        System.out.println(estaEnchufado(lampara));
        System.out.println(estaEnchufado(lightbuld));
    }

    // creo el envoltorio de los patrones
    public static void enciende(Enchufable enchufable) {
        enchufable.enciende();
    }

    public static void apaga(Enchufable enchufable) {
        enchufable.apaga();
    }

    public static boolean estaEnchufado(Enchufable enchufable) {
        return enchufable.estaEnchufado();
    }
}
