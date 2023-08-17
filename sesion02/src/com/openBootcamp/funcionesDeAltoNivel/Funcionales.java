package com.openBootcamp.funcionesDeAltoNivel;

import java.util.function.Function;

public class Funcionales {
    // 1. Función de Alto Nivel (declarada como una variable)
    private Function<String, String> toMayus = (x) -> x.toUpperCase();
    private Function<Integer, Integer> sumador = (x) -> x.sum(x, x);

    public void pruebasFunciones() {
        // invocamos a una función que llama a otra función
        Saluda(toMayus, "Luis");

        // llamamos a la función con el método apply
        System.out.println(toMayus.apply("Pedro"));
        System.out.println(sumador.apply(5));
    }

    public void Saluda(Function<String, String> miFuncion, String nombre){
        miFuncion.apply(nombre);
    }
}
