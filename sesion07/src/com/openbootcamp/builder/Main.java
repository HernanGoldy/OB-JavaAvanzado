package com.openbootcamp.builder;

public class Main {

    public static void main(String[] args) {

        /*
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMarca("Prius");
        vehiculo.setMarca("Combustión");
        vehiculo.setMotor("Diesel");
        vehiculo.setPuertas(5);
        */

        Vehiculo coche = new CocheBuilder("Prius")
                .setPuertas(5)
                .setMotor("Diesel")
                .build();

        StringBuilder cadena = new StringBuilder("Hola");
        cadena.append(" amigos").append(" del").append(" curso");
        System.out.println(cadena);

        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Puertas: " + coche.getPuertas());
        System.out.println("Motor: " + coche.getMotor());
    }
}
