package com.openbootcamp.patronesCreacionales.prototype;

public class Main {

    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.marca = "Ford";
        coche.modelo = "Mustang";
        coche.puertas = 4;

        Moto moto = new Moto();
        moto.marca = "Honda";
        moto.modelo = "Tornado";
        moto.anio = 2021;

        System.out.println(coche.marca + " " + coche.modelo + " " + coche.puertas);

        // Clonamos un coche
        Coche cocheClonado = coche.clonar();
        cocheClonado.puertas = 5;
        System.out.println(cocheClonado.marca + " " + cocheClonado.modelo + " " + cocheClonado.puertas);

        System.out.println(moto.marca + " " + moto.modelo + " " + moto.anio);

        try {
            Moto motoClonada = moto.clonar();
            motoClonada.anio = 2022;
            System.out.println(motoClonada.modelo + " " + motoClonada.modelo + " " + motoClonada.anio);
        } catch (CloneNotSupportedException e) {
            System.out.println("No se puede clonar: " + e.getMessage());
        }
    }
}
