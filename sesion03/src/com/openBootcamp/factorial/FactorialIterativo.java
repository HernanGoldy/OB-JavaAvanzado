package com.openBootcamp.factorial;

public class FactorialIterativo {

    public static void main(String[] args) {
        System.out.println(factorialIterativo(5));
    }

    public static int factorialIterativo(int numero) {
        int resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }
}
