package com.openBootcamp.factorial;

import static com.openBootcamp.factorial.FactorialFuncional.factorialFuncional;
import static com.openBootcamp.factorial.FactorialIterativo.factorialIterativo;
import static com.openBootcamp.factorial.FactorialRecursivo.factorialRecursivo;

public class Main {

    public static void main(String[] args) {
        System.out.println("Factorial iterativo: " + factorialIterativo(5));
        System.out.println("Factorial recursivo: " + factorialRecursivo(5));
        System.out.println("Factorial funcional: " + factorialFuncional(5));
    }
}
