package com.openBootcamp.factorial;

public class FactorialRecursivo {

    public static void main(String[] args) {
        System.out.println(factorialRecursivo(5));
    }

    public static int factorialRecursivo(int numero) {

        if (numero == 0) {
            return 1;
        }

        return numero * factorialRecursivo(numero - 1); // recursividad por cola
    }
}
