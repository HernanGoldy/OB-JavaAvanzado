package com.openBootcamp.funcionesPuras;

public class FuncionPura {

    public static void main(String[] args) {

        int result1 = sumar(1, 2);
        int result2 = sumar(1, 2);
        System.out.println(result1 + " " + result2);
    }

    // Función Pura Básica
    public static int sumar(int a, int b) {
        return a + b;
    }
}
