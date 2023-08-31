package com.openbootcamp.factory;

public class Main {

    public static void main(String[] args) {

        PrecioFactory precio = new PrecioFactory("España");
        System.out.println(precio.getPrecio());

        PrecioFactory precio2 = new PrecioFactory("USA");
        System.out.println(precio2.getPrecio());
    }
}
