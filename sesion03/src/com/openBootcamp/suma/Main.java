package com.openBootcamp.suma;

import static com.openBootcamp.suma.SumaIterativa.sumaIterativa;
import static com.openBootcamp.suma.SumaRecursiva.sumaRecursiva;
import static com.openBootcamp.suma.SumaFuncional.sumaFuncional;

public class Main {

    public static void main(String[] args) {
        System.out.println("Suma iterativa: " + sumaIterativa(5));
        System.out.println("Suma recursiva: " + sumaRecursiva(5));
        System.out.println("Suma funcional: " + sumaFuncional(5));
    }
}
