package com.openbootcamp.singleton;

public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance(); // instancia de la clase Singleton
        singleton.setContador(15);

        Singleton singleton2 = Singleton.getInstance(); // instancia de la clase Singleton

        System.out.println("Valor " + singleton.getContador() + " en memoria: " + singleton);
        System.out.println("Valor " + singleton2.getContador() + " en memoria: " + singleton2);
    }
}
